package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String student1 = "Esra";
		String student2 = "Derin";
		String student3 = "Salih";
		String student4 = "Batu";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

		System.out.println("-----");

		
		
		String[] students = new String[5];  //5 elemanl� dizi
		students[0] = "Esra";
		students[1] = "Suzan";
		students[2] = "Zamans�z";
		students[3] = "Batu";
		students[4] = "H��";

		for(int i= 0; i<students.length;i++) {
			System.out.println(students[i]);
		}
		
		
		System.out.println("-----");

		
		for(String student : students) {
			System.out.println(student);

		}

	}

}
