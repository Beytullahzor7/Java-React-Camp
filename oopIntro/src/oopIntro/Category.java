package oopIntro;

public class Category {
	private int id; // private = dýsardan eriþim yasak
	private String name; // Firstly FIELD

	public Category() { // Parametre olmadan da çalýþabilmesi için boþ bir constructor oluþturduk

	}

	public Category(int id, String name) { // Secondly CONSTRUCTOR
		this();
		this.id = id;
		this.name = name;
	}

	public int getId() { // Thýrdly METHODS
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name+ "!";
	}

	public void setName(String name) {
		this.name = name;
	}

}
