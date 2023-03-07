package CodePractise;

public class YourStore {

	public static void main(String[] args) {
		
		BrowserUtil util=new BrowserUtil();
		String browserName="Chrome";
		
		util.initDriver(browserName);
		util.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		String acttitle=util.getPageTitle();
		if(acttitle.contains("Your Store"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		String acturl=util.getPageURl();
		if(acturl.contains("naveenautomationlabs"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		util.closeBrowser();

	}

}
