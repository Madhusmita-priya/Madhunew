package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotUtility extends BaseClass implements IAutoConstants{
	public static void takingScreenshot(String screenshotName) throws IOException {
		//WebDriverManager.chromedriver().setup();

		/*TakesScreenshot screenshot=(TakesScreenshot) driver;
		File photo=screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File(ERRORSHOTS+screenshotName+".png");
		FileUtils.copyFile(photo,dest);*/
		
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File photo=screenshot.getScreenshotAs(OutputType.FILE);
		String ldt=LocalDateTime.now().toString().replace(":", "-");
		File dest=new File(ERRORSHOTS+screenshotName+" "+ldt+".png");
		FileUtils.copyFile(photo, dest);
		
	}
}
