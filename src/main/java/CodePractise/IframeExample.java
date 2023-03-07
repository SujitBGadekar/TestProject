package CodePractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser - ch

		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("ABCDRT");
		
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("VBNT");
		
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("HonDA");
		
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("RED");
		
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("45");
		
		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("MH13");
		
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("TOM");
		
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("LA");
		
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("NAL HFU 20");
		
		driver.findElement(By.id("RESULT_TextField-11")).sendKeys("California");
		
//		List<WebElement> citylist = driver.findElements(By.xpath("//select[@id='RESULT_RadioButton-12']/option"));//select[@id='RESULT_RadioButton-12']
//		Select city=new Select(citylist);
		
		//driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("FSsubmit")).click();
		
		
		

	}

}
