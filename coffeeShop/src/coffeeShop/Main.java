package coffeeShop;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import adapter.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1, "Beytullah", "Zor", LocalDate.of(1998, 12, 11), "123456"));

	}

}
