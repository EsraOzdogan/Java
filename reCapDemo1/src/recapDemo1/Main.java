package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 24;
		int number2 = 25;
		int number3 = 2;
		
		int theBiggest = number1;
		
		if(theBiggest<number2) {
			theBiggest= number2;
		}
		if(theBiggest<number3) {
			theBiggest= number3;
		}

		System.out.println("The biggest " + theBiggest );
	}

}
