import BusinessLayer.Abstract.UserService;
import BusinessLayer.Concrete.UserManager;
import Core.Concrete.googleAuthAdapter;
import DataAccessLayer.Abstracts.UserDao;
import DataAccessLayer.Concrete.HibernateUserDao;
import Entities.Concrete.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(123,"Oðuzhan","Kotan","oguzhanktn@hotmail.com","Asd213313");
			
		UserService service = new UserManager(new HibernateUserDao(),null,new googleAuthAdapter());
		service.register(user1);
		
	}

}
