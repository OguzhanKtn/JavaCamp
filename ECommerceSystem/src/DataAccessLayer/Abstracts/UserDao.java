package DataAccessLayer.Abstracts;

import java.util.List;

import Entities.Concrete.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
}
