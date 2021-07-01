package CoffeeShop;

import CoffeeShop.Abstract.BaseCustomerManager;
import CoffeeShop.Adapters.MernisServiceAdapter;
import CoffeeShop.Concrete.CustomerCheckManager;
import CoffeeShop.Concrete.NeroCustomerManager;
import CoffeeShop.Concrete.StarbucksCustomerManager;
import CoffeeShop.Entities.Customer;

public class Main {

	public static void main(String[] args) {
	/*	 BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
         customerManager.save(new Customer {1,"Esra", "�zdo�an", 1998, "1556546564" });

      */   
         Customer customer = new Customer(1,"Esra", "�zdo�an", 1998, "5284562354");
         
        //BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new CustomerCheckManager());   
        // BaseCustomerManager customerManager1 = new NeroCustomerManager(new MernisServiceAdapter());   
         BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());   

         
         try {
        	 customerManager1.save(customer);
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
         
	}

}
