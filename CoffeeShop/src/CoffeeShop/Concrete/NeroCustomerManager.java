package CoffeeShop.Concrete;

import CoffeeShop.Abstract.BaseCustomerManager;
import CoffeeShop.Abstract.CustomerCheckService;
import CoffeeShop.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
    CustomerCheckService customerCheckService;

    public NeroCustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }

    @Override
	public void save(Customer customer) throws Exception {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to (Nero) database : " + customer.getFirstName() + " " + customer.getLastName());
		} else {
			System.out.println(" The customer did not Save to Db, because... ");
			throw new Exception("WARNING! Not a valid person!");
		}
	}

}