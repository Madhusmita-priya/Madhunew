package homeModule;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ScreenshotUtility;
import genericUtility.UtilityMethods;

public class Selecting extends BaseClass
{
	@Test
	public void demo1223232() throws InterruptedException, IOException {
		//assertEquals(false,true);
//	}
	//public void demo() throws InterruptedException, IOException {
		/*WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		UtilityMethods method=new UtilityMethods();
		method.SelectUtility(dropdown, "1");
		Thread.sleep(500);
		ScreenshotUtility.takingScreenshot("MyScreenshot");*/
		//assertEquals(true,false);

	WebElement elem=driver.findElement(By.name("CheckBoxOption1"));
	elem.click();
	assertEquals(elem.isSelected(),true);
	logger.log(Status.PASS,"Passed");
	}
}
