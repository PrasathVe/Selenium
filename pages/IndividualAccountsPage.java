package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class IndividualAccountsPage extends BasePage {
	WebDriver driver;

	public IndividualAccountsPage(WebDriver driver) {
		this.driver = driver;
		this.js = (JavascriptExecutor) this.driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[@id='malwareFiles']/a")
	WebElement malwareLink;
	
	@FindBy(xpath = "//a[contains(text(),'Accounts')]")
	WebElement accountsTab;
	
	@FindBy(xpath = "//div[@id='details']//tr[1]//td[1]/a")
	WebElement firstEmail;
	
	@FindBy(xpath = "//span[contains(text(),'Received:')]/a")
	WebElement malwareRecivedCount;
	
	@FindBy(xpath = "//div[@id='sharesAndOwnersModal']//button[@class='btn btn-default negativeButton'][contains(text(),'Cancel')]")
	WebElement cancelButton;
	
	@FindBy(xpath = "//p[@id='quarantineFiles']/a")
	WebElement quarentinedItems;
	
	@FindBy(xpath = "//div[@class='sub-tabs']//li[@class = 'active']")
	WebElement driveFilesTab;
	
	@FindBy(xpath = "//p[@id='groups']/a")
	WebElement groupsIcon;
	
	@FindBy(xpath = "//p[@id='appNumber']//a")
	WebElement appsIcon;
	
	@FindBy(xpath = "//h2[@class='headerForApps']")
	WebElement headerForApps;
	
	
	
	

	public void malwareLink() {
		try {
		accountsTab.click();
		firstEmail.click();
		Thread.sleep(500);
		int malwareCountOnPopup = 0;
		String s = malwareLink.getText();
		malwareLink.click();
		int malwareCountOnDashBoard = Integer.parseInt(s);
		Thread.sleep(500);
		List<WebElement> recivedMalwareCount = driver.findElements(By.xpath("//div[@class='sharesAndOwnersListWrap']//a"));
		for (int i = 0; i < recivedMalwareCount.size(); i++) {
			String ownedMalwareCountOnP = recivedMalwareCount.get(i).getText().trim();
			malwareCountOnPopup = malwareCountOnPopup + Integer.parseInt(ownedMalwareCountOnP);
		}
		Assert.assertEquals(malwareCountOnPopup, malwareCountOnDashBoard);
		Thread.sleep(600);
		cancelButton.click();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	public void quarentinedItems() {
		try {
			quarentinedItems.click();
		Assert.assertEquals(driveFilesTab.getText().trim(), "Drive Files");
		driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void groups() {
try {
		Thread.sleep(500);
		String groupsCount = groupsIcon.getText();
		int groupNumber = Integer.parseInt(groupsCount);
		groupsIcon.click();
		Thread.sleep(600);
		Assert.assertEquals(driver.findElements(By.xpath("//div[@class='groupInfoList']//li")).size(), groupNumber);
		cancelButton.click();
}
		 catch (Exception e) {
		}
	}
	
	public void appsLinks() {
try {
		Thread.sleep(600);
		appsIcon.click();
		Thread.sleep(600);
		Assert.assertTrue(headerForApps.getText().contains("Connected Apps"));
		driver.navigate().back();
}
		 catch (Exception e) {
		}
	}
}
