package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}

	/*//Overriding edilmesini istemiyorsak BasenKrediManager s�n�f�nda hesapla fonksiyonunu final yapmam�z laz�m

	public final double hesapla(double tutar) {
		return tutar * 1.18;
	}*/
}
