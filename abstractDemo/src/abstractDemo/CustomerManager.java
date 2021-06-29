package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		
		/*//Bağımlı oldu biz bunu strateji deseniyle çözüyoruz
		OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
		oracleDatabaseManager.getClass();*/
		
		
		databaseManager.getData();
	}

}
