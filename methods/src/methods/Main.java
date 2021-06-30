package methods;

public class Main {

	public static void main(String[] args) {
		findNumbers();
	}

	public static void findNumbers() {
		int[] numbers= new int[]{1,2,5,7,9,0};
		int findNumber= 5;
		boolean isThere = false;
		
		for(int number : numbers) {
			if(number==findNumber) {
				isThere = true;
				break;
			}
		}
		
		
		if(isThere) {
			sendMessage("Number is there " +findNumber);
		}else {
			sendMessage("Number is not there " +findNumber);

		}
	}
	
	public static void sendMessage(String message) {
		System.out.println(message);
		
	}
}
