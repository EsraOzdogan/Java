package interfaces;

public class Utils {
	
	//Ýlk basta static degildi CustomerManager da tekrar newlememek için static yaptýk
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger: loggers) {
			logger.log(message);
		}
		
	}
}
