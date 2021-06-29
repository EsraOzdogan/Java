package inheritance2;

public class CustomerManager {
	/*public void add(IndividualCustomer customer) {
		System.out.println(customer.customerNumber+ " kaydedildi");
	}
	public void add(CorporateCustomer customer) {
		System.out.println(customer.customerNumber+ " kaydedildi");
	}*/
	
	//polymorphism-tek methodla iki customer �e�iti de �al��t�
	public void add(Customer customer) {
		System.out.println(customer.customerNumber+ " kaydedildi");
	}
	
	
	//Ayn� anda bir�ok m��teri eklemeye �al�s�yorum
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer: customers) {
			add(customer);
		}
	}
}
