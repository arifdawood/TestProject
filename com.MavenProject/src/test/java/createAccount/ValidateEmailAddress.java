package createAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.annotations.Test;

//import config.StartBrowser;
import utility.ActionDriver;


public class ValidateEmailAddress extends ActionDriver{

	 // shortcut Key for commentout:
	// CTRL+Shift+ "/"

	/*Create An Account:	
		
		1	Correct Email Address
		2	Incorrect Email address
		3	Leave Blank
		4	Already used email address
	 	
	*/
	
	// Create variables for locators
	static String loc_SignOnBtn = "//a[@class='login']";
	static String loc_EmailColumn = "//input[@id='email_create']";
	static String loc_CreateAnAccountBtn = "//button[@id='SubmitCreate']";
	
	
//	@Test
	public static void EnterCorrectEmailAddress()
	{
	
	//	Locate the element and click on it
	//	driver.findElement(By.xpath("//a[@class='login']")).click();
		
	//	driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("Test@gmail.com");
		
		
	//	ActionDriver.Click("//a[@class='login']");
	//	ActionDriver.Type("//input[@id='email_create']", "Test@gmail.com");
	//	ActionDriver.Click("//button[@id='SubmitCreate']");
		
		
		
		try 
		{
		//	Click("//a[@class='login']");
			Click(loc_SignOnBtn);
			Type(loc_EmailColumn, "Test1001@gmail.com");
			Click(loc_CreateAnAccountBtn);
		//	Type("//input[@id='email_create']", "Test1001@gmail.com");
		//	Click("//button[@id='SubmitCreate']");
			Thread.sleep(2000);
			Assert.assertTrue(driver.findElement(By.id("customer_firstname")).isDisplayed(), "failed message");
			
			driver.navigate().to(URL);
			Thread.sleep(2000);
			System.out.println("EnterCorrectEmailAddress -- Pass");
			
		} catch (Exception e) {
			
			System.out.println("Testcase is failed ****");
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void EnterInCorrectEmailAddress() throws Exception
	{
	//	Click("//a[@class='login']");
	//	Type("//input[@id='email_create']", "Test1001");
	//	Click("//button[@id='SubmitCreate']");
		
		Click(loc_SignOnBtn);
		Type(loc_EmailColumn, "Test1001");
		Click(loc_CreateAnAccountBtn);
		
		Thread.sleep(2000);
		String getErrorMessage = driver.findElement(By.xpath("//div[@id='create_account_error']")).getText();
		Assert.assertEquals(getErrorMessage, "Invalid email address.", "Error message is incorrect.");
		System.out.println("EnterInCorrectEmailAddress -- Pass");
		Thread.sleep(2000);
	}
	
	public static void LeaveBlankEmailColumn() throws Exception
	{
	
		Clear(loc_EmailColumn);
		Click(loc_CreateAnAccountBtn);
		Thread.sleep(2000);
		String getErrorMessage = driver.findElement(By.xpath("//div[@id='create_account_error']")).getText();
	//	Assert.assertEquals(getErrorMessage, "Invalid email address.", "Error message is incorrect.");
		System.out.println("LeaveBlankEmailColumn -- Pass");
		
	}
	
	public static void AlreadyUsedEmailAddress()
	{
		
		
		try 
		{
			
			Clear(loc_EmailColumn);
			Type(loc_EmailColumn, "Test@gmail.com");
			Click(loc_CreateAnAccountBtn);
			Thread.sleep(2000);
			String getErrorMessage = driver.findElement(By.xpath("//div[@id='create_account_error']")).getText();
			Assert.assertEquals(getErrorMessage, "Invalid email address.", "Error message is incorrect.");
			System.out.println(getErrorMessage);
			
		} catch (Exception e) {
			
			System.out.println("Testcase is failed ****");
			System.out.println(e.getMessage());
		}
	}
	
}
