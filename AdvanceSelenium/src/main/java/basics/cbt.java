package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cbt {
	public static WebDriver driver;
	@Test
	@Parameters("browser")
	public void crossBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	}

}
