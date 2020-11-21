package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtils {

	String excelpath = "./Data/API_Data.xlsx";
	
	@Test
	public void getCellData() {
		try {
			
			XSSFWorkbook workbook = new XSSFWorkbook(excelpath);
			XSSFSheet sheet = workbook.getSheet("sheet1");
			DataFormatter formatter = new DataFormatter();
			
			Object value = formatter.formatCellValue(sheet.getRow(1).getCell(2));
			
			System.out.println("value = " + value);
			workbook.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	
	//@Test
	public void getRowCount() {
		try {
			
			XSSFWorkbook workbook = new XSSFWorkbook(excelpath);
			XSSFSheet sheet = workbook.getSheet("sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row count = " + rowCount);
			workbook.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	
}
