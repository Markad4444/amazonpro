package totest;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pompkgstartup1.Launchbrowserclass;
import pompkgstartup1.PomclassStartup1;

public class NewTest {
	WebDriver driver;
	PomclassStartup1 lp;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String bName) {

		driver = Launchbrowserclass.getDriver(bName);
	}

	@BeforeMethod()
	public void beforeMethod() {
		lp = new PomclassStartup1(driver);
		lp.moveTologin1();
		lp.toClickloginbtn2();
		lp.toPutusename3();
		lp.afterusernamecontinue4();
		lp.toEnterpass5();
		lp.togoHomepagebtnclick6();
	}

	@Test(timeOut=2000)
	public void test1() throws InterruptedException {
		String UN = lp.togetuserprofileName7();
		System.out.println(UN);
	}

	@AfterMethod
	public void aftermehtod() throws InterruptedException {
		Thread.sleep(4000);

		lp.toMouseoveruserprofile8();
		lp.toclicklogout9();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
