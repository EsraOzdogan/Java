package eCommerce;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.GoogleManagerAdapter;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		//UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter());
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter());

		User user1 = new User(1, "Esra", "ÖZDOÐAN", "es@gmail.com", "123456");
		User user2 = new User(1, "Esra", "ÖZDOÐAN", "esra@gmail.com", "123456");

		
		userService.register(user1);
		userService.login("es@gmail.com", "123456");
		userService.login("esra@gmail.com", "123456");


	}

}
