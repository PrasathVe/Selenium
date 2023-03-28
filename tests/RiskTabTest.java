package tests;

import org.testng.annotations.Test;

import pages.RiskPage;
import pages.SummaryPage;

public class RiskTabTest extends BaseClass {

	// @Test(priority=1)
	public void verifyNamePopup() {
		RiskPage riskPageObject = new RiskPage(driver);
		riskPageObject.namePopup();
	}

	 //@Test(priority=1)
		public void verifyTotalActiveLinks() {
			RiskPage riskPageObject = new RiskPage(driver);
			riskPageObject.totalActiveLinks();
		}
		
		//@Test(priority=1)
		public void verifyAccountsWithMostRisk() {
			RiskPage riskPageObject = new RiskPage(driver);
			riskPageObject.accountsWithMostRisk();
		}
		
		@Test(priority=1)
		public void verifyemabledRisk() {
			RiskPage riskPageObject = new RiskPage(driver);
			riskPageObject.emabledRisk();
		}

}
