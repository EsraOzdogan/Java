package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		/*
		 //��erikleri farkl�
		 EmailLogger logger = new EmailLogger();
		logger.Log("Log mesaj�");
		*/
		//T�m loggerar BaseLogger t�r�nde
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(),  new DatabaseLogger(), new ConsoleLogger()};
		
		for(BaseLogger logger :loggers) {
			logger.log("Log mesaj�");
		}
		
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
		CustomerManager customerManager2 = new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
