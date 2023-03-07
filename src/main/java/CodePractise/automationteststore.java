package CodePractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automationteststore {
	
//	@FindBy(xpath = "//input[@name='quantity']")
//	static WebElement quantityTextbx;
//	
	
	

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationteststore.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		By homeMenu=By.xpath("//a[text()='Home']");
		By specialsBtn=By.linkText("Specials");
		
		By absouluetxpath=By.xpath("//div[@class='fixed']//a[text()='Absolue Eye Precious Cells']");
		
		By addbtn=By.cssSelector("i.fa.fa-cart-plus");
		
		By addquantity=By.xpath("//input[@name='quantity']");
		
		
		
		//	driver
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement HomeMenu=wait.until(ExpectedConditions.visibilityOfElementLocated(homeMenu));
		Actions action=new Actions(driver);
		action.moveToElement(HomeMenu).build().perform();
	//	HomeMenu.click();
		WebElement specialsBtnclick=wait.until(ExpectedConditions.visibilityOfElementLocated(specialsBtn));
		
		
		
		specialsBtnclick.click();
		
		WebElement absoluteElementclk=wait.until(ExpectedConditions.visibilityOfElementLocated(absouluetxpath));
		absoluteElementclk.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(addquantity));
		driver.findElement(addquantity).clear();
		driver.findElement(addquantity).sendKeys("3");
		
		driver.findElement(addbtn).click();
		
		
		
		

	}
	
	

}
