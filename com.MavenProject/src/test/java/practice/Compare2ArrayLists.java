package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Compare2ArrayLists {

	public static void main(String[] args) throws Exception {
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		FileInputStream fis = new FileInputStream(".\\TestData\\ListData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int col0= 0, col1=1, rn=11;
		
		for (int a = 1; a<rn; a++) {
			Row rw = sheet.getRow(a);
			Cell cel1 = rw.getCell(col0);
			Cell cel2 = rw.getCell(col1);
			String data1 = cel1.getStringCellValue();
			String data2 = cel2.getStringCellValue();
			list1.add(data1);
			list2.add(data2);
		}

		System.out.println("List 1 = " + list1);
		System.out.println("List 2 = " + list2);
		System.out.println("==================");
		
		for (int i = 0; i<list1.size(); i++)
		{
		//	System.out.println("List1 = " + list1.toArray()[i]);
			if (list1.toArray()[i].equals(list2.toArray()[i]))
			{
				System.out.println("Same List1 "+i+ " = "+ list1.toArray()[i] + "  List2 = " + list2.toArray()[i]);
			}
			else
			{
				System.out.println("Not Same List1 "+i+ " = "+  list1.toArray()[i] + "  List2 = " + list2.toArray()[i]);
			}
		}
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("Arif");
		list3.add("Amir");
		list3.add("Ali");
		list3.add("Dawood");
		
		System.out.println(list3.toArray()[0]);
		System.out.println(list3.toArray()[1]);
		System.out.println(list3.toArray()[2]);
		System.out.println(list3.toArray()[3]);
		
		System.out.println("for each loop");
		for (String str:list3) {
			System.out.print(str + " ");
		}
		
	
		// Sorting ArrayList
		ArrayList<Integer> arry = new ArrayList<Integer>();
		arry.add(9);
		arry.add(5);
		arry.add(7);
		arry.add(8);
		arry.add(1);
		arry.add(11);
		arry.add(13);
		arry.add(15);
		arry.add(20);
		
		System.out.println("Before Sorting : "+ arry);
		
		// reverse / decending order
		Collections.sort(arry, Collections.reverseOrder());
		System.out.println("After Sorting : "+ arry);
	
		// Sort
		Collections.sort(arry);
		System.out.println("Sorting : "+ arry);
		
		// 2nd way to compare	
		boolean flag;
		char ar1[]= {'a','b','c'};
		char ar2[]= {'b','d','f'};
		for(char x:ar1) {
			flag=true;
			for(char y:ar2) {
				if(x==y)
				{
					flag=false;
				}
			}
			if(flag)
			System.out.print(x);
			}

		for(char x:ar2) {
			flag=true;
			for(char y:ar1) {
				if(x==y)
				{
					flag=false;
				}
			}
			if(flag)
			System.out.print(x);
		}
	
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
		
	}
}
