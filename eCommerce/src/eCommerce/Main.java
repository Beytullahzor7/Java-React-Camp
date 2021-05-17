package eCommerce;

import eCommerce.business.concretes.UserManager;
import eCommerce.core.GoogleRegisterAdapter;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleRegisterAdapter());

		User user1 = new User(1, "Beytullah", "Zor", "beytullahzor7@gmail.com", "123456");
		
		userManager.register(user1);
		userManager.login("beytullahzor7@gmail.com", "123456");

	}

}
