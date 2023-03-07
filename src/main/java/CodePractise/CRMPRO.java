package CodePractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMPRO {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		List<WebElement> links = driver.findElements(By.tagName("small"));
		int count = 0;

		for (WebElement e : links) {
			String text = e.getText();
			if (text.length() > 0) {
				System.out.println(count + "-->" + text);
			}
			count++;
		}

	}

}
