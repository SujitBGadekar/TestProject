package CodePractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	private WebDriver driver;
	
	public WebDriver initDriver(String browserName)
	{
		System.out.println("Browser name is:"+browserName);
		
		switch(browserName)
		{
		case "Chrome":
			driver=new ChromeDriver();
			break;
		case "Edge":
			driver=new EdgeDriver();
			break;
		case "Firefox":
			driver=new FirefoxDriver();
			break;
		default:
			System.out.println("Please Provide Valid Browser Name");
			break;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return driver;
	
		
	}
	
	public void launchUrl(String url)
	{
		if(url==null) {
			System.out.println("URL can not be null");
		}
		if(url.indexOf("https")==0)
		{
			driver.get(url);		
		}
	}
	
	public String getPageTitle() {
		String title=driver.getTitle();
		System.out.println("page title" +title);
		return title;
	}
	
	public String getPageURl() {
		String url=driver.getCurrentUrl();
		System.out.println("Page Url"+url);
		return url;
	}
	
	public void closeBrowser()
	{
		if(driver!=null) {
			driver.close();
		}
	}
	
	public void quiteBrowser()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
	
	
	
}