package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AppsPage extends BasePage{

	WebDriver driver;

	public AppsPage(WebDriver driver) {
		this.driver = driver;
		this.js = (JavascriptExecutor) this.driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='allPageLength']/option[1]")
	WebElement AppsTwentyfivePaginationValue;

	@FindBy(xpath = "//*[@id='allPageLength']/option[2]")
	WebElement AppsFiftyPaginationValue;

	@FindBy(xpath = "//*[@id='allPageLength']/option[3]")
	WebElement AppsHundredPaginationValue;

	@FindBy(xpath = "//*[@id='allPageLength']/option[4]")
	WebElement AppsTwohundredPaginationValue;

	@FindBy(xpath = "//*[@id='allPageLength']/option[5]")
	WebElement AppsFivehundredPaginationValue;

	@FindBy(xpath = "//div[@class='sub-tabs']/ul/li[7]")
	WebElement AppsTab;

	@FindBy(xpath = "//*[@id='JColResizer0']/tbody/tr/td[5]/span[2]")
	WebElement FirstAppScopeCategoryArrow;

	@FindBy(xpath = "//*[@id='JColResizer0']/tbody/tr/td[6]/span[2]")
	WebElement FirstAppRiskArrow;

	@FindBy(xpath = "//*[@id='JColResizer0']/tbody/tr/td[8]/span[2]")
	WebElement FirstAppOUArrow;

	@FindBy(xpath = "//*[@id='JColResizer0']/tbody/tr/td[9]/span/a")
	WebElement FirstAppUsersCount;

	@FindBy(xpath = "//*[@id='JColResizer0']/tbody/tr[1]/td[3]/a")
	WebElement FirstAppClick;

	@FindBy(xpath = "//*[@class='detailBlkFirst']/div/p[2]/span[4]")
	WebElement ConnectedUsersRiskArrow;

	@FindBy(xpath = "//*[@id='scope-category']/following-sibling::span")
	WebElement ConnectedUsersScopeCategoryArrow;

	@FindBy(xpath = "//span[@class='sprite_mm edit']")
	WebElement ConnectedUsersEditButton;

	@FindBy(xpath = "//*[@id='appDetailsModal']/div/div/div[3]/button[2]")
	WebElement CancelofEditButton;

	@FindBy(xpath = "//*[@id='JColResizer0']/tbody/tr/td[2]/a")
	WebElement FirstConnectedUser;

	@FindBy(xpath = "//*[@id='JColResizer0']/tbody/tr[1]/td[1]/input")
	WebElement FirstCheckBox;

	@FindBy(xpath = "//*[@title='Remove']/span[2]")
	WebElement BulkRemoveButton;

	@FindBy(xpath = "//*[@title='Warn']/span[2]")
	WebElement BulkWarnButton;

	@FindBy(xpath = "//*[@title='Sanction']/span[2]")
	WebElement BulkSanctionButton;

	@FindBy(xpath = "//*[@title='Unsanction']/span[2]")
	WebElement BulkUnsanctionButton;

	@FindBy(xpath = "//*[@id='bulkAction']/following-sibling::button")
	WebElement BulkCancelButton;

	@FindBy(xpath = "//*[@title='Share Via Email']/span[2]")
	WebElement AppsSVEButton;

	@FindBy(xpath = "//*[@id='triggerEmail']/following-sibling::button")
	WebElement AppsSVECloseButton;

	public void appsTabClick() throws InterruptedException {

		Thread.sleep(2000);

		// Click on the Apps Tab
		AppsTab.click();

		Thread.sleep(1000);
	}


	public void topAppCategory() throws InterruptedException {

		Thread.sleep(2000);


		// Click on the Top Apps Category number links
		for (int i = 1; i <= 4; i++) {
			Thread.sleep(500);

			String AppCategoryXpath = "//div[@class='appCategoryDlabel']/div["+i+"]/a";

			ValidateAPerformLinkandNolinkCase(AppCategoryXpath,driver);

			Thread.sleep(1000);
		}
	}



	public void sanctionPercentageLinks() throws InterruptedException{

		Thread.sleep(2000);
		for (int i = 1; i <= 4; i++) {

			String SancPercentageXpath = "//div[@class='unsanctionedDlabel']/div[" + i + "]/a";
			ValidateAPerformLinkandNolinkCase(SancPercentageXpath, driver);
			Thread.sleep(1000);

		}
	}



	public void riskyappslinks() throws InterruptedException{

		Thread.sleep(1000);
		for (int i = 1; i <=4; i++) {

			String RiskyAppsXpath = "//div[@class='riskyAppsDlabel']/div[" + i + "]/a";
			ValidateAPerformLinkandNolinkCase(RiskyAppsXpath, driver);
			Thread.sleep(1000);

		}
	}

	public void accessLevelsLinks() throws InterruptedException{

		Thread.sleep(1000);

		for (int i = 1; i <= 4; i++) {
			String AccessLevelsXpath = "//div[@class='appspecificWrap']/div[" + i + "]/a";
			ValidateAPerformLinkandNolinkCase(AccessLevelsXpath, driver);
			Thread.sleep(1000);

		}

	}



	public void appsArrowsAndCount() throws InterruptedException {

		Thread.sleep(2000);

		// Click on the Apps Tab
		AppsTab.click();

		Thread.sleep(1000);

		js.executeScript("window.scrollBy(0,250)");

		// Click on scope categories arrow of first app found
		FirstAppScopeCategoryArrow.click();

		Thread.sleep(1000);

		//Click on Risk arrow
		FirstAppRiskArrow.click();

		Thread.sleep(1000);

		//Click on OU arrow
		FirstAppOUArrow.click();

		Thread.sleep(1000);

		//Click on the users count
		FirstAppUsersCount.click();

		Thread.sleep(1500);

		driver.navigate().back();

		Thread.sleep(1500);

	}


	public void connectedUsersLinks() throws InterruptedException {

		// Click on the first apps link
		FirstAppClick.click();

		Thread.sleep(1000);

		// Click on the RIsk arrow on connected users page
		ConnectedUsersRiskArrow.click();

		Thread.sleep(1000);

		//Click again so that it closed
		ConnectedUsersRiskArrow.click();

		Thread.sleep(1000);


		ConnectedUsersScopeCategoryArrow.click();

		Thread.sleep(1000);

		// Click on the edit button
		ConnectedUsersEditButton.click();

		Thread.sleep(1500);

		//Click on the cancel button
		CancelofEditButton.click();

		Thread.sleep(1000);

		//Click on the user email id on the page
		FirstConnectedUser.click();

		Thread.sleep(1500);

		driver.navigate().back();

		Thread.sleep(1500);

		driver.navigate().back();

	}


	public void removebuttonClick() throws InterruptedException{

		Thread.sleep(1000);

		//Click on the check-box of the first app
		FirstCheckBox.click();

		Thread.sleep(1000);

		//Click on the Remove action
		BulkRemoveButton.click();

		Thread.sleep(1000);

		//Click on the cancel button
		BulkCancelButton.click();

		Thread.sleep(1000);

		driver.get(driver.getCurrentUrl());

		Thread.sleep(1500);
	}



	public void warnbuttonClick() throws InterruptedException{

		Thread.sleep(1000);

		//Click on the check-box of the first app
		FirstCheckBox.click();

		Thread.sleep(1000);

		//Click on the Warn action
		BulkWarnButton.click();

		Thread.sleep(1000);

		//Click on the cancel button
		BulkCancelButton.click();

		Thread.sleep(1000);

		driver.get(driver.getCurrentUrl());

		Thread.sleep(1500);
	}

	
	public void sanctionbuttonClick() throws InterruptedException{

		Thread.sleep(1000);

		//Click on the check-box of the first app
		FirstCheckBox.click();

		Thread.sleep(1000);

		//Click on the Sanction action
		BulkSanctionButton.click();

		Thread.sleep(1000);

		//Click on the cancel button
		BulkCancelButton.click();

		Thread.sleep(1000);

		driver.get(driver.getCurrentUrl());

		Thread.sleep(1500);
	}

	
	public void unsanctionbuttonClick() throws InterruptedException{

		Thread.sleep(1000);

		//Click on the check-box of the first app
		FirstCheckBox.click();

		Thread.sleep(1000);

		//Click on the Unsanction action
		BulkUnsanctionButton.click();

		Thread.sleep(1000);

		//Click on the cancel button
		BulkCancelButton.click();

		Thread.sleep(1000);

		driver.get(driver.getCurrentUrl());

		Thread.sleep(1500);
	}


	public void SVEbuttonClick() throws InterruptedException{

		Thread.sleep(1000);

		//Click on the check-box of the first app
		FirstCheckBox.click();

		Thread.sleep(1000);

		//Click on the Share via Email action
		AppsSVEButton.click();

		Thread.sleep(1000);

		//Click on the closebutton
		AppsSVECloseButton.click();

		Thread.sleep(1000);

		driver.get(driver.getCurrentUrl());

		Thread.sleep(1500);


	}



}
