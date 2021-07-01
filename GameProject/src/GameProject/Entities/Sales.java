package GameProject.Entities;

public class Sales {
	private int orderId;
	private int gameId;
	private int gamerId;
	private int campaignId;
	private double discount;
	
	public Sales() {
	}

	public Sales(int orderId, int gameId, int gamerId, int campaignId, double discount) {
		super();
		this.orderId = orderId;
		this.gameId = gameId;
		this.gamerId = gamerId;
		this.campaignId = campaignId;
		this.discount = discount;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getGamerId() {
		return gamerId;
	}
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
