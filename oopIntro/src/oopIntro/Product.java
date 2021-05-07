package oopIntro;

public class Product { // asl�nda bir class i�erisinde kendi veri tipimizi olusturuyoruz

	// encapsulation
	private int id; // final ifadesi sizin elemanlar�n�z� d��ardan eri�im noktas�nda k�s�tlar ama
					// final sadece constructor k�sm�nda set edilebilir
	private String name;
	private double unitPrice; // biz normalde main k�sm�nda product alt�nda yer alan alanlara eri�ebiliyorduk
								// ama bunlara private vererek sadece bu class i�erisinde kullan�labilir diyoruz
								// yani d��ar�dan benim class�ma ba�kas�n�n eri�ebilmesini private ile �nl�yoruz
								// Gercek bir projede �nce fieldlar�m�z� tan�ml�yoruz o fieldlar� private hale
								// getiriyoruz
	private String detail;
	private double discount;
	// getter and setter = get i�lemi sadece okuma set i�lemi ise yazma
	// gerektiren alanlard�r

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
