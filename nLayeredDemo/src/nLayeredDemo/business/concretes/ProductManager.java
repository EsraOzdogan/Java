package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	//injection
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		//iþ kodlarý
		if(product.getCategoryId()==1) {
			System.out.println("No product accepted in this category");
			return;
		}
		
	/* DataAccesse katý baðlý gevsek baglý yapýlmasý lazým. Hibernate'e bagýmlýlýk olamamsý lazým.
	 * 	HibernateDao dao = new HibernateDao();
		dao.add(product);*/
		this.productDao.add(product);
		this.loggerService.logToSystem("Product added " + product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
