package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\khushboo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/India");
		Thread.sleep(500);
		
	// Type cast driver object into JavaScriptExecutor and store in ref variable
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
	// Using object call method execute script
		
        Thread.sleep(500);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(500);
        js.executeScript("window.scrollBy(0,900)");
        Thread.sleep(500);
        js.executeScript("window.scrollBy(0,-700)");
        
	}

}
