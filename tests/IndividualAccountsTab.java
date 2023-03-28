package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.IndividualAccountsPage;

import org.openqa.selenium.WebElement;

public class IndividualAccountsTab extends BaseClass {


    //@Test(priority=1)
	void AccountsTabClick() throws InterruptedException{

		Thread.sleep(500);
		//Click on the Accounts Tab
		driver.findElement(By.xpath("//div[@class='sub-tabs']/ul/li[3]")).click();

		Thread.sleep(1000);

	}

    //@Test(priority=2)
	void FirstFoundAccountNameClick() throws InterruptedException{

		//Click on the first account name
		driver.findElement(By.xpath("//table[@id='JColResizer0']/tbody/tr[4]/td/a")).click();

		Thread.sleep(1000);

	}

    //@Test(priority=3)
	void IPAddressClick() throws InterruptedException {

		//Get the text of the number of IP addresses present
		String IPAdressDisp = driver.findElement(By.xpath("//p[@id='IPAdresses']/a")).getText();

		int ConvertedIPAdressDisp = Integer.parseInt(IPAdressDisp);

		System.out.println("Count of IP addresses displayed in the block is: " +ConvertedIPAdressDisp);

		//Click on IP addresses accessed
		String IPXpath = "//p[@id='IPAdresses']/a";
		
		BasePage.ValidateAPerformLinkandNolinkCase(IPXpath, driver);

		//wait until the pop-up loads
		Thread.sleep(500);

		//Get the count of the number of IP addresses present in the pop-up
		int IPAdressPopUpCount = driver.findElements(By.xpath("//div[@class='listCmnShareOwner selected']/ul/li")).size();
		System.out.println("Count of IP addresses displayed in the pop-up is: " +IPAdressPopUpCount);

		if (ConvertedIPAdressDisp==IPAdressPopUpCount){
			System.out.println("Count of IP address displayed in the IP address block and the pop-up is same");
		}else{
			System.out.println("Count of IP address displayed in the IP address block and the pop-up is not same ");
		}

		Thread.sleep(500);

		//Click on the cancel button
		driver.findElement(By.xpath("//*[@id='sharesAndOwnersModal']/div/div/div[3]/button[2]")).click();

		Thread.sleep(1000);


	}


    //@Test(priority=4)
	void LocationsAccessedClick() throws InterruptedException{

		//Get the text of the number of Locations Accessed
		String LocationsAccessedDisp = driver.findElement(By.xpath("//div[@class='totalDetailsRowBlk accessedInfo']/div[2]/p[@id='locAccessed']/a")).getText();

		int ConvertedLocationsAccessedDisp = Integer.parseInt(LocationsAccessedDisp);

		System.out.println("Count of Locations Accessed displayed in the block is: " +ConvertedLocationsAccessedDisp);

		//Click on Locations Accessed
		String LocationAccessedXpath = "//div[@class='totalDetailsRowBlk accessedInfo']/div[2]/p[@id='locAccessed']/a";
		
		BasePage.ValidateAPerformLinkandNolinkCase(LocationAccessedXpath, driver);

		//wait until the pop-up loads
		Thread.sleep(500);

		//Get the count of the number of Locations Accessed present in the pop-up
		int LocationsAccessPopUpCount = driver.findElements(By.xpath("//div[@class='listCmnShareOwner selected']/ul/li")).size();
		System.out.println("Count of Locations Accessed displayed in the pop-up is: " +LocationsAccessPopUpCount);

		if (ConvertedLocationsAccessedDisp==LocationsAccessPopUpCount){
			System.out.println("Count of Locations Accessed displayed in the IP address block and the pop-up is same");
		}else{
			System.out.println("Count of Locations Accessed displayed in the IP address block and the pop-up is not same ");
		}

		Thread.sleep(500);

		//Click on the cancel button
		driver.findElement(By.xpath("//*[@id='sharesAndOwnersModal']/div/div/div[3]/button[2]")).click();

		Thread.sleep(1000);

	}


