
import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.MemberManager;
import Concrete.PurchasingManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class Main {

	public static void main(String[] args) {
		
		Member member1 = new Member();
		
		member1.setId(12345);
		member1.setFirstName("oðuzhan");
		member1.setLastName("kotan");
		member1.setBirthOfYear(1992);
		member1.setNationalityId("11111111111");
		
		Game game1 = new Game();
		
		game1.setId(1);
		game1.setName("Age of Empires");
		game1.setUnitPrice(50);
		
		Campaign campaign1 = new Campaign();
		
		campaign1.setName("Yeni yýla özel");
		campaign1.setDiscount(10);
		
		MemberManager memberManager = new MemberManager(new MernisServiceAdapter());
		memberManager.add(member1);
		
		PurchasingManager purchasingManager = new PurchasingManager();
		purchasingManager.buyGame(member1, game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		purchasingManager.buyWithDiscount(member1, game1,campaign1);

	}

}
