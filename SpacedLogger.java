package homework;

public class SpacedLogger implements logger {
	
	public void log(String text) {
		
		System.out.println(text.replaceAll(".(?=.)", "$0 "));
	}
	
	public void error(String text) {
		
		System.out.println("Error: " + text.replaceAll(".(?=.)", "$0 "));
	}

}
