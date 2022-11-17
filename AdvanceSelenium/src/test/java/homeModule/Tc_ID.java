package homeModule;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.JavaScriptExcecutorUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.UtilityMethods;

@Test
public class Tc_ID extends BaseClass{
	public void TestCaseDescription() throws IOException, InterruptedException {
		/*WebElement email = driver.findElement(By.id("Email"));
		WebElement password = driver.findElement(By.id("Password"));
		WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
		String username=PropertyFileUtility.PropertyReader("username");
		email.sendKeys(username);
		password.sendKeys(PropertyFileUtility.PropertyReader("password"));
		login.click();

		JavaScriptExcecutorUtility.js.executeScript("history.go();");
		JavaScriptExcecutorUtility.js.executeScript("window.scrollBy(100,200)");
		Thread.sleep(2000);
		UtilityMethods.ActionsUtility(driver).moveToElement(login).perform();*/
		assertEquals(false, true);

		/*UtilityMethods.ActionsUtility(driver).sendKeys(email, "hello").perform();
		UtilityMethods.ActionsUtility(driver).sendKeys(password,"password").perform();
		UtilityMethods.ActionsUtility(driver).click(login).perform();
		/*
		 * JavaScriptExcecutorUtility.EnteringDataToELementsUsingJavaScript(email,
		 * "hcsm166");
		 * JavaScriptExcecutorUtility.EnteringDataToELementsUsingJavaScript(password,
		 * "demo1223234");
		 * JavaScriptExcecutorUtility.clickingOnELementUsingJavaScript(login);
		 */	}


}
