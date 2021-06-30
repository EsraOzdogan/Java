package oopIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
/*1.    String[] products = {
				"Lenovo V14",
				"Lenovo V15",
				"Hp 5"
		};*/
		
		
/*2.		//String Product sýnýfý oldu
		//Ýlk imza
        Product product1 = new Product(); //örnek oluþturma, referans oluþturma, intance oluþturma,bellekte oluiuyor-deafult olarak oluþturuyor
		product1.id=1;
		product1.name="Lenovo V14";
		product1.unitPrice=1500;
		product1.detail="16 GB Ram";
		
		Product product2 = new Product(); 
		product2.id=1;
		product2.name="Lenovo V15";
		product2.unitPrice=1500;
		product2.detail="32 GB Ram";
		
		Product product3 = new Product(); 
		product3.id=1;
		product3.name="Hp 5";
		product3.unitPrice=10000;
		product3.detail="8 GB Ram";
		
		
		Product[] products = {product1,product2, product3};
		
		for (Product product: products) {       //Product veri türü
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";
		
		
		//Ýkinci imza
		Product product4 = new Product(1,"Lenovo V14", 15000, "16 GB Ram");
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);

	*/
		//3.Encapsulation get set ile birlikte
		Product product5 = new Product(1,"Lenovo V14", 15000, "16 GB Ram", 10);
		
		//fieldlar private olunca set ve get il parametre ili veriliyor artýk
		Product product6 = new Product();
		product6.setId(2);
		product6.setName("Lenovo V15");
		product6.setDetail("16 Gb Ram");
		product6.setDiscount(10);
		product6.setUnitPrice(16000);
		
		System.out.println(product6.getUnitPriceAfterDiscount());
		
		
/*4.	  //Bunun için encapsulation yapýlýyor yani birçpk defa categorynamelerin sonuna  ! iþareti mi koyucaz yani hayýr set ile fonksiyonla düzelticez
		//set get yapýnca burasý çalýmýycak set ve get ile parametre olarak vericez
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Ýcecek";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Yiyecek";

		System.out.println(category1.name + "!");
		System.out.println(category2.name + "!");
*/
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýcecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");

		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
	}

}
