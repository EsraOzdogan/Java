package CoffeeShop.Concrete;

import java.net.MalformedURLException;

import CoffeeShop.Abstract.CustomerCheckService;
import CoffeeShop.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws MalformedURLException{
        return true;
    }
}