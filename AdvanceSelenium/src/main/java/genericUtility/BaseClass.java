package genericUtility;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentSparkReporter reporter;
	public static ExtentReports report;
	public static ExtentTest logger;
	
	@BeforeSuite(alwaysRun=true)
	public void launchingBrowser() {
		reporter=new ExtentSparkReporter("./Reports/extentdemo.html");
		report=new ExtentReports();
		report.attachReporter(reporter);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@BeforeClass(alwaysRun=true)
	public void navigatingToApp() 
	{
		//driver.get("https://demo.actitime.com/login.do");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		logger.log(Status.INFO, "successfully navigated to application");
	}
	@AfterMethod
	public void checkingfailure(ITestResult result)throws IOException{
		if(result.getStatus()==result.FAILURE) {
			ScreenshotUtility.takingScreenshot(result.getName());
			System.out.println(result.getName());
			logger.log(Status.FAIL,"the test script"+result.getName()+"is failed");

		}
	}

	@AfterClass
	public void loggingOut()
	{
		System.out.println("Logout");
		logger.log(Status.INFO,"Logged out from application");
	}
	@AfterSuite
	public void tearDownTheBrowser() {
		driver.quit();
		logger.log(Status.INFO,"Closed the browser");
		report.flush();
	}
}
