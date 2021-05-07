package Core.Concrete;

import Core.Abstract.googleAuthService;
import Entities.Concrete.User;
import GoogleAuth.googleAuthManager;

public class googleAuthAdapter implements googleAuthService{

	

	@Override
	public void logIn() {
		googleAuthManager manager = new googleAuthManager();
		manager.login();
		
	}

}
