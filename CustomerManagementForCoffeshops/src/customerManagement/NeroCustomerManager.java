package customerManagement;

import java.rmi.RemoteException;

public class NeroCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;
	
	public  NeroCustomerManager (ICustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void Save(Customer customer) throws RemoteException {
		
		if (customerCheckService.CheckIfRealPerson(customer)) {
			
			System.out.println("Saved to db : " + customer.getFirstName());
		}
		else
			System.out.println("Not a valid person");
	}
	
}
