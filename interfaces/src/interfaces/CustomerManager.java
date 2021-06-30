package interfaces;

public class CustomerManager {
	
	//Tek loglama
	
/*	//Dependency Injection
	//C#da _logger oluyordu
	private Logger logger;
	
	public CustomerManager(Logger logger) {
		this.logger = logger;
	}

	//loosly-tightly coupled(gev�ek ve kat� bagl�)
	public void add(Customer customer) {
		System.out.println("Customers added " + customer.getFirstName());
		
		
		
	//Before Dependency �njection	
	/*	//Buras� kat� ba�l� oldu ileride FileManager ile dosyaya da loglanabilir bir�ok kodun de�i�tirilmesi laz�m.
		//O y�zden de�i�tiriyoruzkodu Dependency Injection Tasar�m Deseni-Yukar�da neye ba�l� isek private olarak tan�mlay�p
		//islem yap�yoruz
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
	
	//Bir tane loglama degil de birden cok loglama yapmak istiyorsak array yap�cazz
	
	
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
