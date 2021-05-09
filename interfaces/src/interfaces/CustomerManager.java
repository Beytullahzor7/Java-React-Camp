package interfaces;

public class CustomerManager {

	private Logger[] loggers; // neye bagýmlý isek onun private deðiþkenini yazýyoruz

	public CustomerManager(Logger[] loggers) { // parametreli constructor oluþturduk main kýsmýnda parametre olmadan
												// artýk calýsamaz
		this.loggers = loggers; // this.logger bu sýnýfa aittir constructordan gönderdiðimiz logger artýk bu
								// sýnýfa ait oldu ve public void kýsmýnda loglama iþlemi için kullanýlabildi.
	}

	// loosly - tightly coupled (customermanager loglamaya gevsek bagýmlý)
	public void add(Customer customer) {
		System.out.println("Müþteri Eklendi " + customer.getFirstname());

		Utils.runLoggers(loggers, customer.getFirstname());

	}

	public void delete(Customer customer) {
		System.out.println("Müþteri Silindi " + customer.getFirstname());

		Utils.runLoggers(loggers, customer.getLastName());

	}

}
