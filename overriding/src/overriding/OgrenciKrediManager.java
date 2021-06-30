package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	//Overriding-C#'daki virtual
	//Overriding yani ogrenci kredisi için farklı bir hesaplama yapıyor
	//Overriding edilmesini istemiyorsak BasenKrediManager sınıfında hesapla fonksiyonunu final yapmamız lazım
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}

}
