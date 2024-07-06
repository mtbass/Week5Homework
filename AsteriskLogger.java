package homework;

public class AsteriskLogger implements logger {
	
	public void log(String text) {
		
		System.out.println("***" + text + "***");
		
	}
	
	public void error(String text) {
		
		String border = "****************";
		
		System.out.println(border);
		System.out.println("***Error: " + text + "***");
		System.out.println(border);
		
	}

}
