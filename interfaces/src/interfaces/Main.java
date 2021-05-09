package interfaces;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer(1, "Beytullah", "Zor");

		Logger[] loggers = { new EmailLogger(), new SmsLogger(), new FileLogger() };

		CustomerManager customerManager = new CustomerManager(loggers);

		customerManager.add(customer1);

	}

}
