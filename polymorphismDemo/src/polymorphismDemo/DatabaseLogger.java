package polymorphismDemo;

public class DatabaseLogger extends BaseLogger{
	//override
	public void log(String message) {
		System.out.println("Log to database: " + message);
	}

}
