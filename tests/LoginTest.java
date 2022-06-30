package com.obs.tests;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.obs.datahandler.PropertyDataHandler;
import com.obs.pages.LoginPage;

public class LoginTest extends BaseTest {
	
		LoginPage lpage;
		PropertyDataHandler prop = new PropertyDataHandler();
	

	@Test(priority = 1, enabled = false)
	public void verifyUrl() {
		String Actual = lpage.getCurrentPageUrl();
		
		String Excepted = "https://qalegend.com/restaurant/login";
		Assert.assertEquals(Actual, Excepted, "Invalid URL");
	}

	@Test(priority = 2, enabled = false)
	public void verifyTitle() {
		String Actual = lpage.getCurrentPageTitle();
		String Excepted = "POS Login";
		Assert.assertEquals(Actual, Excepted, "Invalid Title");
	}

	//@Test(priority = 3, enabled = false)
	//public void verifyLogoPresent() {
	//	Assert.assertTrue(lpage.islogopresent(), "Logo not present in login pgae");
	//}

	@Test(priority = 4, enabled = false)
	public void isLoginFieldsDisplayed() {

		Assert.assertTrue(lpage.isLoginfieldsdisplayed(), "Unable to find LoginField");
		Assert.assertTrue(lpage.isPasswordfieldsdisplayed(), "Unable to find PasswordField");

	}

	@Test(priority = 5, enabled = false)
	public void verifyCafetriaName() {
		String actual = lpage.getCafteriaName();
		String Excepted = "© 2022 Presto Cafeteria";
		Assert.assertEquals(actual, Excepted, "Invalid Name");
	}

	@Test(priority = 1)
	public void verifyValidLogin() throws Exception {
		/*Properties allProp = prop.readPropertiesFile("config.properties");
		String name = allProp.getProperty("username");
		String pass = allProp.getProperty("password");
		lpage.loginAction(name, pass);*/
		Properties allProp = prop.readPropertiesFile("config.properties");
		lpage.typeUsername(allProp.getProperty("username"));
		lpage.typePassword(allProp.getProperty("password"));
		lpage.clickLogin();
	}

}
