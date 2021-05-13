package gameProject;

import java.time.LocalDate;

import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.Player;
import Entities.concretes.Sale;
import adapter.Mernis;
import business.concretes.CampaignManager;
import business.concretes.GameManager;
import business.concretes.PlayerManager;
import business.concretes.SaleManager;

public class Main {

	public static void main(String[] args) {

		Player player1 = new Player();

		player1.setId(1);
		player1.setFirstNameString("Beytullah");
		player1.setLastName("Zor");
		player1.setNationalityId("123456789");
		player1.setDateOfBirthDate(LocalDate.of(1998, 12, 11));

		Game game1 = new Game(1, "Pes2021", 50);

		Campaign campaign1 = new Campaign("Bayram", 30);

		Sale sale1 = new Sale(0, player1, game1, campaign1);

		PlayerManager playerManager = new PlayerManager(new Mernis());
		playerManager.add(player1);

		GameManager gameManager = new GameManager();
		gameManager.add(game1);

		SaleManager saleManager = new SaleManager();
		saleManager.add(sale1);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);

	}

}
