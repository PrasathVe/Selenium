package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RiskPage {
	WebDriver driver;

	public RiskPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//tr[@class='selectedRow']//td[@class='riskFileName']//span")
	WebElement  firstNameOnTable;
	@FindBy(xpath="//div[@id='fileDetailPopup']//h4[@class='modal-title']/b")
	WebElement  popupTitle;
	@FindBy(xpath="//div[@class='modal-body']//button[contains(text(),'Cancel')]")
	WebElement  cancleOnPopup;
	@FindBy(xpath="//a[contains(text(),'Risks')]")
	WebElement  riskTab;
	@FindBy(xpath="//span[@id='paginatedTextInfoSpan']//b[3]")
	WebElement  filterText;
	@FindBy(xpath="//span[@class='clear-all-filters']")
	WebElement  clearFilter;
	
	
	
	
	
	
	
	public void namePopup() {
		try {
		riskTab.click();
		Thread.sleep(500);
		String filename = firstNameOnTable.getText().trim().toLowerCase();
		Thread.sleep(500);
		firstNameOnTable.click();
		Thread.sleep(500);
		Assert.assertEquals(popupTitle.getText().trim().toLowerCase(), filename);
		Thread.sleep(500);
		cancleOnPopup.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void totalActiveLinks() {
		try {
			riskTab.click();
			Thread.sleep(500);
		List<WebElement> webele = driver.findElements(By.xpath("//div[@class='riskBlkWrapperRight']//a"));
		List<String> optionsName = new ArrayList<String>();
		for (int i = 0; i < webele.size(); i++) {
			optionsName.add(webele.get(i).getText());
		}
		for (int i = 0; i < optionsName.size(); i++) {
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@class='riskBlkWrapperRight']//a[text()='"+optionsName.get(i)+"']")).click();
			Thread.sleep(1000);
			Assert.assertEquals(filterText.getText(), optionsName.get(i));
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void accountsWithMostRisk() {
		try {
			riskTab.click();
			Thread.sleep(500);
		List<WebElement> webele = driver.findElements(By.xpath("//div[@class='inactiveRiskDLabel']//a"));
		List<String> optionsName = new ArrayList<String>();
		for (int i = 0; i < webele.size(); i++) {
			optionsName.add(webele.get(i).getText());
		}
		for (int i = 0; i < optionsName.size(); i++) {
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@class='inactiveRiskDLabel']//a[text()='"+optionsName.get(i)+"']")).click();
			Thread.sleep(1000);
			Assert.assertEquals(filterText.getText(), optionsName.get(i));
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void emabledRisk() {
		try {
			riskTab.click();
			Thread.sleep(500);
		List<WebElement> webele = driver.findElements(By.xpath("//div[@class='enableDisableRiskBlk']//a"));
		List<String> optionsName = new ArrayList<String>();
		for (int i = 0; i < webele.size(); i++) {
			if (!webele.get(i).getText().equals("0")) {
				optionsName.add(webele.get(i).getText());	
			}	
		}
		for (int i = 0; i < optionsName.size(); i++) {
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@class='enableDisableRiskBlk']//a[text()='"+optionsName.get(i)+"']")).click();
			Thread.sleep(1000);
			Assert.assertEquals(filterText.getText(), optionsName.get(i));
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
