package practice;

import java.util.HashMap;

public class CountOccuranceOfCharacters {

	public static void main(String[] args) {
		String string = "Selenium Automation";
		int count;
		char ch;
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i<string.length(); i++) {
			ch = string.charAt(i);
			// Verify if the character is previously occur
			if(hashMap.containsKey(ch)) {
				count = hashMap.get(ch);
				count++;
				hashMap.replace(ch, count);
			} else {
				// if not previously occur
				hashMap.put(ch, 1);
			}
		}
		// for printing all keys and values
		for (Character key : hashMap.keySet()) {
			System.out.println(key + " = " + hashMap.get(key));
		}
	}

}
