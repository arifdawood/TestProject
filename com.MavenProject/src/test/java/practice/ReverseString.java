package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Selenium";
		String x = "";
		
		for (int i=str.length()-1; i>=0; i--) {
			x= x+str.charAt(i);
		//	System.out.println(x);
		}
		
		System.out.println(x);
		/*
		String[] array1 = { "a", "b", "c" };
		String[] array2 = { "b", "x", "y" };
		
		// 2. using HashSet: Java Collection, it stores unique values
		Set<String> store = new HashSet<String>();
		for (String array : array1) {
			if(store.add(array)== false){
				System.out.println("duplicate = " + array);
			}
		}
		for (String array : array2) {
			if(store.add(array)== false){
				System.out.println("duplicate = " + array);
			}
		}
		
		System.out.println("HashSet = " + store);
		
		
		
		// 1. Compare each element - worst solution
		for (int i = 0; i < array1.length; i++) {
			for (int x = 0; i < array2.length; x++) {
				if (array1[i].equals(array2[x])) {
					// System.out.println("Duplicate = " + array1[i]+ " - " + array2[x]);
				} else {
					System.out.println("Different = " + array1[i] + " - " + array2[x]);
				}
				if (x == array2.length - 1) {
					break;
				}
			}
		}*/
	}
}


