package ecomm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ecomm.baseclass.baseclass;

public class HomePage extends baseclass {

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='logo']/img") WebElement logoImg;
	@FindBy(xpath = "(//li[@class='authorization-link']/a)[1]") WebElement singIn;
	@FindBy(xpath = "(//span[text()='Create an Account'])[1]") WebElement crateaccount;
	@FindBy(xpath = "(//a[text()='Create New Customer'])[1]") WebElement createCustomer;
	
	

	public String verifyPageTitile() {

		return driver.getTitle();
	}
	
	public boolean verifyLogo() {
		return logoImg.isDisplayed();
	}
	
	public LoginPage verifySignIn() {
		singIn.click();
		return new LoginPage();
	}
	public CreateAccountPage verifyCreateAccount() {
		crateaccount.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		createCustomer.click();
		
		return new CreateAccountPage();
	}
	
	
}
