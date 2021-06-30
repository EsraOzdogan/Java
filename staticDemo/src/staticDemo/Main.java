package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.name="mourse";
		product.price=50;
		productManager.add(product);
		
		
		DatabaseHelper.Crud.Delete();
	}

}
