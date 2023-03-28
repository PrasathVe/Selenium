package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SharedDrivePage extends BasePage {


	WebDriver driver;

	//	  public SharedDrivePage(WebDriver driver){
	//	        this.driver = driver;
	//	        PageFactory.initElements(driver, this);
	//	    }
	//}

	public SharedDrivePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}





	@FindBy(xpath = "//*[@id='allPageLengthFiles']/option[1]")
	WebElement SDTwentyfivePaginationValue;

	@FindBy(xpath = "//*[@id='allPageLengthFiles']/option[2]")
	WebElement SDFiftyPaginationValue;

	@FindBy(xpath = "//*[@id='allPageLengthFiles']/option[3]")
	WebElement SDHundredPaginationValue;

	@FindBy(xpath = "//*[@id='allPageLengthFiles']/option[4]")
	WebElement SDTwoHundredPaginationValue;

	@FindBy(xpath = "//*[@id='allPageLengthFiles']/option[5]")
	WebElement SDFiveHunderedPaginationValue;

	@FindBy(xpath="//div[@class='sub-tabs']/ul/li[6]")
	WebElement  SharedDriveTab;

	@FindBy(xpath="//*[@id='JColResizer0']/tbody/tr/td[2]/span/a")
	WebElement SharedDriveMembers;

	@FindBy(xpath="//*[@id='teamDrivePopup']/div[1]/div[1]/div[3]/button[2]")
	WebElement SharedDriveMembersCloseButton;

	@FindBy(xpath="//*[@id='JColResizer0']/tbody/tr/td[3]/span/a")
	WebElement SDFilesColumnCount;

	@FindBy(xpath="//*[@id='JColResizer0']/tbody/tr[1]/td[4]/span")
	WebElement SDSummarySVEButton;

	@FindBy(xpath="//*[@id='sendEmailModal']/div[1]/div[1]/div[3]/button[2]")
	WebElement SDSummarySVECancelButton;

	@FindBy(xpath="//*[@id='navTab2']")
	WebElement SharedDriveFilesTab;

	@FindBy(xpath="//*[@id='JColResizer1']/tbody/tr[1]/td[1]/span")
	WebElement SDFirstFileName;

	@FindBy(xpath="//*[@id='tab1']")
	WebElement SDBasicSubTab;

	@FindBy(xpath="//*[@id='fileInfoPopup']/div[2]/button")
	WebElement SDCancelButton;

	@FindBy(xpath="//*[@class='nonTeamSharers blueColor TEAMDRIVES_FILES_INDIVIDUAL_BASIC_INFO_VIEW']")
	WebElement SDFirstFileShares;

	@FindBy(xpath="//*[@id='tab3']")
	WebElement NonSDSharersSubTab;

	@FindBy(xpath="//*[@title='File Contains Risk']")
	WebElement SDFirstRiskFile;

	@FindBy(xpath="//*[@id='tab7']")
	WebElement SDRiskSubTab;

	@FindBy(xpath="//*[@title='File Contains Malware']")
	WebElement SDFirstMalwareFile;

	@FindBy(xpath="//*[@id='tab8']")
	WebElement SDMalwareSubTab;

	@FindBy(xpath="//*[@title='Delete']/span[1]")
	WebElement SDDeleteButton;

	@FindBy(xpath="//*[@id='deleteTeamFile']/following-sibling::button")
	WebElement SDDeleteCancelButton;

	@FindBy(xpath="//*[@id='JColResizer1']/tbody/tr[1]/td[7]/span[3]")
	WebElement SDFilesSVEButton;

	@FindBy(xpath="//*[@id='triggerEmail']/following-sibling::button")
	WebElement SDFilesSVECloseButton;


	public  void SharedDriveTabClick() throws InterruptedException{

		Thread.sleep(1000);
		SharedDriveTab.click();
	}

	public void SDMembersCountClick() throws InterruptedException{

		SharedDriveMembers.click();
		Thread.sleep(1000);
		SharedDriveMembersCloseButton.click();
	}

	public void FilesClick() throws InterruptedException{

		Thread.sleep(1000);
		SDFilesColumnCount.click();
		Thread.sleep(1000);
		driver.navigate().back();
	}

	public void SummarySVEButtonClick() throws InterruptedException{

		Thread.sleep(1000);
		SDSummarySVEButton.click();
		Thread.sleep(1000);
		SDSummarySVECancelButton.click();

	}

	public void SDFilesTabClick() throws InterruptedException {

		Thread.sleep(1000);
		SharedDriveFilesTab.click();
	}

	public void FileNameClick() throws InterruptedException {

		Thread.sleep(1000);
		SDFirstFileName.click();
		Thread.sleep(1000);
		String ExpectedBasic = SDBasicSubTab.getText();

		//System.out.println(ExpectedBasic);

		String ActualBasic = "Basic";

		ValidateTabHeading(ActualBasic, ExpectedBasic, driver);

		Thread.sleep(1000);

		SDCancelButton.click();

	}


	public void NonSDSharersClick() throws InterruptedException{

		Thread.sleep(1000);
		PaginationClick(SDFiveHunderedPaginationValue, driver);
		Thread.sleep(2000);
		ExplicitWait("//*[@class='nonTeamSharers blueColor TEAMDRIVES_FILES_INDIVIDUAL_BASIC_INFO_VIEW']",driver);

		//Click on the first file that has shares
		SDFirstFileShares.click();

		Thread.sleep(2000);

		String ExpectedNSD = NonSDSharersSubTab.getText();

		String ActualNSD = "Non-Shared Drives Sharers";

		ValidateTabHeading(ActualNSD, ExpectedNSD, driver);

		Thread.sleep(1000);
		SDCancelButton.click();
		Thread.sleep(1000);

	}

	public void RiskIconClick() throws InterruptedException {

		Thread.sleep(1000);
		PaginationClick(SDFiveHunderedPaginationValue, driver);
		ExplicitWait("//*[@title='File Contains Risk']",driver);

		//Click on the first file that has risk icon
		SDFirstRiskFile.click();
		Thread.sleep(2000);

		String ExpectedRisk = SDRiskSubTab.getText();

		String ActualRisk = "Risk";

		ValidateTabHeading(ActualRisk, ExpectedRisk, driver);

		Thread.sleep(1000);

		SDCancelButton.click();

		Thread.sleep(1000);
	}

	public void MalwareIconClick() throws InterruptedException {

		Thread.sleep(1000);
		PaginationClick(SDFiveHunderedPaginationValue, driver);
		ExplicitWait("//*[@title='File Contains Malware']",driver);

		//Click on the first file that has malware icon
		SDFirstMalwareFile.click();
		Thread.sleep(2000);

		String ExpectedMalware = SDMalwareSubTab.getText();

		String ActualMalware = "Malware";

		ValidateTabHeading(ActualMalware, ExpectedMalware, driver);

		Thread.sleep(1000);

		SDCancelButton.click();

		Thread.sleep(1000);
	}

	public void DeleteClick() throws InterruptedException{

		Thread.sleep(1000);
		SDDeleteButton.click();
		Thread.sleep(1000);
		SDDeleteCancelButton.click();
	}

	public void SVEClick() throws InterruptedException{


		Thread.sleep(1000);
		SDFilesSVEButton.click();
		Thread.sleep(1000);
		SDFilesSVECloseButton.click();
	}

}