    //@Test(priority=5)
	void UnApprovedLocationClick() throws InterruptedException{


		//Get the text of the number UnApproved Locations Accessed
		String BlackListedLocAccessDisp = driver.findElement(By.xpath("//p[@id='blockedLocAccessed']/a")).getText();

		int ConvertedBlackListedLocAccessDisp = Integer.parseInt(BlackListedLocAccessDisp);

		System.out.println("Count of UnApproved Locations Accessed displayed in the block is: " +ConvertedBlackListedLocAccessDisp);

		//Click on UnApproved Locations Accessed
		String UnApprovedXpath = "//p[@id='blockedLocAccessed']/a";
		BasePage.ValidateAPerformLinkandNolinkCase(UnApprovedXpath, driver);

		//wait until the pop-up loads
		Thread.sleep(500);

		//Get the count of the number of UnApproved Locations Accessed present in the pop-up
		int BlackListedLocAccessPopUpCount = driver.findElements(By.xpath("//div[@class='listCmnShareOwner selected']/ul/li")).size();
		System.out.println("Count of Blacklisted Locations Accessed displayed in the pop-up is: " +BlackListedLocAccessPopUpCount);

		if (ConvertedBlackListedLocAccessDisp==BlackListedLocAccessPopUpCount){
			System.out.println("Count of Blacklisted Locations Accessed displayed in the IP address block and the pop-up is same");
		}else{
			System.out.println("Count of Blacklisted Locations Accessed displayed in the IP address block and the pop-up is not same ");
		}

		Thread.sleep(500);

		//Click on the cancel button
		driver.findElement(By.xpath("//*[@id='sharesAndOwnersModal']/div/div/div[3]/button[2]")).click();

		Thread.sleep(1000);

	}



	//	//Get the text of the number of Folders Present
	//	String NoOfFoldersDisp = driver.findElement(By.xpath("//p[@id='foldersNumber']/a")).getText();
	//
	//	int ConvertedNoOfFoldersDisp = Integer.parseInt(NoOfFoldersDisp);
	//
	//	System.out.println("No. of Folders displayed in the block is: " +ConvertedNoOfFoldersDisp);
	//
	//	//Click on Folders
	//	driver.findElement(By.xpath("//p[@id='foldersNumber']/a")).click();
	//
	//	//wait until the pop-up loads
	//	Thread.sleep(300);
	//
	//	int TotalFoldersCount= 0;
	//	//Add the count of Drive-Owned + Drive-Shared
	//
	//	int sizeFolder = driver.findElements(By.xpath("//div[@class='sharesAndOwnersListWrap']/div")).size();
	//
	//	for (int i=1;i<=sizeFolder;i++){
	//		Thread.sleep(300);
	//
	//		String FolderOwned = driver.findElement(By.xpath("//*[@id='sharesAndOwnersModal']/div/div/div[2]/div/div/div["+i+"]/p/span[2]/a")).getText();
	//		int ConvFolderOwned = Integer.parseInt(FolderOwned);
	//		System.out.println(ConvFolderOwned);
	//
	//		String FolderShared = driver.findElement(By.xpath("//*[@id='sharesAndOwnersModal']/div/div/div[2]/div/div/div["+i+"]/p/span[3]/a")).getText();
	//		int ConvFolderShared = Integer.parseInt(FolderShared); 
	//
	//		TotalFoldersCount += ConvFolderOwned+ConvFolderShared;
	//	}
	//
	//	System.out.println("Total Folders count in the pop-up is:" +TotalFoldersCount);
	//
	//	if(ConvertedNoOfFoldersDisp==TotalFoldersCount){
	//		System.out.println("No. of Folders is same in the block and in the pop-up");
	//	}else{
	//		System.out.println("No. of Folders is NOT same in the block and in the pop-up");
	//	}
	//
	//	Thread.sleep(200);
	//
	//	//Click on the cancel button
	//	driver.findElement(By.xpath("//*[@id='sharesAndOwnersModal']/div/div/div[3]/button[2]")).click();
	//
	//	Thread.sleep(200);

