package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.PolicyViolationPage;



public class PolicyViolationTab extends BaseClass {

	@Test(priority=1)
	void ValidatePolicyViolationtabTabClick() throws InterruptedException{
		PolicyViolationPage policyviolation = new PolicyViolationPage(driver);
		policyviolation.PolicyViolationtabTabClick();
	}

	@Test(priority=2)
	void ValidatePolicylinkclick() throws InterruptedException{

		PolicyViolationPage policyviolation = new PolicyViolationPage(driver);
		policyviolation.PolicylinkClick();

	}


	@Test(priority=3)
	void ValidateEntitiesViolatedlinks() throws InterruptedException{

		PolicyViolationPage policyviolation = new PolicyViolationPage(driver);
		policyviolation.EntitiesViolatedlinks();
	}

	@Test(priority=4)
	void ValidateContententitiesclick() throws InterruptedException{
		PolicyViolationPage policyviolation = new PolicyViolationPage(driver);
		policyviolation.Contententitiesclick();

	}

	@Test(priority=5)
	void ValidateRemediationsclick() throws InterruptedException{
		PolicyViolationPage policyviolation = new PolicyViolationPage(driver);
		policyviolation.Remediationsclick();

	}

	@Test(priority=6)
	void ValidateViolationsRemediationsclick() throws InterruptedException{
		PolicyViolationPage policyviolation = new PolicyViolationPage(driver);
		policyviolation.ViolationsRemediationsclick();
	}


	@Test(priority=7)
	void ValidateEntitynameclicks() throws InterruptedException {
		PolicyViolationPage policyviolation = new PolicyViolationPage(driver);
		policyviolation.Entitynameclicks();

	}

	@Test(priority=8)
	void ValidatePolicyviolatedpopover() throws InterruptedException{

		PolicyViolationPage policyviolation = new PolicyViolationPage(driver);
		policyviolation.Policyviolatedpopover();
	}

	@Test(priority=9)
	void ValidateUserPopover() throws InterruptedException{
		PolicyViolationPage policyviolation = new PolicyViolationPage(driver);
		policyviolation.Userpopover() ;

	}

}
