package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetDataInArrayList {

	static WebDriver driver;
	
	@Test
	public static void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Arif/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.finviz.com/screener.ashx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public static void readData() {
		String xpathTable = "//td[text()='No.']/parent::tr/following::tr";
		
		List<WebElement> xpath_totalrows = driver.findElements(By.xpath(xpathTable));
		
		String sample = driver.findElement(By.xpath(xpathTable+"[1]/td[1]/a")).getText();
		System.out.println("sample = " + sample);
		
		
	/*	for (int i = 1; i<=20; i++) {
			String 
			
			
		}*/
		
	}
	
}
