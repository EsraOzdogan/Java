package staticDemo;

public class ProductManager {
	/*public void add(Product product) {
		ProductValidator productValidator= new ProductValidator();
		if(productValidator.isValid(product)) {
			System.out.println("Added to database");
		}else {
			System.out.println("Product info is not valid");
		}
	}*/
	
	//Utilitylerde 
	public void add(Product product) {
		//newlemeden kulanmak i�in fonksiyonu static yapmam�z laz�m
		if(ProductValidator.isValid(product)) {
			System.out.println("Added to database");
		}else {
			System.out.println("Product info is not valid");
		}
	}

}
