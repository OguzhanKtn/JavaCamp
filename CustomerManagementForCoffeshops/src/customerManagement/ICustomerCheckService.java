package customerManagement;

import java.rmi.RemoteException;

public interface ICustomerCheckService {
	
	boolean CheckIfRealPerson(Customer customer) throws RemoteException;
}
