package interfaces1;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	//2. yöntem
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	//1. yöntem strategy
	public void add() {
		//iþ kodlarý
		customerDal.add();
		
	}

}
