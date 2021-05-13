package business.abstracts;

import Entities.concretes.Campaign;

public interface ICampaignService {

	public void add(Campaign campaign);

	public void delete(Campaign campaign);

	public void update(Campaign campaign);

}
