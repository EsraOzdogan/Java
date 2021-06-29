

public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println("Add category this name: " + instructor.instructorName);
		System.out.println("Instructor has been added.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println("Delete instructor this name: " + instructor.instructorName);
		System.out.println("Instructor has been deleted.");
	}
	
	public void update(Instructor instructor) {
		System.out.println("Update instructor this name: " + instructor.instructorName);
		System.out.println("Instructor");
	}
}
