package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.opencsv.CSVReader;

public class ReadCSVFile {

	public static void main(String[] args) throws Exception {
		
		String csvFile = "./TestData/TestData2.csv";
		
		CSVReader reader = new CSVReader(new FileReader(csvFile));
		String[] cell;
		
		ArrayList alist = new ArrayList();
		
		
		while((cell=reader.readNext())!=null) {
			for(int i = 0; i<1; i++) {
				String data1 = cell[i];
				alist.add(data1);
				String data2 = cell[i+1];
				alist.add(data2);
				System.out.println("Data 1 = " + data1);
				System.out.println("Data2 = "+ data2);
			}
		}

		System.out.println("Direct Print Array List = " + alist);
		
		/*for(Object x : alist) {
			System.out.println("For Loop Array List = " + alist);
		}*/
		
		for (int y = 0; y<alist.size(); y++)
		{
			System.out.println("For Loop Array List " + y + " = "+ alist.get(y));
		}
		

	}

}
