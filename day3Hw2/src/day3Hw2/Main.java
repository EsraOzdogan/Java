package day3Hw2;


public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setFirstName("esra");
		student.setEmail("esra@gmail.com");

		Instructor instructor = new Instructor();
		instructor.setFirstName("engin");
		instructor.setEmail("engin@gmail.com");
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		studentManager.add(student);
		
		
		
		UserManager userManager = new UserManager();
	
		
		User[] users = {student,instructor};
		userManager.addMultiple(users);

		
	}

}
