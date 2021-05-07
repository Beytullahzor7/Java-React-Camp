package oopIntro;

public class Category {
	private int id; // private = d�sardan eri�im yasak
	private String name; // Firstly FIELD

	public Category() { // Parametre olmadan da �al��abilmesi i�in bo� bir constructor olu�turduk

	}

	public Category(int id, String name) { // Secondly CONSTRUCTOR
		this();
		this.id = id;
		this.name = name;
	}

	public int getId() { // Th�rdly METHODS
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
