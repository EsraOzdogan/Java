package GameProject;

import GameProject.Abstract.BaseGamerManager;
import GameProject.Adapters.MernisServiceAdapter;
import GameProject.Concrete.CampaignManager;
import GameProject.Concrete.GameManager;
import GameProject.Concrete.GamerManager;
import GameProject.Concrete.SaleManager;
import GameProject.Entities.Campaign;
import GameProject.Entities.Game;
import GameProject.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
        Gamer gamer = new Gamer(1,"Esra", "Özdoðan", 1998, "52684563254");

        BaseGamerManager gamerManager = new GamerManager(new MernisServiceAdapter());   

        
        try {
        	gamerManager.add(gamer);
        	gamerManager.update(gamer);
        	gamerManager.delete(gamer);

		} catch (Exception e) {
			e.printStackTrace();
		}
        
        Game game = new Game(1,"GTA", 2500);

        
        GameManager gameManager = new GameManager ();
        gameManager.add(game);
        gameManager.delete(game);
        gameManager.update(game);
        
        
        Campaign campaign = new Campaign(1, "Discount on game", 25);
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);
        campaignManager.delete(campaign);
        campaignManager.update(campaign);
        
        
        SaleManager saleManager = new SaleManager();
        saleManager.campaignSale(gamer, game, campaign);
        saleManager.sale(gamer, game);
	}

}
