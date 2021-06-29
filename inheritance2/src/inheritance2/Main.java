package inheritance2;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer esra = new IndividualCustomer();
		esra.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "6789";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
		/*customerManager.add(esra);
		customerManager.add(hepsiBurada);
		customerManager.add(abc);*/
		
		Customer[] customers = {esra, abc, hepsiBurada};
		customerManager.addMultiple(customers);

		}
	
	//SOLID- O-Open Closed Principle-Sisteme yeni bir özellik eklendiginde
	//mevcutta bulunan hiçbir kodu deðiþtiremezsin sadece yeni kod ekleyebilirsin

}
