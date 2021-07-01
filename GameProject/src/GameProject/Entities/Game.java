package GameProject.Entities;

public class Game {
	private int gameId;
	private String name;
	private int unitPrice;
	
	
	public Game() {
	}

	public Game(int gameId, String name, int unitPrice) {
		super();
		this.gameId = gameId;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	public int getId() {
		return gameId;
	}
	public void setId(int gameId) {
		this.gameId = gameId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

}
