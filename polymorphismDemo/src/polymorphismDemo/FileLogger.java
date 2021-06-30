package polymorphismDemo;

public class FileLogger extends BaseLogger{
	//override
	public void log(String message) {
		System.out.println("Log to file: " + message);
	}


}
