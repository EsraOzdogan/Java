package GameProject.Abstract;

import GameProject.Entities.Campaign;
import GameProject.Entities.Game;
import GameProject.Entities.Gamer;

public interface SaleService {
    void sale(Gamer gamer, Game game);
    void campaignSale(Gamer gamer, Game game, Campaign campaign);
}
