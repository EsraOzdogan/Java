package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.calculate();
		womanGameCalculator.gameOver();
		
		//GameCalculator gameCalculator = new GameCalculator()//abstract sýnýflar asla newlenemez
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		
		
		//Abstract sýnýflarýn iyi yaný yarýn öbürgün de OlderGameCalculator ekleyebilir ve extends edebilirsin
	}

}
