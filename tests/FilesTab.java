package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

public class FilesTab extends BaseClass{
	
   @Test(priority=1)
	void ValidateFilesTabClick()throws InterruptedException{

		//Click on Files tab
		driver.findElement(By.xpath("//div[@class='sub-tabs']/ul/li[4]/a")).click();
		Thread.sleep(1500);
	}


    @Test(priority=2)
	void ValidateFileNamePopUp() throws InterruptedException {
    	
    	Thread.sleep(1000);
		// Change the page length to 100
		driver.findElement(By.xpath("//select[@id='allPageLength']/option[3]")).click();

		Thread.sleep(1500);

		// Find the first file and click on its name
		driver.findElement(By.xpath("//*[@id='JColResizer0']/tbody/tr[1]/td[2]/span")).click();

		Thread.sleep(1500);

		String basicTab = driver.findElement(By.xpath("//div[@id='master-tab-content']/div/div/ul/li/a[1]")).getText();
		System.out.println("Click on Filename, pop-up tab is pointing to :" + basicTab);

		// Click on the cancel button
		driver.findElement(By.xpath("//div[@class='fileFolderInfoPopup']/div[2]/button")).click();

		Thread.sleep(1500);

	}

    @Test(priority=3)
	void ValidateWithinDUAPopUp() throws InterruptedException {

		// To print the count of the first file's within domain access value
		String count1 = driver.findElement(By.xpath("//*[@id='JColResizer0']/tbody/tr[1]/td[7]/span")).getText();
		System.out.println("Within doamin user access count displayed in the column is:" + count1);

		Thread.sleep(1500);

		// Click on the within 
		driver.findElement(By
				.xpath("//*[@id='JColResizer0']/tbody/tr[1]/td[7]/span"))
		.click();

		// Wait until the pop-up is loaded
		Thread.sleep(1500);

		// Check if the pop-up is pointing to Holders Tab
		String holdersTab = driver.findElement(By.id("tab3")).getText();
		System.out.println(holdersTab);
		if (holdersTab.equals("Holders"))
			System.out.println("The within domain user access tab is pointing to Holders");
		else {
			System.out.println("It is not pointing to Holders");
		}

		// Click on the cancel button
		driver.findElement(By.xpath("//div[@class='fileFolderInfoPopup']/div[2]/button")).click();

		Thread.sleep(1500);

	}

