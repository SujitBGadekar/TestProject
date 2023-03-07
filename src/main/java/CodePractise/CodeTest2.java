package CodePractise;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class CodeTest2 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			
	driver= new ChromeDriver();
	driver.get("https://www.costco.com/");
	
	//Locators
	By shop=By.xpath("//a[@id='navigation-dropdown']");
	By computers=By.linkText("Computers");
	By computersw=By.linkText("Computer Software");
	By antivirus=By.linkText("Antivirus & Security Software");
	
	
	Actions action= new Actions(driver);
	action.moveToElement(getElement(shop)).build().perform();
	Thread.sleep(3000);
	
	action.moveToElement(getElement(computers)).build().perform();
	Thread.sleep(3000);
	
	action.moveToElement(getElement(computersw)).build().perform();
	Thread.sleep(3000);
	
	getElement(antivirus).click();
	
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	

}
