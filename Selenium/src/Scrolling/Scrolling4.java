package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling4 {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","D:\\khushboo\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://en.wikipedia.org/wiki/India");
		 Thread.sleep(1000);
		 WebElement etymology = driver.findElement(By.id("Etymology"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 Thread.sleep(1000);
		 js.executeScript("arguments[0].scrollIntoView(true)", etymology);

	}

}
