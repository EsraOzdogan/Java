package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.calculate();
		womanGameCalculator.gameOver();
		
		//GameCalculator gameCalculator = new GameCalculator()//abstract s�n�flar asla newlenemez
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		
		
		//Abstract s�n�flar�n iyi yan� yar�n �b�rg�n de OlderGameCalculator ekleyebilir ve extends edebilirsin
	}

}
