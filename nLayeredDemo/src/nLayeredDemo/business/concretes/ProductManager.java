package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao; // dependency injection

	public ProductManager(ProductDao productDao) { //þuanda asla hibernateye baðlý deðiliz ama hibernatenin referansýný 
												   //tutabilen ve yeni cýkabilecek paketleri de buraya enjekte edebiliriz
		super();
		this.productDao = productDao;

	}

	@Override
	public void add(Product product) {
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return; // metod returnu gördüðü anda aþaðý bakmaz mevcut metodu bitirir.
		}
		
		this.productDao.add(product);
		
	}

	@Override
	public List<Product> getAll() {

		return null;
	}

}
