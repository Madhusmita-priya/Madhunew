package basics;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase01_Test extends BaseClass {
@Test
public void testcase() throws InterruptedException 
{
	
driver.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(100);
	driver.findElement(By.name("pwd")).sendKeys("Manager");
	driver.findElement(By.id("loginButton")).click();
	
	
}
}