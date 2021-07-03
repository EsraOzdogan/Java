package nLayeredDemo;

import java.util.ArrayList;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		/*//array belirlenmisse 5.indisine veri atayamazs�n.Bunun yerine dinamik yap�l� ArrayList kullan�l�r
		int[] numbers = {1,2,3,4,5};
		numbers[5]=6;
		
		//Generic yap�l� arraylist
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.add(1);
		numbers2.add(3);*/
		
		
		//ToDo: SpringIoC ile ��z�lecek
		
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		Product product = new Product(1,2,"Apple",12,50);
		productService.add(product);
	}

}
