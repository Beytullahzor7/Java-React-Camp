package interfaces;

public class Customer {
	private int id;
	private String firstname;
	private String lastName;

	public Customer() {

	}

	public Customer(int id, String firstname, String lastName) {
		super(); //e�er inherit edilen bir s�n�f varsa o s�n�f�n parametresiz constructorunu da cal�st�r.
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
