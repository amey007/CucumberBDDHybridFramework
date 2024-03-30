package utils;

import java.util.Date;

public class CommonUtils {
	
	public String getEmailTimeStamp() {
		Date date = new Date();
		return "testauto" + date.toString().replace(" ", "_").replace(":", "_") + "@gmail.com";
	}

}
