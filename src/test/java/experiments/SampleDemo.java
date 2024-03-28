package experiments;

public class SampleDemo {
	
	public static void changeDelimeter(String s) {
		String newString = s.replace(" ", "_");
		System.out.println(newString);
	}
	
	public static void main(String[] args) {
		String t = "User enters valid email address \"testautonare1@gmail.com\" into the email field";
		SampleDemo.changeDelimeter(t);
	}
	

}
