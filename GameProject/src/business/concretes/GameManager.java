package business.concretes;

import Entities.concretes.Game;
import business.abstracts.IGameService;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		if (game.getPrice() < 0 && game.getGameName().length() <= 2) {
			System.out.println("Fiyat veya �sim Bilgisini Yanl�� Girdiniz");
		} else {
			System.out.println("Ekleme i�lemi ba�ar�l� " + game.getGameName());
		}

	}

	@Override
	public void delete(Game game) {
		if (game.getPrice() < 0 && game.getGameName().length() <= 2) {
			System.out.println("Fiyat veya �sim Bilgisini Yanl�� Girdiniz");
		} else {
			System.out.println("Silme i�lemi ba�ar�l� " + game.getGameName());
		}

	}

	@Override
	public void update(Game game) {
		if (game.getPrice() < 0 && game.getGameName().length() <= 2) {
			System.out.println("Fiyat veya �sim Bilgisini Yanl�� Girdiniz");
		} else {
			System.out.println("G�ncelleme ��lemi Ba�ar�l� " + game.getGameName());
		}

	}

}
