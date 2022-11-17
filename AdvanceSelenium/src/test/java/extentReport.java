import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReport {
	@Test
	public void Extent() {
		ExtentSparkReporter	 reporter=new ExtentSparkReporter("./Report/report1.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		ExtentTest logger=report.createTest("Project");
		logger.pass("It is passed");
		logger.fail("it is fail");
		logger.info("it is informations");
		report.flush();

	}
}
