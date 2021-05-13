package business.concretes;

import Entities.concretes.Game;
import business.abstracts.IGameService;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		if (game.getPrice() < 0 && game.getGameName().length() <= 2) {
			System.out.println("Fiyat veya Ýsim Bilgisini Yanlýþ Girdiniz");
		} else {
			System.out.println("Ekleme iþlemi baþarýlý " + game.getGameName());
		}

	}

	@Override
	public void delete(Game game) {
		if (game.getPrice() < 0 && game.getGameName().length() <= 2) {
			System.out.println("Fiyat veya Ýsim Bilgisini Yanlýþ Girdiniz");
		} else {
			System.out.println("Silme iþlemi baþarýlý " + game.getGameName());
		}

	}

	@Override
	public void update(Game game) {
		if (game.getPrice() < 0 && game.getGameName().length() <= 2) {
			System.out.println("Fiyat veya Ýsim Bilgisini Yanlýþ Girdiniz");
		} else {
			System.out.println("Güncelleme Ýþlemi Baþarýlý " + game.getGameName());
		}

	}

}
