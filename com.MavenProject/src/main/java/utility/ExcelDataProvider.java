package utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataProvider {

	// Read String value in the excel sheet utility

	public static String  ReadStringData(int sheetNumber, int row, int column) throws Exception {

		File src = new File("./TestData/ExcelTestData2.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(sheetNumber);

		String data = workbook.getSheetAt(sheetNumber).getRow(row).getCell(column).getStringCellValue();
		workbook.close();
		return data;
	}

	// Write value in the excel sheet utility

	public static void WriteData(int sheetNumber, int row, int column, String setValue) throws Exception {

		File src = new File("./TestData/ExcelTestData2.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(sheetNumber);

		sheet.getRow(row).createCell(column).setCellValue(setValue);

		FileOutputStream fos = new FileOutputStream(src);
		workbook.write(fos);
		workbook.close();

	}
		
		
}

	
	
	

