package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public WebDriver driver;
	public JavascriptExecutor js;

	public static void PaginationClick(WebElement element, WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		element.click();

	}

	public static void ExplicitWait(Object Locator, WebDriver driver){

		WebDriverWait wait = new WebDriverWait(driver,80);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) Locator));
	}

	public static void ValidateAPerformLinkandNolinkCase(String elementXpath,WebDriver driver ){
		if(driver==null){
			System.out.println("Driver is NULL");
		}

		if(elementXpath==null){
			System.out.println("Xpath is NULL");
		}

		if(driver.findElements(By.xpath(elementXpath)).size()!=0){

			WebElement element = driver.findElement(By.xpath(elementXpath));

			if(element.isDisplayed()){
				element.click();
			}
		} 
	}


	public void ValidateTabHeading(String ActualTabName, String ExpectedTabName, WebDriver driver){

		if(ActualTabName.equals(ExpectedTabName)){
			System.out.println("It is pointing to " +ActualTabName);
		}else{
			System.out.println("It is not pointing to expected Tab: " +ExpectedTabName);
		}
	}


}
