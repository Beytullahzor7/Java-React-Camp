package eCommerce.dataAccess.concretes;

import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Kullanıcı Basarıyla Eklendi " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı Bilgileri Güncellendi " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı Basarıyla Silindi " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
