package airCanadaBase;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import airCanadaUtility.Utility;



public class Base 
{
	protected static WebDriver driver;
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\khushboo\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aircanada.com/us/en/aco/home.html");
		Utility.implicitWait(1000, driver);
		Reporter.log("launching browser", true);
	//	driver.findElement(By.name("From")).sendKeys("Ottawa");
	//	driver.findElements(By.xpath("//input[@name='bkmgFlights_origin_trip_1']"));
		
		
		
	}
	
	

}
