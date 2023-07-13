package testPages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ecomm.baseclass.baseclass;
import ecomm.pages.HomePage;

public class HomeTestPage extends baseclass {
	HomePage homepage;
	
	public HomeTestPage() {
		super();
		
	}
	
	@BeforeMethod
	public void lounchBrowser() {
		intialBrowser();
		homepage=new HomePage();
		
	}
	
	@Test(priority = 1)
	public void testPagetitle() {
		Assert.assertEquals(homepage.verifyPageTitile(),"Magento 2 Commerce (Enterprise) B2B Demo - Magebit","Expected page title not found");
	
	}
	
	@Test(priority = 2)
	public void testLogo() {
		
		boolean logocheck=homepage.verifyLogo();
		Assert.assertTrue(logocheck);
		
	}
	
	
	@Test(priority = 3)
	public void testSignInLink() {
		homepage.verifySignIn();
		
		
	}
	
	@AfterMethod
	public void quiteBrowser() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
