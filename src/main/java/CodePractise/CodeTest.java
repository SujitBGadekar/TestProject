package CodePractise;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
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

public class CodeTest {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			
		driver= new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/sa20-2022-23-1335268/mi-cape-town-vs-pretoria-capitals-20th-match-1343960/full-scorecard");
		
		
		By wicketTaker=By.xpath("//span[text()='Eathan Bosch']/ancestor::td/following-sibling::td//span/span");
		By scoreCard=By.xpath("//span[text()='Clyde Fortuin']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]");
		
//		String text=getElement(wicketTaker).getText();	
//		System.out.println(text);
		
		getScoreCard("Senuran Muthusamy");
		
		
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void getScoreCard(String PayerName)
	{
		List<WebElement> scoreCard=driver.findElements(By.xpath("//span[text()='"+PayerName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> ScoreCardList=new ArrayList<String>();
		for(WebElement e:scoreCard)
		{
			String text=e.getText();
			System.out.println("Score Details==>"+text);
			ScoreCardList.add(text);
		}
		}
	
	
	
	

}
