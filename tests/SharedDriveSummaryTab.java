package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.SharedDrivePage;

public class SharedDriveSummaryTab extends BaseClass {

	
	
	@Test(priority=1)
	public void ValidateShareDriveTabClick() throws InterruptedException{

		Thread.sleep(500);
	SharedDrivePage shareddrive = new SharedDrivePage(driver);
	shareddrive.SharedDriveTabClick();
		Thread.sleep(1000);
	}

	@Test(priority=2)
	void ValidateSDMembersCountClick() throws InterruptedException{

		Thread.sleep(500);
		SharedDrivePage shareddrive = new SharedDrivePage(driver);
		shareddrive.SDMembersCountClick();
		Thread.sleep(1000);
	}

	@Test(priority=3)
	void ValidateFilesClick() throws InterruptedException{

		Thread.sleep(500);
		SharedDrivePage shareddrive = new SharedDrivePage(driver);
		shareddrive.FilesClick();
		Thread.sleep(1000);

	}
	
	@Test(priority=4)
	void ValidateSummarySVEClick() throws InterruptedException{
		
		Thread.sleep(500);
		SharedDrivePage shareddrive = new SharedDrivePage(driver);
		shareddrive.SummarySVEButtonClick();
		Thread.sleep(1000);
	}
	
}
