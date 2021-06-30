package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
			case 'A' :
				System.out.println("Succesfully");
				break;
			case 'B' :
			case 'C' :
				System.out.println("Succesfully");
				break;
			case 'D' :
				System.out.println("Succesfully");
				break;
			case 'F' :
				System.out.println("Succesfully");
				break;
			default:
					System.out.println("Grade is invalid ");

		}
	}

}