    @Test(priority=4)
	void ValidateSharesPopUp() throws InterruptedException {

		// Find the first file that has shares
		String SharersValue = driver.findElement(By.xpath("//td[@class='sharesEle']/span[2]")).getText();
		System.out.println("Count of sharers displayed in the sharers column is: " + SharersValue);

		Thread.sleep(1500);

		// Click on the first file that has shares
		driver.findElement(By.xpath("//td[@class='sharesEle']/span[2]")).click();

		// Wait until the pop-up loads shareDetails
		Thread.sleep(1500);

		// Check if the pop-up is pointing to Sharers Tab
		String SharersTab = driver.findElement(By.xpath("//li[@class='modal-sharers-tab active']/a")).getText();
		if (SharersTab.equals("Sharers")) {
			System.out.println("The Sharers pop-up is pointing to Sharers Tab");
		} else {
			System.out.println("The Sharers pop-up is not pointing to Sharers tab");
		}

		Thread.sleep(1500);

		// Get the count of Internal domain sharers
		int InternalSharers = driver.findElements(By.xpath("//div[@id='sharesIntDomain']/ul/li")).size();
		System.out.println("No.of Internal Domain accounts present in the pop-up is : " + InternalSharers);

		// Click on the External Domains tab
		driver.findElement(By.xpath("//ul[@class='ownerShareTabs']/li[2]/a[contains(text(),'External Domain ')]"))
		.click();

		// wait until the external sharers details loads
		Thread.sleep(1500);

		// Get the number of external domain users present in the pop-up
		int ExternalSharers = driver.findElements(By.xpath("//div[@id='sharesExtDomain']/ul/li")).size();
		System.out.println("No.of External Domain accounts present in the pop-up is : " + ExternalSharers);

		int TotalAccounts = InternalSharers + ExternalSharers;

		System.out.println("Total number of recipients present in the pop-up are:" + TotalAccounts);

		Thread.sleep(1500);

		// Click on the cancel button
		driver.findElement(By.xpath("//div[@class='fileFolderInfoPopup']/div[2]/button")).click();

		Thread.sleep(1500);
		if (driver.findElement(By.xpath("//td[@class='sharesEle']/span[2]")).isDisplayed()) {
			driver.findElement(By.xpath("//a[@id='unShareFileAction']/span")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//div[@class='modal-footer']/button[2]")).click();
		} else {
			System.out.println("Revoke share icon is not present as the file does not have shares");
		}

		Thread.sleep(1500);

	}

    @Test(priority=5)
	void ValidateQuarantineButtonClick() throws InterruptedException {
		// Click on the quarantine pop-up
		driver.findElement(By.xpath("//a[@class='moveFileToQuarantineAction']/span")).click();

		Thread.sleep(1000);

		// Click on the cancel button
		driver.findElement(By.xpath("//div[@class='modal-footer']/button[2]")).click();
		Thread.sleep(1000);

	}

    @Test(priority=6)
	void ValidateDeleteButtonClick() throws InterruptedException {
		// Click on the delete button
		driver.findElement(By.xpath("//a[@class='deleteFileAction']/span")).click();

		Thread.sleep(1000);
		// Click on the cancel button
		driver.findElement(By.xpath("//div[@class='modal-footer']/button[2]")).click();
		Thread.sleep(1000);
	}

    @Test(priority=7)
	void ValidateUnshareButtonClick() throws InterruptedException {

		Thread.sleep(1500);
		// Find the first file that has shares
		String SharersValue = driver.findElement(By.xpath("//td[@class='sharesEle']/span[2]")).getText();
		System.out.println("Count of sharers displayed in the sharers column is: " + SharersValue);

		Thread.sleep(1500);


		// Click on the unshare button
		driver.findElement(By.xpath("//*[@id='JColResizer0']/tbody/tr[1]/td[9]/span[4]/a/span")).click();
		Thread.sleep(1000);

		// Click on the cancel button
		driver.findElement(By.xpath("//*[@id='apiReportsActionModal']/div/div/div[3]/button[2]")).click();

		Thread.sleep(1000);

	}

    @Test(priority=8)
	void ValidateFAButtonClick() throws InterruptedException{

		Thread.sleep(1000);

		//Click on the File audit activity button
		driver.findElement(By.xpath("//*[@class='actionsactivityWrap FILES_INDIVIDUAL_ACTIONS_AUDIT_ACTIVITY_DOWNLOAD']/a[1]")).click();


		Thread.sleep(500);

		//Click on the cancel button
		driver.findElement(By.xpath("//*[@id='activityAuditDownload']/div/div[1]/div[3]/button[2]")).click();

		Thread.sleep(500);

	}
 
    @Test(priority=9)
	void ValidateSVEButtonClick(){

		try {
			Thread.sleep(1000);

			//Click on the Share via Email button
			driver.findElement(By.xpath("//*[@class='actionsactivityWrap FILES_INDIVIDUAL_ACTIONS_AUDIT_ACTIVITY_DOWNLOAD']/following-sibling::span[1]")).click();

			Thread.sleep(500);

			//Click on the cancel button
			driver.findElement(By.xpath("//*[@id='sendEmailModal']/div/div/div[3]/button[2]")).click();

			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

    @Test(priority=10)
	void BulkDeleteAction() throws InterruptedException {
		// Store the value of the first file
		String file1 = driver.findElement(By.xpath("//*[@id='JColResizer0']/tbody/tr[1]/td[2]/span")).getText();

		System.out.println("First file name is :" + file1);

		// Store the value of the second file
		String file2 = driver.findElement(By.xpath("//*[@id='JColResizer0']/tbody/tr[2]/td[2]/span")).getText();

		System.out.println("First file name is :" + file2);

		Thread.sleep(1500);

		// Click on the check-box of the first file
		driver.findElement(By.xpath("//*[@id='JColResizer0']/tbody/tr[1]/td[1]/input")).click();

		Thread.sleep(1500);

		// Click on the check-box of the second file
		driver.findElement(By.xpath("//*[@id='JColResizer0']/tbody/tr[2]/td[1]/input")).click();

		Thread.sleep(1500);

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-250)");

		Thread.sleep(1500);

		// CLick on Bulk delete action
		driver.findElement(By.xpath("//*[@id='deleteActionImg']")).click();

		Thread.sleep(1500);

		// Click on Delete button on the pop-up that opens
		driver.findElement(By.xpath("//*[@id='bulkUpdateAction']")).click();

		Thread.sleep(50000);

		driver.get(driver.getCurrentUrl());

		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[@id='searchFiles']")).sendKeys(file1);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='searchIcon']")).click();

		Thread.sleep(1500);

		String nodata = driver.findElement(By.xpath("//*[@id='JColResizer0']/tbody/tr/td")).getText();

		System.out.println("Result value is" + nodata);

		if (nodata.equals("No Files Found")) {
			System.out.println("File deleted successfully");

		} else {
			System.out.println("File delete failed for File:" + file2);
		}

		Thread.sleep(1500);

		// Clear the value
		driver.findElement(By.xpath("//*[@id='crossIcon']/span")).click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[@id='searchFiles']")).sendKeys(file2);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='searchIcon']")).click();

		Thread.sleep(1500);

		String nodata2 = driver.findElement(By.xpath("//*[@id='JColResizer0']/tbody/tr/td")).getText();

		System.out.println("Result value is" + nodata2);

		if (nodata2.equals("No Files Found")) {
			System.out.println("File deleted successfully");

		} else {
			System.out.println("File delete failed for File:" + file2);
		}
		Thread.sleep(1500);
	}


}
