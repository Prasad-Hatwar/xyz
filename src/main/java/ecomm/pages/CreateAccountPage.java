package ecomm.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomm.baseclass.baseclass;

public class CreateAccountPage extends baseclass {
	
	public CreateAccountPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "firstname") WebElement firstName;
	@FindBy(id = "lastname") WebElement lastName;
	@FindBy(id="email_address") WebElement emailAddress;
	@FindBy(id="password") WebElement password;
	@FindBy(id="password-confirmation")WebElement passwordConfirm;
	
	@FindBy(xpath = "(//span[text()='Create an Account'])[3]")WebElement btnCrateAccount;
	
	
	
	public void verifyCreateAccount(String fName,String lName,String email,String passwd) {
		
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		emailAddress.sendKeys(email);
		password.sendKeys(passwd);
		passwordConfirm.sendKeys(passwd);
		
		btnCrateAccount.click();
	}
	

}
