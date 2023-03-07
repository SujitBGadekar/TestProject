package CodeTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CodeTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	
	public boolean LoginTest(String username,String password)
	{
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']"));
		return true;
	}
	
	@Test(dataProvider = "getLoginData")
	public void loginTest(String username,String password)
	{
		boolean flag=LoginTest(username,password);
		     
	}
	
	@DataProvider
	public Object[][] getLoginData(){
		
		return new Object[][] {
			{"ABCD","EXY" },
			{"POFH","NFGH"},
		};
	}
	
}
