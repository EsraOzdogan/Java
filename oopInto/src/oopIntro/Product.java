package oopIntro;

//�zellik tutan s�n�f
public class Product {
//final sadece constructor da set edilebilir demek
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;  //indirim oran�
	//private double unitPriceAfterDiscount;  //indirimden sonraki fiyat
	
	//1 constructor �al��mak zorunda, birden fazla constructor varsa sadece biri
	
	
	//ilk imzadaki default olarak �al���r ama asl�nda yayz�lmas�na gerek yoktur
	public Product(){                 
		System.out.println("Ben �al��t�m");
	};
	
	
	//overloading
	//�kinci parametre alan imza i�in constructor bu �al���r
	public Product(int id, String name, double unitPrice, String detail, double discount/*, double unitPriceAfterDiscount*/) { 
		this(); // super(); //default constructor'� da �al��t�r�yor.
		this.id=id;
		this.name=name;
		this.detail=detail;
		this.unitPrice=unitPrice;
		this.discount = discount;
		//this.unitPriceAfterDiscount= unitPriceAfterDiscount;
	}

//encapsulation
	//C#'da property
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice * this.discount/100);
	}
	
}
