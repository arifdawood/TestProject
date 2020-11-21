package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Looping_ArrayListTest {

	public static void main(String[] args) {
		
		// ArrayList can store any datatype as an object
		
		ArrayList arraylist = new ArrayList();
		
		arraylist.add("Ali");
		arraylist.add("10.20");
		arraylist.add("50");
		arraylist.add("M");
		
		arraylist.add("Ali");
		
		
		// print by for loop
		System.out.println("print by for loop");
		for (int i = 0; i<arraylist.size(); i++) {
			System.out.println(i + " - "  + arraylist.get(i));
		}
		
		// print by for each enhanced loop
		System.out.println("print by for each enhanced loop");
		for (Object x:arraylist) {
			System.out.println(x);
		}
		
		// Iterator to print arraylist
		System.out.println("Iterator to print arraylist");
		Iterator itr = arraylist.iterator();
		while(itr.hasNext()) {
			Object value = itr.next();
			System.out.println(value);
		}
	}
}
