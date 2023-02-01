package neoStoxPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

    public class NeoStoxSignInPage
{
 @FindBy(id ="MainContent_signinsignup_txt_mobilenumber")private WebElement mobNumField;
 
 @FindBy(xpath ="(//a[text()='Sign In'])[2]")private WebElement signInButton;

    public NeoStoxSignInPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
    public void enterMobileNumber(String mobNum)
    
  {
      mobNumField.sendKeys(mobNum);
      Reporter.log("Enter mobile number", true);
  }
    public void clickOnSignInButton()
  {
     signInButton.click();
     Reporter.log("Click on signIn button", true);
  }
}

