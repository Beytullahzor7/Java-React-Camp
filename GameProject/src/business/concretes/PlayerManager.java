package business.concretes;

import Entities.concretes.Player;
import business.abstracts.IPlayerCheckService;
import business.abstracts.IPlayerService;

public class PlayerManager implements IPlayerService {

	IPlayerCheckService playerCheckService;

	public PlayerManager(IPlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if (playerCheckService.CheckIfRealPlayer(player)) {
			System.out.println("Üye eklendi " + player.getFirstNameString() + " " + player.getLastName());
		} else {
			System.out.println("Üye Bilgileri Hatalý");
		}

	}

	@Override
	public void delete(Player player) {
		System.out.println("Player Silindi");

	}

	@Override
	public void update(Player player) {
		if (playerCheckService.CheckIfRealPlayer(player)) {
			System.out.println("Bilgiler Güncellendi " + player.getFirstNameString() + " " + player.getLastName());
		} else {
			System.out.println("Bilgiler Hatalý");
		}

	}

}
