package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayListTest2 {

	public static void main(String[] args) throws Exception {
		// Open the webpage
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arif\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		// get the Column count
		List<WebElement> headingElement = driver.findElements(By.xpath("//table[@id='myTable']//thead/tr/th"));
		System.out.println("Total Column count  = " + headingElement.size());
			
		ArrayList<String> aList = new ArrayList<String>();
		for (int i = 1; i<=headingElement.size(); i++) {
			String columnText = driver.findElement(By.xpath("//table[@id='myTable']//thead/tr/th["+i+"]")).getText();
			// ArrayList aList = new ArrayList();
			aList.add(columnText);
		}
		System.out.println("Column Heading List = " + aList);
		
		List<WebElement> tableElement = driver.findElements(By.xpath("//table[@id='myTable']//tbody/tr"));
		System.out.println("Total Table count  = " + tableElement.size());
		
		List<WebElement> element2 = driver.findElements(By.xpath("//table[@id='myTable']//tbody/tr[1]/td"));
		System.out.println("Total Columns = " + element2.size());
		
		for (int x = 1; x<=tableElement.size(); x++) {
			
			
			
		}
		
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
