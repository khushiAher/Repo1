package airCanadaUtility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Utility 
{
   //ScrollInto View
	//wait
	
	public static void implicitWait(int time, WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		Reporter.log("Waiting for"+time, true);
	}
	
	public static void scrollIntoView(WebDriver driver,WebElement element) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		Reporter.log("scrolling into view" +element.getText(), true);
	}
}
