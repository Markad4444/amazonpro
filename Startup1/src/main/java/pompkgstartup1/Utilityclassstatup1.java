package pompkgstartup1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilityclassstatup1 {
public static void togetanduseactionmethod(WebDriver driver,WebElement element)
{  Actions act= new Actions(driver);
 act.moveToElement(element).pause(5).build().perform();
	}
public static void togetimplicitWait(WebDriver driver,int t)
{
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(t));	
}
public static WebElement togetExplicitwait(WebDriver driver, WebElement waitelement) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement element = wait.until(ExpectedConditions.visibilityOf(waitelement));
	return element;
}

}
