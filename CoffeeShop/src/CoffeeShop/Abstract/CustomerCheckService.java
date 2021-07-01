package CoffeeShop.Abstract;

import java.net.MalformedURLException;

import CoffeeShop.Entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer) throws MalformedURLException;
}
