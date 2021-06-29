package classesWithAttributes;

//özellik sýnýfý
public class Product {
	
	public Product() {
		System.out.println("Default constructor ran");
	}
	
	//Sadece bu parametreli imza ile çalýþýr
	public Product(int id,String name,String description,double price,int stockAmount,String colour ) {
		System.out.println("Default constructor ran");
		this.id=id;
		this.name=name;
		this.colour=colour;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
	}
	
	//Attribute veya field denilir
	private int id; //default'u public,C#da default olarak private'dýr farklarýndan biri bu.Private sadece tanýmlandýðý blokta geçerlidir.Burda biz private yaptýk ama
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String colour;
	private String code;
	
	
	//SOLID 
	//S:Single responsibility(Tek sorumluluk prensibi):Bir class sadece bir iþi yapar,bir method sadece bir iþi yapar

	//Yani Product sýnýfý hem özellik içerip hem de manager yani iþ kodlarýný, ürün operasyonlarýný içermemeli

	//getter
	//okuma-read only
	public int getId() {
		return id;
	}
	
	//setter
	//ayarlama-kurma
	public void setId(int id) {
		//_id=id;  ayný þey
		//this._id=id;
		this.id=id;  //this bulunduðu classtaki id,_id field id'si demek
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCode() {
		return this.name.substring(0,1)+id;
	}

	//Kodu yazýlabilir, deðiþtirilebilir istemiyorum
	/*public void setCode(String code) {
		this.code = code;
	}*/


	
}
