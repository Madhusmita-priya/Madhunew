package basics;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ReceivingParameter 
{
@Test
@Parameters({"Selenium","java "})
	//protected void data1(String data,String data1) 
//{
	protected void data1(@Optional ("this is selenium")String data,@Optional("This is java")String data1) {
	System.out.println(data);
	System.out.println(data1);

	}

}
