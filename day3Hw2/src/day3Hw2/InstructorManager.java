package day3Hw2;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " added.");
	}

	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + instructor.getLastName() + " deleted.");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName() + instructor.getLastName() + " updated");
	}

	public void getAll() {
		System.out.println("Listed");
	}
	
	public void login(String email, String password) {
		System.out.println(email + " login");
	}

	public void logout(Instructor instructor) {
		System.out.println(instructor.getEmail() + " logout ");
	}
	  
}
