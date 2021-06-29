package day3Hw2;


public class UserManager {
	
	  public void add(User user){
	        System.out.println(user.getEmail() + " added");
	    }
	  
	  public void addMultiple(User[] users) {
			for(User user: users) {
				add(user);
			}
		}
	  
	  

}
