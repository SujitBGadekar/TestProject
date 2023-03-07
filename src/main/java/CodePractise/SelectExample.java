package CodePractise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=42");

		By dropdown = By.id("input-option217");
		// List<String> list=new ArrayList<String>();
//		Select select=new Select(driver.findElement(dropdown));
//	//	select.selectByIndex(1);
//	//	select.selectByValue("3");
//		select.selectByVisibleText("Green (+$1.20)");
		By dropdownlist = By.xpath("//select[@id='input-option217']/option");
		List<WebElement> listElement = driver.findElements(dropdownlist);
		int count = 0;
		for (WebElement e : listElement) {
			String text = e.getText();
			if (text.length() > 0) {
				if (text.equals("Yellow (+$2.40)")) {
					e.click();
				}
			}
		}

	}

}
