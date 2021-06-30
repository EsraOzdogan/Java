package interfaces1;


//Bir class birden fazla inrterfacei implemente edebilir ama sadece bir tane abstract sýnýfý extends edebilir
//Hem implemente hem de extends edilebilir   public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepository{  gibi 

//Interfaceler referans tutabilir
public class MySqlCustomerDal implements ICustomerDal, IRepository{  

	@Override
	public void add() {
		System.out.println("My sql added");		
	}

}
