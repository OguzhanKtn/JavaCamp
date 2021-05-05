package Concrete;

import Entities.Member;
import Entities.Campaign;
import Entities.Game;

public class PurchasingManager {
	
	public void buyGame(Member member, Game game) {
		
		System.out.println(member.getFirstName()+" "+"adl� oyuncu "+ game.getName()+" "+"adl� oyunu "+ game.getUnitPrice()+" "+
	"TL'ye sat�n ald�.");
	}
	
	public void buyWithDiscount(Member member,Game game,Campaign campaign) {
		System.out.println(member.getFirstName()+" "+"adl� oyuncu "+ game.getName()+" "+"adl� oyunu % "+ campaign.getDiscount()+" "+
				"indirimle " + (game.getUnitPrice()-((game.getUnitPrice() * campaign.getDiscount())/100)+" "+ "TL'ye sat�n ald�."));
	}

}
