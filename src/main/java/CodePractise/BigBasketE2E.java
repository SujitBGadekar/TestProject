package CodePractise;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class BigBasketE2E {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions co = new ChromeOptions();
//		co.setHeadless(true);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
	
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.meganav-shop")).click();
		
		Actions act=new Actions(driver);
		WebElement L1=driver.findElement(By.linkText("Snacks & Branded Foods"));
		act.moveToElement(L1).build().perform();
		Thread.sleep(1000);
		
		WebElement L2=driver.findElement(By.linkText("Snacks & Namkeen"));
		act.moveToElement(L2).build().perform();
		Thread.sleep(1000);
		
//		WebElement L3=driver.findElement(By.xpath("//a[text()='Pet Meals & Treats']"));
//		L3.click();
		
		
		WebElement L3=driver.findElement(By.linkText("Chips & Corn Snacks"));
		L3.click();
		Thread.sleep(3000);
		
		
		WebElement L4=driver.findElement(By.xpath("//a[text()='Yumitos Potato Chips - Original Style']"));
		L4.click();
		Thread.sleep(3000);
		
//		WebElement L5=driver.findElement(By.xpath("(//button[@qa='add'])[1]"));
//		L5.click();
//		Thread.sleep(1000);
		
		WebElement L6=driver.findElement(By.xpath("//span[text()='ADD TO BASKET']"));
		L6.click();
		
		
		
//		WebElement L4=driver.findElement(By.xpath("//a[text()='Mini Chopper With 3 Blades - For Cutting Vegetables & Fruits, Red, 1 pc']"));
//		L4.click();
//		Thread.sleep(1000);
//		
//		WebElement addBasket=driver.findElement(By.xpath("//span[text()='ADD TO BASKET']"));
//		addBasket.click();
		
		
		
		
		
		
		
		
		
	}

}


		





