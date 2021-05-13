package business.concretes;

import Entities.concretes.Sale;
import business.abstracts.ISaleService;

public class SaleManager implements ISaleService {

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getPlayer().getFirstNameString() + sale.getPlayer().getLastName() + " ki�isine "
				+ sale.getGame().getGameName() + " adl� oyun "
				+ (sale.getGame().getPrice()
						- sale.getGame().getPrice() * (sale.getCampaign().getDiscountPercent() / 100))
				+ " TL kar��l�g�nda sat�ld�");

	}

}
