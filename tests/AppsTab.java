package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.AppsPage;
import pages.BasePage;


public class AppsTab extends BaseClass {
	
	

	@Test(priority=1)
	void validateAppsTabClick() throws InterruptedException {
		AppsPage apps = new AppsPage(driver);
		apps.appsTabClick();
	}

	@Test(priority=2)
	void validateTopAppCategory() throws InterruptedException {
		
		AppsPage apps = new AppsPage(driver);
		apps.topAppCategory();

	}


	@Test(priority=3)
	void validatesanctionpercentagelinks() throws InterruptedException{

		AppsPage apps = new AppsPage(driver);
		apps.sanctionPercentageLinks();
	}



	@Test(priority=4)
	void validateRiskyappslinks() throws InterruptedException{

		AppsPage apps = new AppsPage(driver);
		apps.riskyappslinks();
	}

	@Test(priority=5)
	void validateaccesslevelslinks() throws InterruptedException{

		AppsPage apps = new AppsPage(driver);
		apps.accessLevelsLinks();

	}


	@Test(priority=6)
	void validateArrowsandCount() throws InterruptedException {

		
		AppsPage apps = new AppsPage(driver);
		apps.appsArrowsAndCount();
	}

	@Test(priority=7)
	void validateConnectedUsersLinks() throws InterruptedException {
		
		AppsPage apps = new AppsPage(driver);
		apps.connectedUsersLinks();

	}

	@Test(priority=8)
	void validateRemovebuttonClick() throws InterruptedException{

		AppsPage apps = new AppsPage(driver);
		apps.removebuttonClick();
	}


	@Test(priority=9)
	void validateWarnbuttonClick() throws InterruptedException{

		AppsPage apps = new AppsPage(driver);
		apps.warnbuttonClick();
	}

	@Test(priority=10)
	void validateSanctionbuttonClick() throws InterruptedException{

		AppsPage apps = new AppsPage(driver);
		apps.sanctionbuttonClick();
	}

	@Test(priority=11)
	void validateUnsanctionbuttonClick() throws InterruptedException{


		AppsPage apps = new AppsPage(driver);
		apps.unsanctionbuttonClick();
	}

	@Test(priority=12)
	void validateSVEbuttonClick() throws InterruptedException{

		AppsPage apps = new AppsPage(driver);
		apps.SVEbuttonClick();

	}




}

