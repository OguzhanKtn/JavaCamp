package BusinessLayer.Concrete;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import BusinessLayer.Abstract.UserService;
import Core.Abstract.googleAuthService;
import DataAccessLayer.Abstracts.UserDao;
import Entities.Concrete.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private googleAuthService authService;
	private List<String> emails;
     
	public UserManager(UserDao userDao, List<String> emails,googleAuthService authService) {
		this.authService = authService;
		this.userDao = userDao;
		this.emails = emails;
	}

	@Override
	public void register(User user) {
		String mail= user.getEmail();
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        
        if(alreadyInSystem(user,emails)) {
        	System.out.println("This e-mail address is already registered in the system. ");
        }else {
		      if(matcher.matches() && user.getPassword().length()>=6 && user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
		    	  
			      System.out.println("Verification link has been sent");
			      Scanner validationMail= new Scanner(System.in);
			      int mailRespond= validationMail.nextInt();
			      
			      if(mailRespond==1234) {
			    	  this.userDao.add(user);
			      }else {
			    	  System.out.println("Verification is unsuccessful");
			      }
			
		   }else {
			   System.out.println("Hatalý deneme");
		   }
        }
	}

	@Override
	public void logIn(User user) {
		if(user.getEmail().isEmpty() && user.getPassword().isEmpty()) {
			System.out.println("Lütfen kullanýcý adý ve parolanýzý giriniz");
		}else {
			System.out.println("Hoþ geldiniz");
		}
		
	}
	
	public void logInWithGoogle(googleAuthService authService) {
		authService.logIn();
	}

	@Override
	public boolean alreadyInSystem(User user, List<String> emails) {
		// TODO Auto-generated method stub
		return false;
	}

}
