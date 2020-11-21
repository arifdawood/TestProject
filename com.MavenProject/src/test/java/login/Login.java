package login;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.ActionDriver;

public class Login extends ActionDriver{

	/*
	 ***** Login Information ****

	 Valid Email Address: TestingQA@gmail.com
	 Password: testing
	 
	 */
	@Test
	public static void EnterLogin()
	{
		Click("//a[@class='login']");
		Type("//input[@id='email']", "TestingQA@gmail.com");
		Type("//input[@id='passwd']", "testing");
		Click("//button[@id='SubmitLogin']");
		Assert.assertEquals(driver.getTitle(), "My account - My Store");
		
	}
	
}
