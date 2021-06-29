package abstractClasses;


//BaseGameCalculator
/*public class GameCalculator {
	
	public void calculate() {
		System.out.println("Your score is : 100");
	}
	
	public void gameOver() {
		System.out.println("Game over");
	}

}*/


public abstract class GameCalculator {
	
	public abstract void calculate(); // Abstact sýnýf-Kim implemente ediyorsa calculate fonk içermek zorunda ama kendi de yazmak zorunda
	
	public final void gameOver() {   //final ise override edilemez
		System.out.println("Game over");
	}

}