    //@Test(priority=6)
	void FilesClick() throws InterruptedException {

		//Get the text of the number of Files Present
		String NoOfFilesDisp = driver.findElement(By.xpath("//p[@id='fileNumber']/a")).getText();

		int ConvertedNoOfFilesDisp = Integer.parseInt(NoOfFilesDisp);

		System.out.println("No. of Files displayed in the block is: " +ConvertedNoOfFilesDisp);

		//Click on Files
		String FilesClickXpath = "//p[@id='fileNumber']/a";
		BasePage.ValidateAPerformLinkandNolinkCase(FilesClickXpath, driver);

		//wait until the pop-up loads
		Thread.sleep(300);

		int TotalFilesCount= 0;
		//Add the count of Drive-Owned + Drive-Shared

		int sizeFile = driver.findElements(By.xpath("//div[@class='sharesAndOwnersListWrap']/div")).size();
		System.out.println("SIZE:" +sizeFile);

		for (int i=1;i<=sizeFile;i++){
			Thread.sleep(300);
			String DriveFileOwned = driver.findElement(By.xpath("//*[@id='sharesAndOwnersModal']/div/div/div[2]/div/div/div["+i+"]/p/span[2]/a")).getText();

			int ConDriveFileOwned = Integer.parseInt(DriveFileOwned);
			System.out.println("SIZE:" +ConDriveFileOwned);

			//Get the count text of Drive Files(Shared)
			String DriveFileShared = driver.findElement(By.xpath("//*[@id='sharesAndOwnersModal']/div/div/div[2]/div/div/div["+i+"]/p/span[3]/a")).getText();
			int ConDriveFileShared = Integer.parseInt(DriveFileShared);

			//Add Drive Files(owned+shared)
			TotalFilesCount += ConDriveFileOwned+ConDriveFileShared;



		}


		System.out.println("Total Files count in the pop-up is:" +TotalFilesCount);

		if(ConvertedNoOfFilesDisp==TotalFilesCount){
			System.out.println("No. of Files is same in the block and in the pop-up");
		}else{
			System.out.println("No. of Files is NOT same in the block and in the pop-up");
		}

		Thread.sleep(200);

		//Click on the cancel button
		driver.findElement(By.xpath("//*[@id='sharesAndOwnersModal']/div/div/div[3]/button[2]")).click();

		Thread.sleep(200);

	}


    //@Test(priority=7)
	void RiskFilesCountClick() throws InterruptedException{

		//Click on the Risky Files pop-up and validate the count of the data
		String RiskyFilesDisp = driver.findElement(By.xpath("//p[@id='riskyFiles']/a")).getText();
		int ConvRiskyFilesDisp = Integer.parseInt(RiskyFilesDisp);

		Thread.sleep(500);

		String RiskFilesXpath = "//p[@id='riskyFiles']/a";
		BasePage.ValidateAPerformLinkandNolinkCase(RiskFilesXpath, driver);
		
		Thread.sleep(1000);

		int TotalRiskyFilesCount= 0;
		//Add the count of Drive-Owned + Drive-Shared

		int sizeRiskyFiles = driver.findElements(By.xpath("//div[@class='sharesAndOwnersListWrap']/div")).size();

		for (int i=1;i<=sizeRiskyFiles;i++){
			Thread.sleep(500);

			String RiskyFilesOwned = driver.findElement(By.xpath("//*[@id='sharesAndOwnersModal']/div/div/div[2]/div/div/div["+i+"]/p/span[2]/a")).getText();
			int ConvRiskyFilesOwned = Integer.parseInt(RiskyFilesOwned);

			String RiskyFilesShared = driver.findElement(By.xpath("//*[@id='sharesAndOwnersModal']/div/div/div[2]/div/div/div["+i+"]/p/span[3]/a")).getText();
			int ConvRiskyFilesShared = Integer.parseInt(RiskyFilesShared); 

			TotalRiskyFilesCount += ConvRiskyFilesOwned+ConvRiskyFilesShared;
		}

		System.out.println("Total Risky Files count in the pop-up is:" +TotalRiskyFilesCount);

		if(ConvRiskyFilesDisp==TotalRiskyFilesCount){
			System.out.println("No. of Risky Files count  is same in the block and in the pop-up");
		}else{
			System.out.println("No. of Risky Files count  is NOT same in the block and in the pop-up");
		}
		Thread.sleep(500);
		//Click on the cancel button
		driver.findElement(By.xpath("//*[@id='sharesAndOwnersModal']/div/div/div[3]/button[2]")).click();
		Thread.sleep(1000);
	}
    @Test(priority=7)
	void verifyMalwareLink() {
    	IndividualAccountsPage IndividualAccountsPageobject = new IndividualAccountsPage(driver);
    	IndividualAccountsPageobject.malwareLink();
    }
	
	//@Test(priority=7)
	void verifyquarentinedItems() {
    	IndividualAccountsPage IndividualAccountsPageobject = new IndividualAccountsPage(driver);
    	IndividualAccountsPageobject.quarentinedItems();
    }
	
	//@Test(priority=7)
	void verifyGroupsCount() {
    	IndividualAccountsPage IndividualAccountsPageobject = new IndividualAccountsPage(driver);
    	IndividualAccountsPageobject.groups();
    }
	
	@Test(priority=7)
	void VerifyAapsLink() {
    	IndividualAccountsPage IndividualAccountsPageobject = new IndividualAccountsPage(driver);
    	IndividualAccountsPageobject.appsLinks();
    }
}  


  	  
    
	


 
