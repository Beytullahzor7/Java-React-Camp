package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products") // veritabanında hangi tabloya karsılık geldiği bilgisi
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;

	//@Column(name = "category_id")
	//private int categoryId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "unit_price")
	private double unitPrice;

	@Column(name = "units_in_stock")
	private short unitInStock;
	 
	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;	
	
	@ManyToOne() //suan product içerisindeyiz ve bir kategori bu tablo içerisinde birden fazla tekrar edebilir
				 //önce oldugumuz yer sonra gitmek istediğimizyer yazılır ve bunu category_id üzerinden joini gerçekleştirecek
	@JoinColumn(name= "category_id") //hangi column ile ilişkilendirilecek
	private Category category;

}
