package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EmailsPage extends BasePage {
	WebDriver driver;
	Object Locator = By.className("fileFolderInfoPopup");

	public EmailsPage(WebDriver driver) {
		this.driver = driver;
		this.js = (JavascriptExecutor) this.driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='allPageLengthEmailAttachments']/option[1]")
	WebElement EmailTwentyfivePaginationValue;

	@FindBy(xpath = "//*[@id='allPageLengthEmailAttachments']/option[2]")
	WebElement EmailFiftyPaginationValue;

	@FindBy(xpath = "//*[@id='allPageLengthEmailAttachments']/option[3]")
	WebElement EmailHundredPaginationValue;

	@FindBy(xpath = "//*[@id='allPageLengthEmailAttachments']/option[4]")
	WebElement EmailTwohundredPaginationValue;

	@FindBy(xpath = "//*[@id='allPageLengthEmailAttachments']/option[5]")
	WebElement EmailFivehundredPaginationValue;

	@FindBy(xpath = "//div[@class='sub-tabs']/ul/li[5]")
	WebElement EmailsTab;

	@FindBy(xpath = "//table[@id='JColResizer0']/tbody/tr/td/span")
	WebElement FirstEmailSubject;

	@FindBy(xpath = "//ul[@class='optionsTabs internal']/li[1]/a")
	WebElement EmailBasicSubTab;

	@FindBy(xpath = "//div[@class='fileFolderInfoPopup']/div[2]/button")
	WebElement CancelButton;

	@FindBy(xpath = "//*[@class='colorBlue attachmentCount EMAILS_BASIC_INFO_VIEW']")
	WebElement FirstEmailwAttachment;

	@FindBy(xpath ="//ul[@class='optionsTabs internal']/li[3]/a")
	WebElement AttachmentSubTab;

	@FindBy(xpath ="//td[@class='colorBlue emailRecipients']/span")
	WebElement FirstERecepient;

	@FindBy(xpath ="//ul[@class='optionsTabs internal']/li[2]/a")
	WebElement RecepientSubTab;

	@FindBy(xpath ="//td[@class='colorBlue mailboxCount']/span")
	WebElement FirstEMailbox;

	@FindBy(xpath = "//ul[@class='optionsTabs internal']/li[5]/a")
	WebElement MailboxSubTab;

	@FindBy(xpath = "//a[@id='quarantineAction']")
	WebElement FirstEQuarantine;
	
		@FindBy(xpath = "//a[@id='deleteAction']")
		WebElement FirstEDelete;
	//	
	//	@FindBy(xpath ="//ul[@class='optionsTabs internal']/li[3]/a")
	//	WebElement AttachmentSubTab;


	public void EmailsTabClick() throws InterruptedException {
		Thread.sleep(2000);
		EmailsTab.click();
	}

	public void subjectPopUp() throws InterruptedException {

		Thread.sleep(500);

		// Click on the subject name of the first email in the Page
		FirstEmailSubject.click();

		// Wait until the pop-up loads
		ExplicitWait(Locator, driver);

		// Check if the pop-up is pointing to Basic sub-tab in the pop-up
		String actualBasicTab = EmailBasicSubTab.getText();
		String expectedBasic = "Basic";
		ValidateTabHeading(actualBasicTab, expectedBasic, driver);

		// Click on the cancel button of the pop-up
		Thread.sleep(500);
		CancelButton.click();

	}

	public void attachmentPopUp() throws InterruptedException{

		// Find the first email that has attachments and get the number of
		// attachments displayed in the attachments column
		//String AttachmentCount = FirstEmailwAttachment.getText();
		//System.out.println("The no.of attachments present in the attachments column is:" + AttachmentCount);

		Thread.sleep(500);

		// Find the first email that has attachments
		FirstEmailwAttachment.click();

		// Wait until data in the pop-up loads
		ExplicitWait(Locator, driver);

		//		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className("fileFolderInfoPopup")));

		// Check if the pop-up is pointing to the attachments sub-tab
		String actualAttachmentsTab = AttachmentSubTab.getText();
		String expectedAttachmentsTab = "Attachments";
		ValidateTabHeading(actualAttachmentsTab, expectedAttachmentsTab, driver);

		// Wait until the attachments data loads in the pop-up
		//		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		//		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.className("attachmentDataCntBlk")));
		//
		//		// Get the count of attachments present in the attachments sub-tab of
		//		// the pop-up
		//		int attachmentsPopUp = driver.findElements(By.className("attachmentDataCntBlk")).size();
		//		System.out.println("The number of attachments present in the pop-up is : " + attachmentsPopUp);
		// Click on the cancel button
		Thread.sleep(500);
		CancelButton.click();
		Thread.sleep(600);

	}

	public void recepientsPopUp() throws InterruptedException{

		// Find the first email with recipients and get the count of the
		// recipients
		//		String RecepientColumn = FirstERecepient.getText();
		//		System.out.println("The number of recipients present in the Recipients column is: " + RecepientColumn);

		Thread.sleep(200);

		// Click on the email that has recipients
		FirstERecepient.click();

		// Wait until the pop-up has loaded
		ExplicitWait(Locator, driver);

		// Check if the pop-up is pointing to the Recipients sub-tab
		String actualRecipientsTab = RecepientSubTab.getText();
		String expectedRecipientsTab = "Recipients";
		ValidateTabHeading(actualRecipientsTab, expectedRecipientsTab, driver);
		//
		//
		//		// Wait until the sharers details loads in the pop-up
		//		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		//		wait5.until(ExpectedConditions.visibilityOfElementLocated(By.className("SharedUsersInfo")));
		//
		//		// Get the number of internal domain users present in the pop-up
		//		int InternalDomainCount = driver.findElements(By.xpath("//div[@id='sharesIntDomain']/ul/li")).size();
		//		System.out.println("No.of Internal Domain accounts present in the pop-up is : " + InternalDomainCount);
		//
		//		// Click on the External Domains tab
		//		driver.findElement(By.xpath("//ul[@class='ownerShareTabs']/li[2]/a[contains(text(),'External Domain ')]"))
		//		.click();
		//
		//		// wait until the external sharers details loads
		//		WebDriverWait wait6 = new WebDriverWait(driver, 20);
		//		wait6.until(ExpectedConditions.visibilityOfElementLocated(By.id("sharesExtDomain")));
		//
		//		// Get the number of external domain users present in the pop-up
		//		int ExternalDomainCount = driver.findElements(By.xpath("//div[@id='sharesExtDomain']/ul/li")).size();
		//		System.out.println("No.of External Domain accounts present in the pop-up is : " + ExternalDomainCount);
		//
		//		int TotalAccounts = InternalDomainCount + ExternalDomainCount;
		//
		//		System.out.println("Total number of recipients present in the pop-up are:" + TotalAccounts);

		Thread.sleep(200);

		// Click on the cancel button of the pop-up
		CancelButton.click();
		Thread.sleep(500);

	}

	public void mailboxPopUp() throws InterruptedException {

		// Get the count of mailbox of the first email present
		//	String MailboxCount = FirstEMailbox.getText();
		//	System.out.println("The count of mailbox present is: " + MailboxCount);

		Thread.sleep(500);

		// Click on the first mailbox pop-up
		FirstEMailbox.click();

		// Wait until the pop-up has loaded
		ExplicitWait(Locator, driver);

		// Check if the pop-up is pointing to Mailbox Tab
		String actualMailboxTab = MailboxSubTab.getText();
		String expectedMailboxTab = "Mailbox";
		ValidateTabHeading(actualMailboxTab, expectedMailboxTab, driver);

		//	// Wait until the mailbox content loads
		//	WebDriverWait wait8 = new WebDriverWait(driver, 10);
		//	wait8.until(ExpectedConditions.visibilityOfElementLocated(By.className("mailboxDataCntBlk")));
		//
		//	// Display the count of the mailboxes present
		//	int MailboxPopUp = driver.findElements(By.className("mailboxDataCntBlk")).size();
		//	System.out.println("The count of mailboxes present in the pop-up is:" + MailboxPopUp);

		Thread.sleep(1000);

		// Click on the cancel button
		Thread.sleep(500);
		CancelButton.click();

	}


	public void emailQuarantineButtonClick() throws InterruptedException {
		Thread.sleep(500);
		// Click on the quarantine pop-up
		FirstEQuarantine.click();
		Thread.sleep(500);

		// Click on the cancel button
		CancelButton.click();

		Thread.sleep(1000);
	}

	public void emailDeleteButtonClick() throws InterruptedException {
		// Click on the delete pop-up
		FirstEDelete.click();

		Thread.sleep(1000);

		// Click on the cancel button
		CancelButton.click();
	}

}

