package GameProject.Concrete;

import GameProject.Abstract.CampaignService;
import GameProject.Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Added " + campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Deleted " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Updated " + campaign.getCampaignName());
		
	}

}
