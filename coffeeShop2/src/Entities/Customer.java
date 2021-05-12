package Entities;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private Long nationalityId;
	private int dateBirth;

	public Customer(int id, String firstName, String lastName, Long nationalityId, int dateBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateBirth = dateBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(Long nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(int dateBirth) {
		this.dateBirth = dateBirth;
	}

}
