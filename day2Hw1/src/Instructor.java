
public class Instructor {
	
	public Instructor() {
		System.out.println("Instructor default constructor");
	}
	

	public Instructor(int id, String instructorName) {
		this.id = id;
		this.instructorName = instructorName;
	}
	
	int id;
	String instructorName;

}
