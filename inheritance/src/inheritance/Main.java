package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "123";

		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber = "567";

		sendikaCustomer abc = new sendikaCustomer();
		abc.customerNumber = "890";

		CustomerManager customerManager = new CustomerManager();

		Customer[] customers = { engin, hepsiburada, abc };

		customerManager.addMultiple(customers);

	}

}
