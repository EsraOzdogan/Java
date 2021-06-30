package interfaces;

public class Main {

	public static void main(String[] args) {
	
		//Tek loglama
		
		//Before Dependency Injection
		/*CustomerManager customeManager = new CustomerManager();
		
		Customer engin = new Customer(1, "Engin", "Demirog");
		customeManager.add(engin);

		
		//After Dependency Injection

        CustomerManager customeManager = new CustomerManager(new SmsLogger());
		
		Customer engin = new Customer(1, "Engin", "Demirog");
		customeManager.add(engin);*/
		
		//Birden fazla loglama
		
		Logger[] loggers = {new SmsLogger(), new FileLogger()};
		
        CustomerManager customeManager = new CustomerManager(loggers);
		
		Customer engin = new Customer(1, "Engin", "Demirog");
		customeManager.add(engin);

		
		
	}

}
