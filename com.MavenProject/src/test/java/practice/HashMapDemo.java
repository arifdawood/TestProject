package practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// Create a new object for HashMap
		HashMap<String, String> obj = new HashMap<String, String>();
		
		obj.put("101", "Selenium");
		obj.put("102", "Automation");
		obj.put("103", "Paper");
		obj.put("104", "Bottle");
		
		System.out.println(obj);
		
		// Print Individual value from the key
		System.out.println("Key is " + obj.get("102"));
		
		// To print all the keys & values we use "Entry" interface which
		// is a child interface of Map
		for(Map.Entry<String, String> data : obj.entrySet()) {
			System.out.println("Key is " + data.getKey() + " - Value is " + data.getValue());
		}
	}
}
