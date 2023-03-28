package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.SharedDrivePage;


public class SharedDriveFilesTab extends BaseClass {


	@Test(priority=1)
	void ValidateShareDriveTabClick() throws InterruptedException{

		SharedDrivePage SharedDrive = new SharedDrivePage(driver);
		SharedDrive.SharedDriveTabClick();

	}

	@Test(priority=2)
	void ValidateSDFilesTabClick() throws InterruptedException{

		SharedDrivePage shareddrive = new SharedDrivePage(driver);
		shareddrive.SDFilesTabClick();

	}

	@Test(priority=3)
	void ValidateFilenameClick() throws InterruptedException{
		SharedDrivePage shareddrive = new SharedDrivePage(driver);
		shareddrive.FileNameClick();
	}

	@Test(priority=4)
	void ValidateNonSDSharersClick() throws InterruptedException{

		SharedDrivePage shareddrive = new SharedDrivePage(driver);
		shareddrive.NonSDSharersClick();


	}

	@Test(priority=5)
	void ValidateRiskIconClick() throws InterruptedException{

		SharedDrivePage shareddrive = new SharedDrivePage(driver);
		shareddrive.RiskIconClick();



	}

	@Test(priority=6)
	void ValidateMalwareIconClick() throws InterruptedException{

		SharedDrivePage shareddrive = new SharedDrivePage(driver);
		shareddrive.MalwareIconClick();
	}


	@Test(priority=7)
	void ValidateDeleteClick() throws InterruptedException {

		SharedDrivePage shareddrive = new SharedDrivePage(driver);
		shareddrive.DeleteClick();
	}


	@Test(priority=8)
	void ValidateSVEClick() throws InterruptedException {

		SharedDrivePage shareddrive = new SharedDrivePage(driver);
		shareddrive.SVEClick();
	}


}

