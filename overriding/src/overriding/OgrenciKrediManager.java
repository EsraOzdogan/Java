package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	//Overriding-C#'daki virtual
	//Overriding yani ogrenci kredisi i�in farkl� bir hesaplama yap�yor
	//Overriding edilmesini istemiyorsak BasenKrediManager s�n�f�nda hesapla fonksiyonunu final yapmam�z laz�m
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}

}
