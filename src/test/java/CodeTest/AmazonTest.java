package CodeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AmazonTest {
	
	static WebDriver driver;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class ");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	System.out.println("Before Method");
	}
	
	@Test
	public void AmazonTest()
	{
		String str=driver.getTitle();
		System.out.println(str);
		Assert.assertEquals(str, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test
	public void AmazonSellBtnTest()
	{
		Boolean sellbtn=driver.findElement(By.linkText("Sell")).isDisplayed();
		Assert.assertTrue(sellbtn);
	}
	
	@Test
	public void ClickOnsellBtn()
	{
		WebElement Ele=driver.findElement(By.linkText("Sell"));
		Ele.click();
		WebElement sellText= driver.findElement(By.xpath("//h2[text()='Sell on Amazon']"));
		System.out.println(sellText);
		Assert.assertEquals(sellText, "Sell on Amazon");
	}
	
	
	
	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("I am in After class");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I am in After suite");
	}

}
