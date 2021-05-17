package eCommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.GoogleService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

	private List<String> emailList = new ArrayList<String>();
	private List<String> passwordList = new ArrayList<String>();

	private UserDao userDao;
	private GoogleService googleService;

	public UserManager(UserDao userDao, GoogleService googleService) {

		super();
		this.userDao = userDao;
		this.googleService = googleService;
	}

	public static boolean isEmailValid(String email) {

		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(email);

		return matcher.matches();
	}

	public static boolean isEmailValidOnClick(String email) {
		return true;

	}

	@Override
	public void register(User user) {

		// parola kontrol
		if (user.getPassword().length() < 6 || user.getPassword() == null) {
			System.out.println("Parolan�z en az 6 karakterden olu�mal�d�r");
			return;
		}
		// var olan email kullan�m�
		if (emailList.contains(user.getEmail())) {
			System.out.println("Bu email daha �nce kullan�ld�");
			return;
		}

		// ad ve soyad en az 2 karakter i�ermeli
		if (user.getFirstName().length() < 3 || user.getLastName().length() < 3) {
			System.out.println("Ad ve soyad en az 2 karakterden olu�mal�d�r");
			return;

		} else {
			System.out.println("Do�rulama linki g�nderildi l�tfen kontrol ediniz " + user.getEmail());

		}

		if (isEmailValidOnClick(user.getEmail())) {
			System.out.println("Kay�t i�lemi tamamland�");
			emailList.add(user.getEmail());
			passwordList.add(user.getPassword());
			this.userDao.add(user);
			this.googleService.registerToSystem(null);

		} else {
			System.out.println("Emailinizi kontrol ediniz ve hesab�n�z� dogrulay�n�z");
		}

	}

	@Override
	public void login(String email, String password) {

		if (emailList.contains(email) && passwordList.contains(password)) {
			System.out.println("Sisteme Giri� Ba�ar�l�");
			
		} else {
			System.out.println("Email yada Parolan�z� Kontrol Ediniz");
		}

	}

}
