

public class CourseManager {

	public void add(Course course) {
		System.out.println("Add course this name: " + course.courseName);
		System.out.println("Course has been added.");
	}
	
	public void delete(Course course) {
		System.out.println("Delete course this name: " + course.courseName);
		System.out.println("Course has been deleted.");
	}
	
	public void update(Course course) {
		System.out.println("Update course this name: " + course.courseName);
		System.out.println("Course has been updated.");
	}
}
