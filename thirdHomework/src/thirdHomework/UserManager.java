package thirdHomework;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " eklendi");
	}

	public void addMultiple(User[] users) { // bulk insert
		for (User user : users) {
			add(user);
		}

	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " silindi");
	}

	public void deleteMultiple(User[] users) {
		for (User user : users) {
			delete(user);
		}

	}

	public void update(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " Güncellendi : ");
	}

	public void updateMultiple(User[] users) {
		for (User user : users) {
			update(user);
		}

	}

	public void signIn(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + "  giriþ yaptý");
	}

	public void signinMultiple(User[] users) {
		for (User user : users) {
			signIn(user);
		}

	}

	public void logOut(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " çýkýþ yaptý");
	}

	public void logoutMultiple(User[] users) {
		for (User user : users) {
			logOut(user);
		}

	}

}
