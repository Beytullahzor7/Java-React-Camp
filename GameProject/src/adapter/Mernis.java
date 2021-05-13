package adapter;

import Entities.concretes.Player;
import business.abstracts.IPlayerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Mernis implements IPlayerCheckService {

	@Override
	public boolean CheckIfRealPlayer(Player player) {

		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();

		boolean result = false;
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),
					player.getFirstNameString().toUpperCase(), player.getLastName().toUpperCase(),
					player.getDateOfBirthDate().getYear());

		}

		catch (Exception e) {
			System.out.println("Üye Bilgileri Hatalý");
		}

		return result;

	}

}
