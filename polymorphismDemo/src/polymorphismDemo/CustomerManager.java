package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("Customer added");
	
/*
     //Bu ba��ml�l�k yapt��� i�in yukar�da constructor olu�turduk
		 DatabaseLogger logger = new DatabaseLogger();
		 logger.Log("Log mesaj�");*/
		
		this.logger.log("Log mesaj�: ");
	}

}
