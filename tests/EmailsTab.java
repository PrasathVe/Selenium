package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.EmailsPage;

public class EmailsTab extends BaseClass {
	
	//EmailsPage emails = new EmailsPage(driver);

	@Test(priority=1)
	void ValidateEmailsTabClick() throws InterruptedException{
		EmailsPage emails = new EmailsPage(driver);
		emails.EmailsTabClick();
	}

	@Test(priority=2)
	void validateSubjectPopUp() throws InterruptedException {

		EmailsPage emails = new EmailsPage(driver);
		emails.subjectPopUp();	
	}

	
	@Test(priority=3)
	void validateRecepientsPopUp() throws InterruptedException {
		EmailsPage emails = new EmailsPage(driver);
		emails.recepientsPopUp();
	}
	
	@Test(priority=4)
	void validateAttachmentPopUp() throws InterruptedException {

		EmailsPage emails = new EmailsPage(driver);
		emails.attachmentPopUp();

	}

	

	@Test(priority=5)
	void validateMailboxPopUp() throws InterruptedException {
		
		EmailsPage emails = new EmailsPage(driver);
		emails.mailboxPopUp();
	}
	
	@Test(priority=6)
	void ValidateemailQuarantineButtonClick() throws InterruptedException {
		
		EmailsPage emails = new EmailsPage(driver);
		emails.emailQuarantineButtonClick();
	}

	@Test(priority=7)
	void validateEmailDeleteButtonClick() throws InterruptedException {
		// Click on the delete pop-up
		driver.findElement(By.xpath("")).click();

		Thread.sleep(1000);

		// Click on the cancel button
		driver.findElement(By.xpath("//div[@class='modal-footer']/button[2]")).click();
	}

	@Test(priority=7)
	void validatePreviewButtonClick() throws InterruptedException{


		Thread.sleep(1000);


		//Click on the preview icon
		driver.findElement(By.xpath("//*[@id='JColResizer0']/tbody/tr[1]/td[8]/span[4]/a")).click();

		Thread.sleep(500);

		String Parenthandle = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);

			Thread.sleep(500);

		}

		driver.switchTo().window(Parenthandle);

		Thread.sleep(500);

	}

	@Test(priority=8)
	void validateSVEButtonClick() throws InterruptedException{

		Thread.sleep(1000);

		//Click on the share via email icon
		driver.findElement(By.xpath("//*[@id='JColResizer0']/tbody/tr[1]/td[8]/span[5]")).click();

		Thread.sleep(1000);


		//Click on the cancel button
		driver.findElement(By.xpath("//*[@id='sendEmailModal']/div/div/div[3]/button[2]")).click();


	}



}
