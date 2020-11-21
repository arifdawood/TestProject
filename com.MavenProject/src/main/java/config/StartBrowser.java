package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


import io.github.bonigarcia.wdm.WebDriverManager;
import utility.CaptureScreenShot;

public class StartBrowser {

	public static WebDriver driver;
	public static String URL = "http://www.automationpractice.com";
	
	
	@BeforeClass
	public static void OpenBrowser()
	{
		
		// WebDriverManager will download all 
		// the drivers
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Webpage open successfully");
	}
	
	@AfterMethod
	public static void TearDown(ITestResult result)
	{
		if(ITestResult.FAILURE == result.getStatus())
			
		{
	
			CaptureScreenShot.ScreenShot(result.getName());
			
		}
	}

	

	
	
}
