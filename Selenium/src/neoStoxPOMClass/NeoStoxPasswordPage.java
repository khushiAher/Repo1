package neoStoxPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxPasswordPage 
{
  @FindBy(id ="txt_accesspin") private WebElement passwordField;
  
  @FindBy(id ="lnk_submitaccesspin") private WebElement submitBtton;
  
     public NeoStoxPasswordPage(WebDriver driver)
  { 
	   PageFactory.initElements(driver, this);
  }
     public void EnterPassword(String password)
  {
       passwordField.sendKeys(password);
       Reporter.log("Enter Password", true);
  }
     public void ClickOnSubmitButton()
  {
       submitBtton.click();
       Reporter.log("Click on submit button", true);
       
       
       
  }
}
