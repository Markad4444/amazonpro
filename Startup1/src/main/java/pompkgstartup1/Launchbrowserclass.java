package pompkgstartup1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchbrowserclass {
static WebDriver driver;
	
	public static WebDriver getDriver(String browser)
	{
		if(driver == null)
		{
			if(browser.equals("chrome"))
			{
				driver = new ChromeDriver();
			}else if(browser.equals("firefox"))
			{
				driver = new FirefoxDriver();
				
			}
		
			driver.get("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
			driver.manage().window().maximize();
		}
		
		
		return driver;
		
	}
	
	
}
