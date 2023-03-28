package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AccountsPage {
	WebDriver driver;

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Accounts')]")
	WebElement  accountsTab;
	@FindBy(xpath="//div[@class='clearBlk clearfix']//b[3]")
	WebElement  filterText;
	@FindBy(xpath="//tr[1]//td[4]//span[1]//a")
	WebElement  appsCountPopup;
	@FindBy(xpath="//h2[@class='headerForApps']")
	WebElement  appsHeader;
	@FindBy(xpath="//div[@id='details']//tr[1]//td[1]/a")
	WebElement  firstEmailId;
	@FindBy(xpath="//tr[1]//td[5]//span[1]//a")
	WebElement  sharedFilesLink;
	@FindBy(xpath="//tr[1]//td[6]//span[1]/a")
	WebElement  groupLink;
	@FindBy(xpath="//tr[1]//td[7]//span[1]/a")
	WebElement  fileLink;
	@FindBy(xpath="//li[@id='top-tab-4']//a")
	WebElement  fileTextOnPopup;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void accountSummary() {
		try {
			accountsTab.click();
			Thread.sleep(500);
		List<WebElement> webele = driver.findElements(By.xpath("//div[@class='accountSummaryWrap']//a"));
		List<String> optionsName = new ArrayList<String>();
		for (int i = 0; i < webele.size(); i++) {
			optionsName.add(webele.get(i).getText());
		}
		for (int i = 0; i < optionsName.size(); i++) {
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@class='accountSummaryWrap']//a[text()='"+optionsName.get(i)+"']")).click();
			Thread.sleep(1000);
			Assert.assertEquals(filterText.getText(), optionsName.get(i));
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void appsCountLink() {
		accountsTab.click();
		try {
			Thread.sleep(500);
			appsCountPopup.click();
			String headerText = appsHeader.getText();
			Thread.sleep(500);
			Assert.assertTrue(headerText.contains("Apps"));
			Thread.sleep(500);
			driver.navigate().back();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void firstEmail() {
		accountsTab.click();
		String firstEmailid ;
		try {
			Thread.sleep(500);
			firstEmailid = firstEmailId.getText();
			firstEmailId.click();
			Thread.sleep(500);
			Assert.assertTrue(firstEmailid.contains("com"));
			Thread.sleep(500);
			driver.navigate().back();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void sharedFiles() {
		accountsTab.click();
		String sharedFilesCount ;
		int x ;
		List<WebElement> webele = new ArrayList<WebElement>();
		try {
			Thread.sleep(500);
			sharedFilesCount = sharedFilesLink.getText();
			x = Integer.parseInt(sharedFilesCount);
			sharedFilesLink.click();
			Thread.sleep(500);
			webele = driver.findElements(By.xpath("//div[@class='teamDriveInfoList']//li"));
			Assert.assertEquals(x, webele.size() );
			//Assert.assertTrue(firstEmailid.contains("com"));
			Thread.sleep(500);
			driver.navigate().back();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void groups() {
		accountsTab.click();
		String groupCount ;
		int x ;
		List<WebElement> webele = new ArrayList<WebElement>();
		try {
			Thread.sleep(500);
			groupCount = groupLink.getText();
			x = Integer.parseInt(groupCount);
			groupLink.click();
			Thread.sleep(500);
			webele = driver.findElements(By.xpath("//div[@class='groupInfoList']//li"));
			Assert.assertEquals(x, webele.size() );
			//Assert.assertTrue(firstEmailid.contains("com"));
			Thread.sleep(500);
			driver.navigate().back();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void filesLink() {
		accountsTab.click();
		fileLink.click();
		try {
			Thread.sleep(500);
			Assert.assertEquals(fileTextOnPopup.getText(), "Files");
			driver.navigate().back();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
