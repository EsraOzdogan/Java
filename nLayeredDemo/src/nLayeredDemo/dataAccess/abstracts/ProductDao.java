package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	//Product[] getAll(); //ürün listesi ArrayList ya da ArrayListin base'i olana List generici kullanýlýr
	List<Product> getAll();

}
