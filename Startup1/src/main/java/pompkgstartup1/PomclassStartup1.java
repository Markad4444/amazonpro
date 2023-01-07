
package pompkgstartup1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.Require;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomclassStartup1 extends Utilityclassstatup1 {
	WebDriver driver;
	@FindBy(id = "nav-link-accountList-nav-line-1")
	private WebElement Tomovelogin;
	@FindBy(xpath = "//span[text()='Sign in']")
	private WebElement Lbtn;
	@FindBy(id = "ap_email")
	private WebElement username;
	@FindBy(id = "continue")
	private WebElement continuebtnafterusername;
	@FindBy(id = "ap_password")
	private WebElement passwordfield;
	@FindBy(id = "signInSubmit")
	private WebElement signinsubmitbtn;
	@FindBy(xpath = "//span[text()='Hello, vitthal']")
	private WebElement homepageusername;
	@FindBy(xpath = "//span[text()='Sign Out']")
	private WebElement signoutbtn;

	public PomclassStartup1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	/*
	 * public Login_Page(WebDriver driver) { PageFactory.initElements(driver, this);
	 * this.driver=driver; }
	 */
	public void moveTologin1() {
		togetanduseactionmethod(driver, Tomovelogin);
	}

	public void toClickloginbtn2() {
		togetExplicitwait(driver, Lbtn);
		Lbtn.click();
	}

	public void toPutusename3() {
		togetExplicitwait(driver, username);
		username.sendKeys("vitthalmarkad4444@gmail.com");
	}

	public void afterusernamecontinue4() {
		togetExplicitwait(driver, continuebtnafterusername);
		continuebtnafterusername.click();
	}

	public void toEnterpass5() {
		togetExplicitwait(driver, passwordfield);
		passwordfield.sendKeys("Flipkart@123");
	}

	public void togoHomepagebtnclick6() {
		togetExplicitwait(driver, signinsubmitbtn);
		signinsubmitbtn.click();
	}

	public String togetuserprofileName7() throws InterruptedException {
		togetExplicitwait(driver, homepageusername);
		togetanduseactionmethod(driver, homepageusername);
Thread.sleep(3000);
		String profilename = signinsubmitbtn.getText();
		return profilename;
	}

	public void toMouseoveruserprofile8() {
		togetanduseactionmethod(driver, homepageusername);

	}

	public void toclicklogout9() {
		togetExplicitwait(driver, signoutbtn);
		signoutbtn.click();
	}
}