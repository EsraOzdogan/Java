package methodOverloading;

public class Main {

	public static void main(String[] args) {

		FourOperation fourOperation = new FourOperation();
		System.out.println(fourOperation.Sum(5, 6));
		System.out.println(fourOperation.Sum(5, 6,7));

	}

}
