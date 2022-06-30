package com.obs.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.obs.actions.ClickActionHelpers;
import com.obs.actions.SendKeysActionHelpers;
import com.obs.actions.ValidationActionHelpers;
import com.obs.actions.WebActionHelpers;
import com.obs.datahandler.PropertyDataHandler;
import com.obs.pages.CafteriaHomePage;
import com.obs.utils.WaitUtil;

public class CafteriaHomePageTest extends BaseTest  {
	WebDriver driver;
	CafteriaHomePage chpage;
	PropertyDataHandler prop = new PropertyDataHandler();

	@BeforeMethod
	

	@Test(priority = 1, enabled = true)

	public void VerifyHomeLogoPresent() {
		Assert.assertTrue(chpage.isLogovisible(), "Logo not visible in HomePage");
	}

	@Test(priority = 2, enabled = true)

	public void verifyHomepageadminename() {
		String actual = chpage.getAdminName();
		String expected = "   admin Doe ";
		Assert.assertEquals(actual, expected, "AdminName Not Matching");
	}

	@Test(priority = 3, enabled = true)

	public void verifyHomepageadminImage() throws Exception {
		Assert.assertTrue(chpage.getAdminImage(), "Image not present in homepage");
	}
	@Test(priority = 4, enabled = true)

	public void verifyHomepageMainmenu() throws Exception {
				
}
	@Test(priority = 4, enabled = true)

	public void verifyHomepageHeading() throws Exception {
		String actual = chpage.getHeadingTitle();
		String expected ="Choose a store";
		Assert.assertEquals(actual, expected, "Heading not matching");
}
	@Test(priority = 5, enabled = true)

	public void verifyHomepageStore() throws Exception {
		
}
}