package ecomm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomm.baseclass.baseclass;

public class LoginPage extends baseclass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")WebElement emailId;
	@FindBy(id="pass") WebElement password;
	
	@FindBy(xpath = "(//button[@id='send2'])[1]") WebElement btnsingIn;
	
	@FindBy(xpath = "(//span[text()='Create an Account'])[3]") WebElement btnAccount;
	
	public HomePage verifyLogin() {
		emailId.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		btnsingIn.click();
		
		return new HomePage();
		
		
	}
	public CreateAccountPage verifycreatAccount()
	{
		btnAccount.click();
		return new CreateAccountPage();
	}

}
