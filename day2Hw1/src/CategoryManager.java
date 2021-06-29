

public class CategoryManager {

	public void add(Category category) {
		System.out.println("Add category this name: " + category.categoryName);
		System.out.println("Category has been added.");
	}
	
	public void delete(Category category) {
		System.out.println("Delete category this name: " + category.categoryName);
		System.out.println("Category has been deleted.");
	}
	
	public void update(Category category) {
		System.out.println("Update category this name: " + category.categoryName);
		System.out.println("Category has been updated.");
	}
}
