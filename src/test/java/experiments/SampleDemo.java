package experiments;

import java.util.Date;

public class SampleDemo {
	
	public static void changeDelimeter(String s) {
		String newString = s.replace(" ", "_");
		System.out.println(newString);
	}
	
	private static String getEmailTimeStamp() {
		Date date = new Date();
		return "testauto" + date.toString().replace(" ", "_").replace(":", "_") + "@gmail.com";
	}
	
	public static void main(String[] args) {
		String t = "User enters valid email address \"testautonare1@gmail.com\" into the email field";
		SampleDemo.changeDelimeter(t);
		System.out.println(SampleDemo.getEmailTimeStamp());
	}
	

}
