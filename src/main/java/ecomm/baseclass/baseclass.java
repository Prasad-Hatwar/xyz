package ecomm.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import utility.WebEventLogger;
@SuppressWarnings("deprecation")
public class baseclass {
	
	 public static WebDriver driver;
	 public static  Properties prop;
	 public static WebEventLogger logger;
	
	public static EventFiringWebDriver firingdriver;
	
	
	public baseclass()  {
		prop=new Properties();
	FileInputStream fInput;
	
	
		try {
			fInput = new FileInputStream("../Ecomm-Biz/src/main/java/utility/config.properties");
			prop.load(fInput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
	
	}
	public static void intialBrowser() {
		
		driver =new ChromeDriver();
		logger=new WebEventLogger();
		firingdriver=new EventFiringWebDriver(driver);
		
		firingdriver.register(logger);
		driver=firingdriver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(prop.getProperty("baseUrl"));
	}

}
