package interfaces;

public class CustomerManager {
	
	//Tek loglama
	
/*	//Dependency Injection
	//C#da _logger oluyordu
	private Logger logger;
	
	public CustomerManager(Logger logger) {
		this.logger = logger;
	}

	//loosly-tightly coupled(gevþek ve katý baglý)
	public void add(Customer customer) {
		System.out.println("Customers added " + customer.getFirstName());
		
		
		
	//Before Dependency ýnjection	
	/*	//Burasý katý baðlý oldu ileride FileManager ile dosyaya da loglanabilir birçok kodun deðiþtirilmesi lazým.
		//O yüzden deðiþtiriyoruzkodu Dependency Injection Tasarým Deseni-Yukarýda neye baðlý isek private olarak tanýmlayýp
		//islem yapýyoruz
	//	DatabaseLogger logger = new DatabaseLogger();
	//	logger.log(customer.getFirstName() + " logger to database");
		
		
		//After Dependency Injection
		this.logger.log(customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Customers deleted " + customer.getFirstName());
		
		///*DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + " logger to database");

	}
	
	*/
	
	
	///Birden cok loglama
	
	//Bir tane loglama degil de birden cok loglama yapmak istiyorsak array yapýcazz
	
	
    private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Customers added " + customer.getFirstName());
		
		
	//Before Utils 
		
	/*	for(Logger logger: loggers) {
			logger.log(customer.getFirstName());
		}*/
		
	//After Utils
		//Before static
		
		/*Utils utils = new Utils();
		utils.runLoggers(loggers, customer.getFirstName());*/
		
		//After static

		Utils.runLoggers(loggers, customer.getFirstName());


	}
	
	public void delete(Customer customer) {
		System.out.println("Customers deleted " + customer.getFirstName());
		/*for(Logger logger: loggers) {
			logger.log(customer.getFirstName());
		}**/
		
		
		Utils.runLoggers(loggers, customer.getLastName());

	}
	
}
