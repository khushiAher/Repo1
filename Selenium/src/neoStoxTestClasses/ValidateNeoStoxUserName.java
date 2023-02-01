package neoStoxTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStoxUtility.Utility;
import neoStoxBase.Base;
import neoStoxPOMClass.NeoStoxDashBoardPage;
import neoStoxPOMClass.NeoStoxHomePage;
import neoStoxPOMClass.NeoStoxPasswordPage;
import neoStoxPOMClass.NeoStoxSignInPage;

public class ValidateNeoStoxUserName extends Base
{

   NeoStoxHomePage home;
   NeoStoxSignInPage signin;
   NeoStoxPasswordPage password;
   NeoStoxDashBoardPage dash;
   
   

@BeforeClass

public void launchNeoStoxApp()

{
	launchBrowser();
	home = new NeoStoxHomePage(driver);
	signin = new NeoStoxSignInPage(driver);
	password = new NeoStoxPasswordPage(driver);
	dash = new NeoStoxDashBoardPage(driver);
  }

@BeforeMethod
   public void loginToNeoStox() throws InterruptedException, EncryptedDocumentException, IOException
 {
	home.clickOnSignInButton();
	Utility.implicitWait(500, driver);
	
	signin.enterMobileNumber(Utility.readDataFromExcel(0,0));
	Thread.sleep(300);
	signin.clickOnSignInButton();
	Utility.implicitWait(500, driver);
	
	password.EnterPassword(Utility.readDataFromExcel(0, 1));
	Thread.sleep(300);
	password.ClickOnSubmitButton();
	
	Utility.implicitWait(1000,driver);
	dash.handlePopUp(driver);	
 }
@Test
  
  public void validateUserName() throws EncryptedDocumentException, IOException
 {
	Assert.assertEquals(dash.getActualUserName(),Utility.readDataFromExcel(0, 2),"Actual and Expexted user names are not matching Tc is failed");
 }
@AfterMethod

   public void logOutFromneostox() throws InterruptedException
 {
	dash.logOutFromNeoStox();
 }
@AfterClass
 
   public void closeNeoStoxApp() throws InterruptedException
 {
	driver.close();
	Reporter.log("Closing Application", true);
	Thread.sleep(500);
 }
}
