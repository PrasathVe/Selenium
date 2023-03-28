package tests;

import org.testng.annotations.Test;

import pages.AccountsPage;


public class AccountsTabTest extends BaseClass {
	
	//@Test(priority=1)
	public void verifyaccountSummaryLink() {
		AccountsPage accountsPageObject = new AccountsPage(driver);
		accountsPageObject.accountSummary();
	}
	
	//@Test(priority=1)
	public void verifyAppsCountLink() {
		AccountsPage accountsPageObject = new AccountsPage(driver);
		accountsPageObject.appsCountLink();
	}
	
	//@Test(priority=1)
	public void verifyFirstEmail() {
		AccountsPage accountsPageObject = new AccountsPage(driver);
		accountsPageObject.firstEmail();
	}
	
	//@Test(priority=1)
	public void verifySharedFiles() {
		AccountsPage accountsPageObject = new AccountsPage(driver);
		accountsPageObject.sharedFiles();
	}
	
	//@Test(priority=1)
	public void verifyGroups() {
		AccountsPage accountsPageObject = new AccountsPage(driver);
		accountsPageObject.sharedFiles();
	}
	
	@Test(priority=1)
	public void verifyFilesLink() {
		AccountsPage accountsPageObject = new AccountsPage(driver);
		accountsPageObject.filesLink();
	}
}
