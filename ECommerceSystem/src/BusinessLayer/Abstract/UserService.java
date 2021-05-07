package BusinessLayer.Abstract;

import java.util.List;

import Entities.Concrete.User;

public interface UserService {

	void register(User user);
	void logIn(User user);
	boolean alreadyInSystem(User user, List<String> emails);
}
