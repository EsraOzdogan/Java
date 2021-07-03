package eCommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.GoogleService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService{
	
	private List<String> emailList = new ArrayList<String>();
	private List<String> passwordList = new ArrayList<String>();
	
	private UserDao userDao;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao, GoogleService googleService) {

		super();
		this.userDao = userDao;
		this.googleService = googleService;
	}
	
	
	public static boolean isEmailValid(String email) {

		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(email);

		return matcher.matches();
	}

	public static boolean isEmailValidOnClick(String email) {
		return true;

	}


	@Override
	public void register(User user) {

		if (user.getPassword().length() < 6 || user.getPassword() == null) {
			System.out.println("password must be at least 6 characters");
			return;
		}

		if (emailList.contains(user.getEmail())) {
			System.out.println("This email has been used before");
			return;
		}

		if (user.getFirstName().length() < 3 || user.getLastName().length() < 3) {
			System.out.println("First and last name must be at least 2 characters");
			return;

		} else {
			System.out.println("Verification link has been sent, please check " + user.getEmail());

		}

		if (isEmailValidOnClick(user.getEmail())) {
			System.out.println("Registration completed");
			emailList.add(user.getEmail());
			passwordList.add(user.getPassword());
			this.userDao.add(user);
			this.googleService.registerToSystem(null);

		} else {
			System.out.println("Check your email and verify your account");
		}

	}

	@Override
	public void login(String email, String password) {

		if (emailList.contains(email) && passwordList.contains(password)) {
			System.out.println("System Login Successful");
			
		} else {
			System.out.println("Check Your Email or Password");
		}
	}

}
