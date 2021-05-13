package business.concretes;

import Entities.concretes.Campaign;
import business.abstracts.ICampaignService;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		if (campaign.getDiscountPercent() < 0 && campaign.getName().length() < 2) {
			System.out.println("Kampanya bilgilerinizi kontrol ediniz");
		} else {
			System.out.println(campaign.getName() + " adl� kampanya " + "%" + campaign.getDiscountPercent()
					+ " indirim tutar�yla uyguland�");

		}

	}

	@Override
	public void delete(Campaign campaign) {
		if (campaign.getDiscountPercent() < 0 && campaign.getName().length() < 2) {
			System.out.println("Kampanya bilgilerinizi kontrol ediniz");
		} else {
			System.out.println(campaign.getName() + "adl� kampanya ba�ar� ile silindi");

		}

	}

	@Override
	public void update(Campaign campaign) {
		if (campaign.getDiscountPercent() < 0 && campaign.getName().length() < 2) {
			System.out.println("Kampanya bilgilerinizi kontrol ediniz");
		} else {
			System.out.println(campaign.getName() + "adl� kampanya " + "% " + campaign.getDiscountPercent()
					+ "indirim tutar�yla g�ncellendi");
		}

	}

}
