package Entities.concretes;

public class Campaign {

	private String name;
	private double discountPercent;

	public Campaign(String name, double discountPercent) {
		super();
		this.name = name;
		this.discountPercent = discountPercent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

}
