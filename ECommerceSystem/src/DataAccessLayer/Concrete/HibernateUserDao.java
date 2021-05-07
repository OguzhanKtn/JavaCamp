package DataAccessLayer.Concrete;

import java.util.List;

import DataAccessLayer.Abstracts.UserDao;
import Entities.Concrete.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+ "adlý kullanýcý veritabanýna eklendi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+ "adlý kullanýcýnýn bilgileri güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+ "adlý kullanýcý veritabanýndan silindi.");
		
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
