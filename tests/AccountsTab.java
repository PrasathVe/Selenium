package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AccountsTab extends BaseClass {

	@Test(priority=1)
	public void Accountstabclick() throws InterruptedException{
		// Click on the Accounts Tab
		driver.findElement(By.xpath("//div[@class='sub-tabs']/ul/li[3]")).click();
		Thread.sleep(1500);
	}

	@Test(priority=2)
	public void accountNameClick() throws InterruptedException {


		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");

		Thread.sleep(1000);
		// Click on the first account name
		driver.findElement(By.xpath("//table[@id='JColResizer0']/tbody/tr[1]/td/a")).click();

		Thread.sleep(1500);

		driver.navigate().back();

		// Wait until the accounts page data loads again
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//table[@id='JColResizer0']/tbody/tr[1]/td/a")));

		Thread.sleep(1500);
	}

	//@Test(priority=3)
	public void appsColumnRedirection() throws InterruptedException {

		// Get the text of number of Apps present
		String AppsValue = driver.findElement(By.xpath("//table[@id='JColResizer0']/tbody/tr/td[4]/span/a")).getText();
		System.out.println("No: of Apps displayed on Accounts page is:" + AppsValue);

		Thread.sleep(1500);

		// Click on the Apps Links
		driver.findElement(By.xpath("//table[@id='JColResizer0']/tbody/tr/td[4]/span/a")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[@class='paginatedTextInfoSpan paginatedTextInfoSpan-js']/b[3]")));

		// Get the text of the count displayed in the Apps Page
		String AppsPageCount = driver
				.findElement(By.xpath("//span[@class='paginatedTextInfoSpan paginatedTextInfoSpan-js']/b[3]"))
				.getText();
		System.out.println("The count of Apps displayed in the Apps Page is:" + AppsPageCount);

		Thread.sleep(1500);

		// Validate and display if the Count of Apps on Accounts page and Apps
		// page is the same
		if (AppsValue.equals(AppsPageCount)) {

			System.out.println("Total Apps count is the same on Accounts Page and Apps Page");
		} else {
			System.out.println("Total Apps count does not match on Accounts Page and Apps Page");
		}

		driver.navigate().back();

		// Wait until the accounts page data loads again
		WebDriverWait wait3 = new WebDriverWait(driver, 30);
		wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//table[@id='JColResizer0']/tbody/tr[1]/td/a")));

	}

	//@Test(priority=4)
	void sharedDriveClickAndData() throws InterruptedException {

		// Get the value of the Count of Team Drives in the Shared Drives column

		String SharedDriveinColumn = driver.findElement(By.xpath("//table[@id='JColResizer0']/tbody/tr/td[5]/span/a"))
				.getText();
		int convertSharedDriveColumnValue = Integer.parseInt(SharedDriveinColumn);
		System.out.println(
				"The number of Shared Drives displayed in the column of Accounts page is:" + SharedDriveinColumn);

		Thread.sleep(1500);

		// Click on the Shared drive pop-up
		driver.findElement(By.xpath("//table[@id='JColResizer0']/tbody/tr/td[5]/span/a")).click();

		// wait until the pop-up loads
		WebDriverWait wait4 = new WebDriverWait(driver, 30);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.className("tab-content")));

		// Check if the pop-up is pointing to the Shared Drives Tab
		String SharedDrivePopupText = driver.findElement(By.id("top-tab-2")).getText();
		if (SharedDrivePopupText.equals("Shared Drives")) {

			System.out.println("Shared Drives pop-up is pointing to Team Drives Tab");
		} else {
			System.out.println("Shared Drives pop-up is not pointing to Team Drives Tab");
		}

		Thread.sleep(1500);

		// Count the number of Shared drives present in the pop-up and display
		// it
		int SharedDrivePopupCount = driver.findElements(By.xpath("//div[@class='teamDriveInfoList']/ul/li")).size();
		System.out.println("No. of Team Drives present in the pop-up is :" + SharedDrivePopupCount);

		// Compare the Team drive count present in the column with the count
		// present in the pop-up
		if (convertSharedDriveColumnValue == SharedDrivePopupCount) {
			System.out.println("Shared Drives count is the same in the column and in the pop-up");
		} else {
			System.out.println("Shared Drives count is not the same in the column and in the pop-up");
		}

		Thread.sleep(1500);

		// Click on the cancel button
		driver.findElement(By.cssSelector("button.btn.btn-default.negativeButton")).click();

		Thread.sleep(1500);

	}

	//@Test(priority=5)
	void groupsClickAndData() throws InterruptedException {

		// Get the text of number of groups present in the groups column
		String GroupsinColumn = driver.findElement(By.xpath("//table[@id='JColResizer0']/tbody/tr/td[6]/span/a"))
				.getText();
		System.out.println("No. of Groups present in the Groups column is :" + GroupsinColumn);

		Thread.sleep(1500);

		// Click on the Groups pop-up
		driver.findElement(By.xpath("//table[@id='JColResizer0']/tbody/tr/td[6]/span/a")).click();

		// wait until the pop-up loads
		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By.className("tab-content")));

		// Check if the pop-up is pointing to the Groups Tab
		String GroupPopupText = driver.findElement(By.id("top-tab-3")).getText();
		if (GroupPopupText.equals("Groups")) {

			System.out.println("Groups pop-up is pointing to Groups Tab");
		} else {
			System.out.println("Groups pop-up is not pointing to Groups Tab");
		}

		Thread.sleep(1500);

		// Count the number of groups present in the pop-up and display it
		int GroupsPopupCount = driver.findElements(By.xpath("//div[@class='groupInfoList']/ul/li")).size();
		System.out.println("No. of Groups present in the pop-up is :" + GroupsPopupCount);

		Thread.sleep(1500);

		// Click on the cancel button
		driver.findElement(By.cssSelector("button.btn.btn-default.negativeButton")).click();

	}

	//@Test(priority=6)
	void filesClickAndData() throws InterruptedException {

		// Get the value of the number of files present in the Files column
		String FilesinColumn = driver.findElement(By.xpath("//table[@id='JColResizer0']/tbody/tr/td[7]/span/a"))
				.getText();

		System.out.println("No. of Files present in the Files column is :" + FilesinColumn);
		// Click on the Files pop-up
		driver.findElement(By.xpath("//table[@id='JColResizer0']/tbody/tr/td[7]/span/a")).click();

		// wait until the pop-up loads
		WebDriverWait wait6 = new WebDriverWait(driver, 30);
		wait6.until(ExpectedConditions.visibilityOfElementLocated(By.className("tab-content")));

		// Check if the pop-up is pointing to the Files Tab
		String FilesPopupText = driver.findElement(By.id("top-tab-4")).getText();
		if (FilesPopupText.equals("Files")) {

			System.out.println("Files pop-up is pointing to Files Tab");
		} else {
			System.out.println("Files pop-up is not pointing to Files Tab");
		}

		Thread.sleep(1500);

		// Check if the sub-tab of the pop-up is pointing to All
		String FilesSubtabPopupText = driver.findElement(By.id("sub-tab-1")).getText();
		if (FilesSubtabPopupText.equals("All")) {
			System.out.println("Files pop-up sub-tab is pointing to All");
		} else {
			System.out.println("Files pop-up sub-tab is not pointing to All");
		}

		Thread.sleep(1500);

		// Click on the cancel button
		driver.findElement(By.cssSelector("button.btn.btn-default.negativeButton")).click();

	}

	//@Test(priority=7)
	void riskIconClick() throws InterruptedException {
		// Click on the risk icon of the first accounts it finds with risk
		driver.findElement(By.xpath("//span[@title='Has Risk']")).click();

		Thread.sleep(1500);

		// Check if the sub-tab is pointing to Has Risk
		String RiskIconSubtabPopupText = driver.findElement(By.id("sub-tab-3")).getText();
		if (RiskIconSubtabPopupText.equals("Has Risk")) {

			System.out.println("Files pop-up sub-tab is pointing to Has Risk");
		} else {
			System.out.println("Files pop-up sub-tab is not pointing to Has Risk");
		}

		Thread.sleep(1500);

		// Click on the cancel button
		driver.findElement(By.cssSelector("button.btn.btn-default.negativeButton")).click();

		Thread.sleep(1500);

	}

	//@Test(priority=8)
	void MalwareIconClick() throws InterruptedException {

		// Click on the first account for which a malware icon is present
		driver.findElement(By.xpath("//span[@title='Has Malware']")).click();

		Thread.sleep(300);

		// Check if the sub-tab is pointing to Has Malware
		String MalwareIconSubtabPopupText = driver.findElement(By.id("sub-tab-3")).getText();
		if (MalwareIconSubtabPopupText.equals("Has Malware")) {

			System.out.println("Files pop-up sub-tab is pointing to Has Malware");
		} else {
			System.out.println("Files pop-up sub-tab is not pointing to Has Malware");
		}

		Thread.sleep(200);

		// Click on the cancel button
		driver.findElement(By.cssSelector("button.btn.btn-default.negativeButton")).click();

		Thread.sleep(200);

	}

	//@Test(priority=9)
	void PhishingUrlIconClick() throws InterruptedException {
		// Click on the first account for which a Phishing URL icon is present
		driver.findElement(By.xpath("//span[@title='Phishing Url']")).click();

		Thread.sleep(1500);

		// Check if the sub-tab is pointing to Has Threat URLs
		String ThreatIconSubtabPopupText = driver.findElement(By.id("sub-tab-4")).getText();
		if (ThreatIconSubtabPopupText.equals("Has Threat URLs")) {

			System.out.println("Files pop-up sub-tab is pointing to Has Phishing URLs");
		} else {
			System.out.println("Files pop-up sub-tab is not pointing to Has Phishing URLs");
		}

		Thread.sleep(1500);

		// Click on the cancel button
		driver.findElement(By.cssSelector("button.btn.btn-default.negativeButton")).click();

	}

	//@Test(priority=10)
	void PhishingContentIconClick() throws InterruptedException {
		// Click on the first account for which a Phishing content icon is present
		driver.findElement(By.xpath("//span[@title='Has Suspicious Phishing Content']")).click();

		Thread.sleep(1500);

		// Check if the sub-tab is pointing to Has Threat URLs
		String PhishingIconSubtabPopupText = driver.findElement(By.id("sub-tab-4")).getText();
		if (PhishingIconSubtabPopupText.equals("Has Suspicious Phishing Content")) {

			System.out.println("Files pop-up sub-tab is pointing to Has Phishing Content icon");
		} else {
			System.out.println("Files pop-up sub-tab is not pointing to Has Phishing Content icon");
		}

		Thread.sleep(1500);

		// Click on the cancel button
		driver.findElement(By.cssSelector("button.btn.btn-default.negativeButton")).click();

	}

	//@Test(priority=11)
	void suspendIconClick() throws InterruptedException {

		Thread.sleep(1000);
		// Click on the suspend user icon
		driver.findElement(By.xpath("//*[@title='Suspend User']")).click();

		Thread.sleep(1500);

		// Click on the cancel button
		driver.findElement(By.xpath("//*[@id='suspendUser']/div/div/div[3]/button[2]")).click();
	}

//	@Test(priority=12)
//	void ResetPasswordClick() throws InterruptedException{
//		Thread.sleep(1000);
//
//		//Click on the Reset Password icon
//		driver.findElement(By.xpath("//*[@id='JColResizer0']/tbody/tr/td[8]/span[2]")).click();
//
//		Thread.sleep(1500);
//
//		// Click on the cancel button
//		driver.findElement(By.xpath("//*[@id='accPasswordModal']/div/div/div[3]/button[2]")).click();


	//}

	//@Test(priority=12)
	void ShareViaEmailClick() throws InterruptedException{
		Thread.sleep(1000);

		//Click on the ShareviaEmail icon
		driver.findElement(By.xpath("//*[@id='JColResizer0']/tbody/tr[1]/td[8]/span[3]")).click();

		Thread.sleep(1500);

		// Click on the cancel button
		driver.findElement(By.xpath("//*[@id='sendEmailModal']/div/div/div[3]/button[2]")).click();


	}




}
