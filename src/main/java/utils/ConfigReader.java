package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	public Properties initializeProperties() {
		
		Properties prop = new Properties();
		File propFile = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config.properties");
		try {
			FileInputStream fisProp = new FileInputStream(propFile);
			prop.load(fisProp);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return prop;
	}

}
