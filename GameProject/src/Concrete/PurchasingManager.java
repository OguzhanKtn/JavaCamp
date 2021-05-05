package Concrete;

import Entities.Member;
import Entities.Campaign;
import Entities.Game;

public class PurchasingManager {
	
	public void buyGame(Member member, Game game) {
		
		System.out.println(member.getFirstName()+" "+"adlý oyuncu "+ game.getName()+" "+"adlý oyunu "+ game.getUnitPrice()+" "+
	"TL'ye satýn aldý.");
	}
	
	public void buyWithDiscount(Member member,Game game,Campaign campaign) {
		System.out.println(member.getFirstName()+" "+"adlý oyuncu "+ game.getName()+" "+"adlý oyunu % "+ campaign.getDiscount()+" "+
				"indirimle " + (game.getUnitPrice()-((game.getUnitPrice() * campaign.getDiscount())/100)+" "+ "TL'ye satýn aldý."));
	}

}
