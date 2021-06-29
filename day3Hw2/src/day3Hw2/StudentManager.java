package day3Hw2;

public class StudentManager extends UserManager{
	
	public void add(Student student) {
		System.out.println(student.getFirstName() + " added.");
	}

	public void delete(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " deleted.");
	}
	
	public void update(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " updated");
	}

	public void getAll() {
		System.out.println("Students are listed");
	}
	
	public void login(String email, String password) {
		System.out.println(email + " login");
	}

	public void logout(Student student) {
		System.out.println(student.getEmail() + " logout ");
	}
	
}
