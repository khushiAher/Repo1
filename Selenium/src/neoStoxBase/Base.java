package neoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base 
{
  protected WebDriver driver;
  public void launchBrowser()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\khushboo\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://neostox.com/");
	  Reporter.log("launching browser", true);
	  Reporter.log("launching browser for neo stox", true);
	  
  }
  
}
