package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturedScreenShots {
	
public static void captureImages(WebDriver driver, String imagename) throws IOException {
		
		TakesScreenshot scrnshot=(TakesScreenshot) driver;
		
		File sourceFile=scrnshot.getScreenshotAs(OutputType.FILE);
		
		File saveTo= new File("./CapturedScreenShots/"+imagename+".png");
		
		FileHandler.copy(sourceFile, saveTo);
		
	}

}
