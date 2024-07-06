package homework;

public class app {
	
	public static void main(String[] args) {
		
		logger asteriskLogger = new AsteriskLogger();
		logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Hello");
		asteriskLogger.error("Hello");
		
		spacedLogger.log("Hello");
		spacedLogger.error("Hello");
		
	}

}
