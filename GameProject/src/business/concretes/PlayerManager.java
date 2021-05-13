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
			System.out.println("�ye eklendi " + player.getFirstNameString() + " " + player.getLastName());
		} else {
			System.out.println("�ye Bilgileri Hatal�");
		}

	}

	@Override
	public void delete(Player player) {
		System.out.println("Player Silindi");

	}

	@Override
	public void update(Player player) {
		if (playerCheckService.CheckIfRealPlayer(player)) {
			System.out.println("Bilgiler G�ncellendi " + player.getFirstNameString() + " " + player.getLastName());
		} else {
			System.out.println("Bilgiler Hatal�");
		}

	}

}
