package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage {

	public static void main(String[] args) {
		// Open the webpage
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arif\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// Get all the links
		List<WebElement> links = driver.findElements(By.tagName("img"));
		System.out.println("Total links = " + links.size());
		
		for (int i = 0; i<links.size(); i++) {
			
			WebElement ele = links.get(i);
			String url = ele.getAttribute("src");
			verifyImage(url);
		}
	}

	public static void verifyImage(String linkURL) {
		
		try {
			URL url = new URL(linkURL);
			HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
			httpURLConnection.setConnectTimeout(3000);
			httpURLConnection.connect();
				if (httpURLConnection.getResponseCode()==200) {
					System.out.println(linkURL + " - " + httpURLConnection.getResponseMessage());
				}
				if(httpURLConnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
					System.out.println(linkURL + " - " + httpURLConnection.getResponseMessage()+ " - " + HttpURLConnection.HTTP_NOT_FOUND);
				}
			}
			catch (Exception e) {
				
			}
		}
	}
	
	

