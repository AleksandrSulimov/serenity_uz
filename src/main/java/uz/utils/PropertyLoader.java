package uz.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertyLoader {


	public static String loadProperty(String key) {
		Properties properties = new Properties();
		try {
			properties.load(new InputStreamReader(new FileInputStream("src/main/resources/"
					+ "uz.properties"), "UTF-8"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}

}
