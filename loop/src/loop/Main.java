package loop;

public class Main {

	public static void main(String[] args) {
		
		//For
		for(int i =0 ; i<10; i+=2) {
			System.out.println(i);
		}
		System.out.println("End of the loop for");
		
		//While
		int i  = 20;
		while(i<10){
			System.out.println(i);
			i++;
		}
		System.out.println("End of the loop while");

		//Do-While
		int j= 100;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("End of the loop do-while");

	}

}