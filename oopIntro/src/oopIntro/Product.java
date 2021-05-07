package oopIntro;

public class Product { // aslýnda bir class içerisinde kendi veri tipimizi olusturuyoruz

	// encapsulation
	private int id; // final ifadesi sizin elemanlarýnýzý dýþardan eriþim noktasýnda kýsýtlar ama
					// final sadece constructor kýsmýnda set edilebilir
	private String name;
	private double unitPrice; // biz normalde main kýsmýnda product altýnda yer alan alanlara eriþebiliyorduk
								// ama bunlara private vererek sadece bu class içerisinde kullanýlabilir diyoruz
								// yani dýþarýdan benim classýma baþkasýnýn eriþebilmesini private ile önlüyoruz
								// Gercek bir projede önce fieldlarýmýzý tanýmlýyoruz o fieldlarý private hale
								// getiriyoruz
	private String detail;
	private double discount;
	// getter and setter = get iþlemi sadece okuma set iþlemi ise yazma
	// gerektiren alanlardýr

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
