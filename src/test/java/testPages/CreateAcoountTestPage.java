package testPages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ecomm.baseclass.baseclass;
import ecomm.pages.CreateAccountPage;
import ecomm.pages.HomePage;
import ecomm.pages.LoginPage;
import utility.UtilExcel;

public class CreateAcoountTestPage extends baseclass {
	
	CreateAccountPage createpage;
	HomePage hp;
	String sheetName="customersDetails";
	LoginPage lp;

	public CreateAcoountTestPage() {
		super();
	}
	
	@BeforeMethod
	public void lounchBrowser() {
		
		intialBrowser();
		hp=new HomePage();
		createpage= new CreateAccountPage();
		lp=new LoginPage();
		
		hp.verifySignIn();
		lp.verifycreatAccount();
		
		
		
	}
	
	@DataProvider
	public Object[][] getExcelData() {
		Object[][] accData=UtilExcel.getTestData(sheetName);
		return accData;
		
	}
	@Test(dataProvider = "getExcelData" )
	public void testCreateAccount(String fn,String ln,String email,String passwd) {
		createpage.verifyCreateAccount(fn, ln, email, passwd);
	}
	
	
	
	
}
