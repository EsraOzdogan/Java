

public class Main {

	public static void main(String[] args) {

		//default signature
		Category category1 = new Category();
		category1.id = 1;
		category1.categoryName = "Programlama";
		
		Instructor instructor1 = new Instructor();
		instructor1.id = 1;
		instructor1.instructorName = "Engin Demiroð";
		
		
		Course course1 = new Course(); 
		course1.id=1;
		course1.courseName="Yazýlým Geliþtirici Yetiþrtirme Kampý(C#+Angular)";
		course1.categoryId=1;
		course1.instructorId=1;
		
		Course course2 = new Course(); 
		course2.id=2;
		course2.courseName="Yazýlým Geliþtirici Yetiþrtirme Kampý(Java+React)";
		course2.categoryId=1;
		course2.instructorId=1;

		Course course3 = new Course(); 
		course3.id=3;
		course3.courseName="Programlamaya Giriþ için Temel Kurs";
		course3.categoryId=1;
		course3.instructorId=1;
		
		
		Course[] courses = {course1,course2, course3};
		
		for (Course course: courses) {       
			System.out.println(course.courseName);
		}
		
		System.out.println(courses.length);
		
		
		
		
		//overloading signature
		Course course4 = new Course(1,1,1, "Engin Demiroð");
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course1);
		courseManager.update(course1);
	}

}
