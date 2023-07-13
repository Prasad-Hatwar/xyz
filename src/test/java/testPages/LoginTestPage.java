package testPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ecomm.baseclass.baseclass;
import ecomm.pages.HomePage;
import ecomm.pages.LoginPage;

public class LoginTestPage extends baseclass{
	
	HomePage hp;
	LoginPage lp;
	
	
	@BeforeMethod
	public void lounchBrowser() {
		intialBrowser();
		hp=new HomePage();
		lp=new LoginPage();
		
	}
	@Test
	public void testLogin() {
		
		hp.verifySignIn();
		lp.verifyLogin();
	}
	@AfterMethod
	public void quiteBrowser() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
