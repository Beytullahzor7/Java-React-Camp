package oopIntro;

public class Product { // aslında bir class içerisinde kendi veri tipimizi olusturuyoruz

	// encapsulation
	private int id; // final ifadesi sizin elemanlarınızı dışardan erişim noktasında kısıtlar ama
					// final sadece constructor kısmında set edilebilir
	private String name;
	private double unitPrice; // biz normalde main kısmında product altında yer alan alanlara erişebiliyorduk
								// ama bunlara private vererek sadece bu class içerisinde kullanılabilir diyoruz
								// yani dışarıdan benim classıma başkasının erişebilmesini private ile önlüyoruz
								// Gercek bir projede önce fieldlarımızı tanımlıyoruz o fieldları private hale
								// getiriyoruz
	private String detail;
	private double discount;
	// getter and setter = get işlemi sadece okuma set işlemi ise yazma
	// gerektiren alanlardır

	public Product() {

	}

	public Product(int id, String name, double unitPrice, String detail, double discount) {

		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);

	}

}
