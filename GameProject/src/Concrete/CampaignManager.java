package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Sisteme yeni kampanya eklendi : " + campaign.getName());

		
	}

	@Override
	public void update(Campaign campaign) {
		
	  System.out.println("Kampanya bilgileri g?ncellendi : " + campaign.getName()+" "+"indirim oran? : " + campaign.getDiscount());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" "+ "adl? kampanya sistemden silindi.");
		
	}

}
