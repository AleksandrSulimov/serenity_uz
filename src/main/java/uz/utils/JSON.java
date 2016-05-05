package uz.utils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JSON {


	@SuppressWarnings({ "unchecked" })
	public static void writeJSON(String filePath, String key, String value) {
		JSONObject obj = new JSONObject();
		obj.put(key, value);
		try {
			
			FileWriter file = new FileWriter("src/main/resources/"+filePath);
			file.write(obj.toJSONString());
			file.close();
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
	
	public static String readJSON(String filePath, String key){
		 JSONParser parser = new JSONParser();
		 String value ="";
		 try {
			Object obj = parser.parse(new FileReader("src/main/resources/"+filePath));
			JSONObject jsonObject = (JSONObject) obj;
			value = (String) jsonObject.get(key);
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return value;
	}

}
