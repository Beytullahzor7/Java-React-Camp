package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao; // dependency injection

	public ProductManager(ProductDao productDao) { //�uanda asla hibernateye ba�l� de�iliz ama hibernatenin referans�n� 
												   //tutabilen ve yeni c�kabilecek paketleri de buraya enjekte edebiliriz
		super();
		this.productDao = productDao;

	}

	@Override
	public void add(Product product) {
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor");
			return; // metod returnu g�rd��� anda a�a�� bakmaz mevcut metodu bitirir.
		}
		
		this.productDao.add(product);
		
	}

	@Override
	public List<Product> getAll() {

		return null;
	}

}
