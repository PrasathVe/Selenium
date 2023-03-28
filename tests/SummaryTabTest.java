package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.SharedDrivePage;
import pages.SummaryPage;

public class SummaryTabTest extends BaseClass {

	// @Test(priority=1)
	public void validateSummaryTabClick() {

		SummaryPage summaryPageObject = new SummaryPage(driver);
		summaryPageObject.summaryTabClick();
		// Thread.sleep(1000);
	}

	// @Test(priority=1)
	public void validateRiskLinkClick() {

		SummaryPage summaryPageObject = new SummaryPage(driver);
		summaryPageObject.riskLink();

	}

	// @Test(priority=1)
	public void validateAppsClick() {
		SummaryPage summaryPageObject = new SummaryPage(driver);
		summaryPageObject.appskLink();

	}

	// @Test(priority=1)
	public void validateEmaildSummaryClick() {
		SummaryPage summaryPageObject = new SummaryPage(driver);
		summaryPageObject.emailSummarykLink();
	}

	// @Test(priority=1)
	public void driveFilesSummaryClick() {
		SummaryPage summaryPageObject = new SummaryPage(driver);
		summaryPageObject.driveFilesSummaryLink();
	}

	// @Test(priority=1)
	public void sharedDriveClick() {
		SummaryPage summaryPageObject = new SummaryPage(driver);
		summaryPageObject.sharedDriveLink();
	}

	// @Test(priority=1)
	public void activeMalwareClick() {
		SummaryPage summaryPageObject = new SummaryPage(driver);
		summaryPageObject.activeMalwareLink();
	}

	// @Test(priority=1)
	public void accountsClick() {
		SummaryPage summaryPageObject = new SummaryPage(driver);
		summaryPageObject.accountsLink();
	}

	// @Test(priority=1)
	public void verifySourseLinks() {
		SummaryPage summaryPageObject = new SummaryPage(driver);
		summaryPageObject.sourseLinks();
	}

	// @Test(priority=1)
	public void verifyappLinks() {
		SummaryPage summaryPageObject = new SummaryPage(driver);
		summaryPageObject.appLinks();
	}

	// @Test(priority = 1)
	public void driveFileSummaryLink() {
		SummaryPage summaryPageObject = new SummaryPage(driver);
		summaryPageObject.driveFileSummaryLink();
	}

	//@Test(priority = 1)
	public void verifyAccountsGraphLink() {
		SummaryPage summaryPageObject = new SummaryPage(driver);
		summaryPageObject.accountsGraph();
	}

	//@Test(priority = 1)
	public void verifyRecentlyLoggedInUsers() {
		SummaryPage summaryPageObject = new SummaryPage(driver);
		summaryPageObject.recentlyLoggedInUsers();
	}
}
