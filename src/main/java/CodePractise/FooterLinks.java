package CodePractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		List<WebElement> footerlinks=driver.findElements(By.tagName("a"));
		
		int count=0;
		for(WebElement e:footerlinks)
		{
			String text=e.getText();
			if(text.length()>0)
			{
				System.out.println(count+"-->"+text);
			}
			count++;
		}
		
		
}
}	
