package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		
		/*//Ba��ml� oldu biz bunu strateji deseniyle ��z�yoruz
		OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
		oracleDatabaseManager.getClass();*/
		
		
		databaseManager.getData();
	}

}
