package GameProject.Concrete;

import GameProject.Abstract.SaleService;
import GameProject.Entities.Campaign;
import GameProject.Entities.Game;
import GameProject.Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game) {
       System.out.println("'" + gamer.getFirstName() + " " + gamer.getLastName() + "'" + " purchased the game named " + "'" + game.getName());		
	}

	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
	       System.out.println("'" + gamer.getFirstName() + " " + gamer.getLastName() + "'" + " purchased the game named " + "'" + game.getName()+ "' with " +  game.getUnitPrice() * campaign.getCampaignDiscount()/100 + " % discount");		
		
	}

}
