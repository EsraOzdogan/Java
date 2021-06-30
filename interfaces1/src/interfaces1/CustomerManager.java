package interfaces1;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	//2. y�ntem
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	//1. y�ntem strategy
	public void add() {
		//i� kodlar�
		customerDal.add();
		
	}

}
