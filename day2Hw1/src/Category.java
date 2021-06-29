
public class Category {
	
	public Category() {
		System.out.println("Category default constructor");
	}

	public Category(int id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
	}
	

	int id;
	String categoryName;

}
