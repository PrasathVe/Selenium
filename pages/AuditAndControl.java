package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuditAndControl {
	
	WebDriver driver;

	public AuditAndControl(WebDriver driver) {
		this.driver = driver;
	}
	
	public void auditAndView() throws InterruptedException {

		Thread.sleep(10000);
		// Click on Audit and Control tab
		driver.findElement(By
				.xpath("//a[@href='/Hubble/servlet/MainServlet?activetop=auditcontrol&id=auditcontrolroot&activemessage=saas']"))
		.click();

		Thread.sleep(1000);

		// Click on the View button of the oauth
		driver.findElement(By.xpath("//div [@class='reportContent']/p[text()='G Suite']/../p[3]/a[text()='View']"))
		.click();

		Thread.sleep(2000);
	}

	

}
