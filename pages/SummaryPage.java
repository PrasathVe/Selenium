package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SummaryPage {

	WebDriver driver;

	public SummaryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='sub-tabs']/ul/li[2]")
	WebElement  summaryTab;
	@FindBy(xpath="//div[@class='riskHeading']/a")
	WebElement  riskMoreIcon;
	@FindBy(xpath="//li[contains(text(),'Risks') and @class= 'active']")
	WebElement  riskTab;
	@FindBy(xpath="//div[@class='appsHeading']/a")
	WebElement  aapsMoreIcon;
	@FindBy(xpath="//li[contains(text(),'Apps') and @class= 'active']")
	WebElement  appsTab;
	@FindBy(xpath="//div[@class='emailsHeading']/a")
	WebElement  emailSummaryMoreIcon;
	@FindBy(xpath="//li[contains(text(),' Emails') and @class= 'active']")
	WebElement   emailsTab;
	@FindBy(xpath="//div[@class='summaryBlockHeading']/div[1]//a")
	WebElement  driveFileSummaryMoreIcon;
	@FindBy(xpath="//li[contains(text(),' Drive Files') and @class= 'active']")
	WebElement   driveFilesTab;
	@FindBy(xpath="//div[@class='summaryBlockHeading']/div[2]//a")
	WebElement  sharedDriveMoreIcon;
	@FindBy(xpath="//li[contains(text(),' Shared Drives') and @class= 'active']")
	WebElement   sharedDriveTab;
	@FindBy(xpath="//div[@class='summaryBlockHeading']/div[3]//a")
	WebElement  activeMalwareMoreIcon;
	@FindBy(xpath="//li[contains(text(),' Malware') and @class= 'active']")
	WebElement   malwareTab;
	@FindBy(xpath="//div[@class='tabsHeading accountsHeading']/a")
	WebElement   accountseMoreIcon;
	@FindBy(xpath="//li[contains(text(),'Accounts') and @class= 'active']")
	WebElement   accountsTab;
	@FindBy(xpath="//h2[@class='headerForApps']")
	WebElement   accountsHeader;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public  void summaryTabClick(){
		try {
			Thread.sleep(1000);
			summaryTab.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void riskLink() {

		riskMoreIcon.click();
		Assert.assertEquals(riskTab.getText().trim(), "Risks");
		driver.navigate().back();
		
	}
	
	public void appskLink() {
		aapsMoreIcon.click();
		Assert.assertEquals(appsTab.getText().trim(), "Apps");
		driver.navigate().back();
	}
	
	public void emailSummarykLink() {
		try {
			Thread.sleep(500);
		emailSummaryMoreIcon.click();
		Thread.sleep(500);
		Assert.assertEquals(emailsTab.getText().trim(), "Emails");
		driver.navigate().back();
		Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void driveFilesSummaryLink() {
		driveFileSummaryMoreIcon.click();
		Assert.assertEquals(driveFilesTab.getText().trim(), "Drive Files");
		driver.navigate().back();
		
	}
	public void sharedDriveLink() {
		sharedDriveMoreIcon.click();
		Assert.assertEquals(sharedDriveTab.getText().trim(), "Shared Drives");
		driver.navigate().back();
		}
	
	public void activeMalwareLink() {
		try {
			Thread.sleep(500);
			activeMalwareMoreIcon.click();
		Thread.sleep(500);
		Assert.assertEquals(malwareTab.getText().trim(), "Malware");
		driver.navigate().back();
		Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void accountsLink() {
		accountseMoreIcon.click();
		Assert.assertEquals(accountsTab.getText().trim(), "Accounts");
		driver.navigate().back();
	}
	
	public void sourseLinks() {
		try {
			Thread.sleep(500);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='riskDlabel']//a"));
		List<String> optionstext = new ArrayList<String>();
		for (int i = 0; i < options.size(); i++) {
			optionstext.add(options.get(i).getText());
		}
		for (int i = 0; i < optionstext.size(); i++) {
			driver.findElement(By.xpath("//div[@class='riskDlabel']//a[contains(text(),'" +optionstext.get(i)+ "')]")).click();
			Thread.sleep(500);
			Assert.assertEquals(riskTab.getText().trim(), "Risks");
			Thread.sleep(500);
			driver.navigate().back();
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	
	public void appLinks() {
		try {
			Thread.sleep(500);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='totalAppsDetailsMidRowBlk']//a"));
		List<String> optionstext = new ArrayList<String>();
		for (int i = 0; i < options.size(); i++) {
			optionstext.add(options.get(i).getText());
		}
		for (int i = 0; i < optionstext.size(); i++) {
			driver.findElement(By.xpath("//div[@class='totalAppsDetailsMidRowBlk']//a[contains(text(),'"+optionstext.get(i)+"')]")).click();
			Thread.sleep(500);
			Assert.assertEquals(appsTab.getText().trim(), "Apps");
			Thread.sleep(500);
			driver.navigate().back();
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	
	public void driveFileSummaryLink() {
		try {
			Thread.sleep(500);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='fileSummary']//a"));
		List<String> optionstext = new ArrayList<String>();
		for (int i = 0; i < options.size(); i++) {
			optionstext.add(options.get(i).getText());
		}
		for (int i = 0; i < optionstext.size(); i++) {
			driver.findElement(By.xpath("//div[@class='fileSummary']//a[contains(text(),'"+optionstext.get(i)+"')]")).click();
			Thread.sleep(500);
			Assert.assertEquals(driveFilesTab.getText().trim(), "Drive Files");
			Thread.sleep(500);
			driver.navigate().back();
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	public void accountsGraph() {
		try {
			Thread.sleep(500);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='accountInfoGraphWrap']//a"));
		List<String> optionstext = new ArrayList<String>();
		for (int i = 0; i < options.size(); i++) {
			optionstext.add(options.get(i).getText());
		}
		for (int i = 0; i < optionstext.size(); i++) {
			driver.findElement(By.xpath("//div[@class='accountInfoGraphWrap']//a[contains(text(),'"+optionstext.get(i)+"')]")).click();
			Thread.sleep(500);
			Assert.assertEquals(accountsTab.getText().trim(), "Accounts");
			Thread.sleep(500);
			driver.navigate().back();
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	public void recentlyLoggedInUsers() {
		try {
			Thread.sleep(500);
		List<WebElement> options = driver.findElements(By.xpath("//div[@id='recentLoginsListDiv']//a/span"));
		List<String> optionstext = new ArrayList<String>();
		for (int i = 0; i < options.size(); i++) {
			optionstext.add(options.get(i).getText().toLowerCase());
		}
		for (int i = 0; i < optionstext.size(); i++) {
			driver.findElement(By.xpath("//div[@id='recentLoginsListDiv']//a/span[contains(text(),'"+optionstext.get(i)+"')]")).click();
			Thread.sleep(500);
			Assert.assertEquals(accountsHeader.getText().trim().toLowerCase(), optionstext.get(i));
			Thread.sleep(500);
			driver.navigate().back();
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
}
