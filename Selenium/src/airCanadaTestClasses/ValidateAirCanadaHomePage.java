package airCanadaTestClasses;

import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import airCanadaBase.Base;
import airCanadaPOMClass.AirCanadaHomePage;
import airCanadaUtility.Utility;

public class ValidateAirCanadaHomePage extends Base
{
	AirCanadaHomePage home;
	
	@BeforeMethod
	public void launchAirIndiaApp()
	{
		launchBrowser();
		home = new AirCanadaHomePage(driver);
	}
	
	@Test
	public void loginToAirCanada() throws InterruptedException
	{
		home.clickOnOneWayButton(driver);
		Utility.implicitWait(1000, driver);
		home.EnterFromName();
		Utility.implicitWait(1000, driver);
		home.EnterFromName();
		Utility.implicitWait(1000, driver);
		
		
	}
  
}
