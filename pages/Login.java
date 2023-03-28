package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.util.Properties;

public class Login {


	WebDriver driver;


	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void CAMloginURL() throws InterruptedException {

		//driver.get(prop.getProperty("GoogleURL"));
		
		
//		// Login to Google.com
		driver.get("https://www.google.com");

		Thread.sleep(200);

		// Maximize the window
		driver.manage().window().maximize();

		Thread.sleep(400);

		// Login to the desired test server
		driver.get("https://qakuliza.managedmethodsdev.com/Hubble/servlet/LoginServlet");

		Thread.sleep(2000);
		//Enter the user name and password
		driver.findElement(By.id("username")).sendKeys("MMsupport");
		driver.findElement(By.id("password")).sendKeys("!MM$upp@rt^tr@ppu$MM32*");

		

		Thread.sleep(2000);


//		//enter the reason
//		driver.findElement(By.xpath("//*[@id='loginReason']")).sendKeys("test");
//
//
//		Thread.sleep(2000);
//		
		Thread.sleep(1500);

		// Click on the login button
		driver.findElement(By.xpath("//*[@id='loginForm']/div/button")).click();


//		// Click on the login button
//		driver.findElement(By.xpath("//*[@id='loginForm']/div/button")).click();

//		Thread.sleep(1000);
//		// Wait till the captcha is manually passed , if prompted
//		Thread.sleep(35000);

	}


	


}


