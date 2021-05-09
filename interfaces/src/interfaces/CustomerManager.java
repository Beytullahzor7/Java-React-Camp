package interfaces;

public class CustomerManager {

	private Logger[] loggers; // neye bag�ml� isek onun private de�i�kenini yaz�yoruz

	public CustomerManager(Logger[] loggers) { // parametreli constructor olu�turduk main k�sm�nda parametre olmadan
												// art�k cal�samaz
		this.loggers = loggers; // this.logger bu s�n�fa aittir constructordan g�nderdi�imiz logger art�k bu
								// s�n�fa ait oldu ve public void k�sm�nda loglama i�lemi i�in kullan�labildi.
	}

	// loosly - tightly coupled (customermanager loglamaya gevsek bag�ml�)
	public void add(Customer customer) {
		System.out.println("M��teri Eklendi " + customer.getFirstname());

		Utils.runLoggers(loggers, customer.getFirstname());

	}

	public void delete(Customer customer) {
		System.out.println("M��teri Silindi " + customer.getFirstname());

		Utils.runLoggers(loggers, customer.getLastName());

	}

}
