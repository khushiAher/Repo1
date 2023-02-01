package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEg2 {

	public static void main(String[] args) throws InterruptedException, IOException
  {
	System.setProperty("webdriver.chrome.driver","D:\\khushboo\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://neostox.com/");
	Thread.sleep(300);
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	
	File destination = new File("D:\\khushboo\\Screenshot\\img.png");
	FileHandler.copy(source, destination);
	

  }

}
