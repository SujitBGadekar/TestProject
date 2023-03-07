package CodePractise;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FrameInterviewExample {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		
		Thread.sleep(9000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		String svgXpath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions' ]//*[name()='path']";
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		//driver.findElement(By.xpath("//*[local-name()='svg']//*[name()='g' and @id='massachusetts' ]")).click();
		//Thread.sleep(9000);
		List<WebElement> statesList=driver.findElements(By.xpath(svgXpath));
		System.out.println(statesList.size());
		
		for(WebElement e:statesList)
		{
			String stateName=e.getAttribute("name");
			System.out.println(stateName);
			if(stateName.equals("Maryland"))
			{
				e.click();
				break;
			}
		}
		
	
		
	}

}
