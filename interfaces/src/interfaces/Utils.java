package interfaces;

public class Utils {
	
	//�lk basta static degildi CustomerManager da tekrar newlememek i�in static yapt�k
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger: loggers) {
			logger.log(message);
		}
		
	}
}
