package inheritanceDemo;

public class KrediUI {

/*	public void CalculateCredit(OgretmenKrediManager ogretmenKrediManager) {
		ogretmenKrediManager.Calculate();
	}*/
	
	public void CalculateCredit(BaseKrediManager baseKrediManager) {
		baseKrediManager.Calculate();
	}
}
