package tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.AuditAndControl;
import pages.Login;


public class BaseClass {

	public  WebDriver driver;
	
	int PAGE_LOAD_TIMEOUT = 80;
	int IMPLICIT_WAIT = 5;

	@BeforeClass
	public void Setup() throws InterruptedException {

		// Access the chromerDriver.exe file
		
		String directory = System.getProperty("user.dir");
		String newdir = directory.replaceAll("actions", "");
    	System.setProperty("webdriver.chrome.driver", newdir + "\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);

		Login l = new Login(driver);
		l.CAMloginURL();
		
		AuditAndControl a = new AuditAndControl(driver);
		a.auditAndView();

	}	

	@AfterClass
	public void teardown(){

		//driver.close();
	}


}
