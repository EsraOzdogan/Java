package interfaces1;

public class Main {

	public static void main(String[] args) {
		
		//ICustomerDal customerDal = new ICustomerDal();//interfaceler de abstractsýnýflar gibi newlenemez

		ICustomerDal customerDal = new OracleCustomerDal();//interface onu implemente eden classýn referansýný tutabilir
	  
	/*	//polymormhism 1. YÖNTEM-Strateggy pattern ile
		CustomerManager customerManager = new CustomerManager();
		customerManager.customerDal =new OracleCustomerDal();
		///customerManager.add();  olmaz */
		
		
		//2. YÖNTEM
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
		
	}

}
