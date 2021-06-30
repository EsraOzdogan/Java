package polymorphismDemo;

public class EmailLogger extends BaseLogger{
	//override

	public void log(String message) {
		System.out.println("Log to email: " + message);
	}


}
