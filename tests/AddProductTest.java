package com.obs.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.obs.datahandler.PropertyDataHandler;
import com.obs.pages.AddProduct;
import com.obs.pages.CafteriaHomePage;

public class AddProductTest  {

	WebDriver driver;
	AddProduct addPro;
	PropertyDataHandler prop = new PropertyDataHandler();

	@BeforeMethod
	
	@Test(priority = 1, enabled = true)

	public void Verifybuttonclickable() throws Exception {
		Assert.assertTrue(addPro.isproButtonclickable(), "Not clickable");
	}
}