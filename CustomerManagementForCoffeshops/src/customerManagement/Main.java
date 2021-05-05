package customerManagement;

import java.util.GregorianCalendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		
		 Customer customer = new Customer();
		 customer.setId(1);
		 customer.setFirstName("Oðuzhan");
		 customer.setLastName("Kotan");
		 customer.setDateofBirth (new GregorianCalendar(1992, 01 , 02).getTime());
		 customer.setNationalityId("36058924142");
	        
		
	
		
          BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
			customerManager.Save(customer);

	}

}
