package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Array_FindDuplicate {

	public static void main(String[] args) {

		// Duplicate value in 1 array
		String arrayOne[] = {"a", "b", "b", "c"};
		String getvalue = null;
		for (int i = 0; i<arrayOne.length; i++) {
			for (int x = i+1; x<arrayOne.length; x++) {
				if (arrayOne[i].equals(arrayOne[x])) {
					System.out.println("Duplicate = " + arrayOne[i]);
				}
				getvalue = arrayOne[i];
			}
		}
		System.out.println(getvalue);



		// 1st way to find duplicate from 2 Arrays
		boolean flag;
		char ar1[] = { 'a', 'b', 'c' };
		char ar2[] = { 'b', 'd', 'f' };
		for (char x : ar1) {
			flag = true;
			for (char y : ar2) {
				if (x == y) {
					flag = false;
				}
			}
			if (flag)
				System.out.print(x);
		}

		for (char x : ar2) {
			flag = true;
			for (char y : ar1) {
				if (x == y) {
					flag = false;
				}
			}
			if (flag)
				System.out.print(x);
		}


		/*
		// 2nd way to find duplicate
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
		 */
	}
}


