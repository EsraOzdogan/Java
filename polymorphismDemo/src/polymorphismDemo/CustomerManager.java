package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("Customer added");
	
/*
     //Bu baðýmlýlýk yaptýðý için yukarýda constructor oluþturduk
		 DatabaseLogger logger = new DatabaseLogger();
		 logger.Log("Log mesajý");*/
		
		this.logger.log("Log mesajý: ");
	}

}
