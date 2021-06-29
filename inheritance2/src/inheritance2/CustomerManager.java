package inheritance2;

public class CustomerManager {
	/*public void add(IndividualCustomer customer) {
		System.out.println(customer.customerNumber+ " kaydedildi");
	}
	public void add(CorporateCustomer customer) {
		System.out.println(customer.customerNumber+ " kaydedildi");
	}*/
	
	//polymorphism-tek methodla iki customer çeþiti de çalýþtý
	public void add(Customer customer) {
		System.out.println(customer.customerNumber+ " kaydedildi");
	}
	
	
	//Ayný anda birçok müþteri eklemeye çalýsýyorum
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer: customers) {
			add(customer);
		}
	}
}
