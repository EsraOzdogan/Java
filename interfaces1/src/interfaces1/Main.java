package interfaces1;

public class Main {

	public static void main(String[] args) {
		
		//ICustomerDal customerDal = new ICustomerDal();//interfaceler de abstracts�n�flar gibi newlenemez

		ICustomerDal customerDal = new OracleCustomerDal();//interface onu implemente eden class�n referans�n� tutabilir
	  
	/*	//polymormhism 1. Y�NTEM-Strateggy pattern ile
		CustomerManager customerManager = new CustomerManager();
		customerManager.customerDal =new OracleCustomerDal();
		///customerManager.add();  olmaz */
		
		
		//2. Y�NTEM
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
		
	}

}
