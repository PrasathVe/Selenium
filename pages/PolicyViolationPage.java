package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyViolationPage extends BasePage{

	WebDriver driver;


	public PolicyViolationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='allPageLength']/option[1]")
	WebElement PVTwentyfivePaginationValue;

	@FindBy(xpath = "//*[@id='allPageLength']/option[2]")
	WebElement PVFiftyPaginationValue;

	@FindBy(xpath = "//*[@id='allPageLength']/option[3]")
	WebElement PVHundredPaginationValue;

	@FindBy(xpath = "//*[@id='allPageLength']/option[4]")
	WebElement PVTwohundredPaginationValue;

	@FindBy(xpath = "//*[@id='allPageLength']/option[5]")
	WebElement PVFivehundredPaginationValue;

	@FindBy(xpath = "//div[@class='sub-tabs']/ul/li[10]")
	WebElement PolicyViolationTab;

	@FindBy(xpath = "//div[@class='policySummaryBlock']/div[1]/div[1]/div[2]/a")
	WebElement Policylink;

	@FindBy(xpath = "//*[@id='JColResizer0']/tbody/tr[1]/td[2]/span[3]")
	WebElement EntityPopOver;

	@FindBy(xpath = "//*[@id='JColResizer0']/tbody/tr[1]/td[3]/span[2]")
	WebElement PolicyViolatedPopOver;



	public void PolicyViolationtabTabClick() throws InterruptedException{

		Thread.sleep(1000);
		PolicyViolationTab.click();
	}

	public void PolicylinkClick() throws InterruptedException{

		Thread.sleep(1000);
		PolicyViolationTab.click();
	}


	public void EntitiesViolatedlinks() throws InterruptedException {

		Thread.sleep(1000);
		for (int i=1;i<=3;i++){

			String EntitiesVXPath = "//*[@class='policyViolationDlabel']/div["+i+"]/a";
			ValidateAPerformLinkandNolinkCase(EntitiesVXPath, driver);
			Thread.sleep(1000);
		}
	}


	public void Contententitiesclick() throws InterruptedException {
		Thread.sleep(1000);
		for (int i=1;i<=3;i++){

			String ContentEXPath = "//*[@class='MultipleViolationDlabel']/div["+i+"]/a";
			BasePage.ValidateAPerformLinkandNolinkCase(ContentEXPath, driver);
			Thread.sleep(1000);
		}
	}


	public void Remediationsclick() throws InterruptedException {
		Thread.sleep(1000);

		for (int i=1;i<=3;i++){

			String RemediationsXpath = "//*[@class='RemediationDlabel']/div["+i+"]/a";
			BasePage.ValidateAPerformLinkandNolinkCase(RemediationsXpath, driver);
			Thread.sleep(1000);
		}
	}


	public void ViolationsRemediationsclick() throws InterruptedException{

		Thread.sleep(1000);

		for (int i=1;i<=2;i++){

			String VandRXpath = "//*[@class='policyViolationbyTime']/div["+i+"]/p/a";
			BasePage.ValidateAPerformLinkandNolinkCase(VandRXpath, driver);

			Thread.sleep(1000);

		}
	}

	public void Entitynameclicks() throws InterruptedException{

		Thread.sleep(1000);

		driver.get(driver.getCurrentUrl());

		Thread.sleep(1000);

		PaginationClick(PVHundredPaginationValue, driver);

		Thread.sleep(1000);

		for(int i=0;i<=100;i++){
			String entityXpath = "//*[@id='JColResizer0']/tbody/tr["+i+"]/td[2]/span/a";
			ValidateAPerformLinkandNolinkCase(entityXpath,driver );

		}

		Thread.sleep(1000);

		driver.navigate().back();

		Thread.sleep(1000);

		//Click on Entity pop-over and close it

		EntityPopOver.click();
		Thread.sleep(800);
		EntityPopOver.click();
		Thread.sleep(800);

	}

	public void Policyviolatedpopover() throws InterruptedException{
		//Click on the policy violated pop-over

		Thread.sleep(500);

		PolicyViolatedPopOver.click();

		Thread.sleep(800);

		PolicyViolatedPopOver.click();

		Thread.sleep(800);
	}

	public void Userpopover() throws InterruptedException{
		//Click on the policy violated pop-over

		Thread.sleep(500);

		String UserPopover = "//*[@class='overflowText ownerColumn']/span[2]";
		ValidateAPerformLinkandNolinkCase(UserPopover,driver);

		Thread.sleep(800);
	}
}