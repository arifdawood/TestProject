package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.StartBrowser;

public class ActionDriver extends StartBrowser {

	
	public static void Type(String locator, String setValue)
	{
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(setValue);
	
	}
	
	
	public static void Click(String locator)
	{
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}
	
	public static void Clear(String locator)
	{
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
	}
}
