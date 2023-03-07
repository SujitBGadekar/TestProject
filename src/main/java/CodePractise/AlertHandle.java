package CodePractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
//		Thread.sleep(300);
//		Alert alert=driver.switchTo().alert();
//		alert.accept();
		
//		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//		Thread.sleep(300);
//		Alert alert=driver.switchTo().alert();
//		alert.dismiss();
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Thread.sleep(300);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("GOOD");
		Thread.sleep(3000);
		alert.accept();
		
			
		
	}

}
