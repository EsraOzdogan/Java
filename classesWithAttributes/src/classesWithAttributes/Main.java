package classesWithAttributes;


public class Main {

	public static void main(String[] args) {
		
/*
       //Before Encapsulation
		Product product = new Product();
		product.name="Laptop";
		product.id=1;
		product.description = "Asus Laptop";
		product.price=5000;
		product.stockAmount=3;
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
	    System.out.println(product.name);
	    
	    
	    */
	    
	    
	    //After Encapsulation

		//default coonstructor
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
	    System.out.println(product.getCode());
	    
	    //parametreli constructor
		Product product1 = new Product(1,"Laptop","Asus Laptop",5000,3,"blue");

	}

}
