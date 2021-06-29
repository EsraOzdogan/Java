
public class Course {
	
	public Course() {
		System.out.println("Course default constructor");
	}

	public Course(int id, int categoryId, int instructorId, String courseName/*, int rate*/) {
		this.id=id;
		this.categoryId=categoryId;
		this.instructorId=instructorId;
		this.courseName=courseName;
		//this.rate =rate;	
	}
	
	int id;
	int categoryId;
	int instructorId;
	String courseName;
	//int rate;	
	
	

}
