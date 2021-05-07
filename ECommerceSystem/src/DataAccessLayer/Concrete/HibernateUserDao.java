package DataAccessLayer.Concrete;

import java.util.List;

import DataAccessLayer.Abstracts.UserDao;
import Entities.Concrete.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+ "adl� kullan�c� veritaban�na eklendi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+ "adl� kullan�c�n�n bilgileri g�ncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+ "adl� kullan�c� veritaban�ndan silindi.");
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
