package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}

	/*//Overriding edilmesini istemiyorsak BasenKrediManager sınıfında hesapla fonksiyonunu final yapmamız lazım

	public final double hesapla(double tutar) {
		return tutar * 1.18;
	}*/
}
