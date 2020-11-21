package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountBrokenLinks {

	public static void main(String[] args) {
		// Open the webpage
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arif\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// Get all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links = " + links.size());
		
		int goodlink = 0;
		int badlink = 0;
		
		for (int i = 0; i<links.size(); i++) {
			
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			
			try {
				URL url2 = new URL(url);
				HttpURLConnection httpURLConnection = (HttpURLConnection)url2.openConnection();
				httpURLConnection.setConnectTimeout(3000);
				httpURLConnection.connect();
					if (httpURLConnection.getResponseCode()==200) {
						System.out.println(url2 + " - " + httpURLConnection.getResponseMessage());
						goodlink = goodlink+1;
					}
					if(httpURLConnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
						System.out.println(url2 + " - " + httpURLConnection.getResponseMessage()+ " - " + HttpURLConnection.HTTP_NOT_FOUND);
						badlink = badlink + 1;
					}
				}
				catch (Exception e) {
					
				}
				
		}
		System.out.println("Total good links = " + goodlink);
		System.out.println("Total bad links = " + badlink);
	}
}
	

