package com.obs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.obs.actions.ClickActionHelpers;
import com.obs.actions.SendKeysActionHelpers;
import com.obs.actions.ValidationActionHelpers;
import com.obs.actions.WebActionHelpers;
import com.obs.utils.WaitUtil;

public class CafteriaHomePage {
	WebDriver driver;
	public ValidationActionHelpers vah;

	public ClickActionHelpers click;
	public WaitUtil wait;
	public WebActionHelpers action;
	public ValidationActionHelpers valid;
	
	public CafteriaHomePage() {
		PageFactory.initElements(driver, this);
		
		click = new ClickActionHelpers();
		wait = new WaitUtil(driver);
		action = new WebActionHelpers();
		valid = new ValidationActionHelpers();
	}

	@FindBy(xpath = "//https://qalegend.com/restaurant/assets/img/logo.png ]")
	WebElement homepagelogo;

	@FindBy(xpath = "//span[@class='hidden-xs']")
	WebElement adminName;

	@FindBy(xpath = "//img[@class='img-circle topbar-userpic hidden-xs']")
	WebElement adminimage;

	@FindBy(xpath = "//a[@href='https://qalegend.com/restaurant/products']")
	public WebElement productlink;

	@FindBy(xpath = "//img[@src='https://qalegend.com/restaurant/assets/img/flags/en.png']")
	WebElement English;

	@FindBy(xpath = "//*[@class='fa fa-sign-out fa-lg']")
	WebElement logout;

	@FindBy(xpath = "//span[text()='POS']")
	WebElement menupos;

	@FindBy(xpath = "(//span[@class='menu-text'])[2])")
	WebElement menupro;

	@FindBy(xpath = "//span[text()='Stores']")
	WebElement menustore;

	@FindBy(xpath = "//span[text()='People']")
	WebElement menupeople;

	@FindBy(xpath = "//span[text()='Waiters']")
	WebElement submenuWaiter;

	@FindBy(xpath = "//span[text()='Customers']")
	WebElement submenuCust;

	@FindBy(xpath = "//span[text()='Suppliers']")
	WebElement submenuSupp;

	@FindBy(xpath = "//span[text()='Sales']")
	WebElement menusales;

	@FindBy(xpath = "//span[text()='Categories ']")
	WebElement menuCat;

	@FindBy(xpath = "(//span[@class='menu-text'])[11]")
	WebElement menusubpro;

	@FindBy(xpath = "(//span[@class='menu-text'])[12]")
	WebElement menusubexp;

	@FindBy(xpath = "//span[text()='Setting']")
	WebElement menuSett;

	@FindBy(xpath = "//span[text()='Reports']")
	WebElement menuRep;

	@FindBy(xpath = "//h1[@class='text-center choose_store']")
	WebElement chooseStore;

	@FindBy(xpath = "(//span[@class='store_title'])[1]")
	WebElement store1;

	@FindBy(xpath = "(//span[@class='store_title'])[13]")
	WebElement store2;

	@FindBy(xpath = "(//span[@class='store_title'])[2]")
	WebElement store3;

	@FindBy(xpath = "(//span[@class='store_title'])[14]")
	WebElement store14;

	public boolean isLogovisible() {
		return homepagelogo.isDisplayed();
	}

	public String getAdminName() {
		return adminName.getText();

	}

	public boolean getAdminImage() throws Exception {
		return valid.isElementVisible(driver, adminimage);

	}

	public void clickLogoutButton() throws Exception {
		wait.waitforElementClick(logout);
		click.click(logout);

	}

	public void isHomepageMainmenuDisplayed() throws Exception {
		valid.isElementVisible(driver, menupos);
		valid.isElementVisible(driver, menupro);
		valid.isElementVisible(driver, menustore);
		valid.isElementVisible(driver, menupeople);
		valid.isElementVisible(driver, menusales);
		valid.isElementVisible(driver, menuCat);
		valid.isElementVisible(driver, menuSett);
		valid.isElementVisible(driver, menuRep);
		valid.isElementVisible(driver, chooseStore);
	}

	public void isHomepageSubmenuDisplayed() throws Exception {
		valid.isElementVisible(driver, submenuWaiter);
		valid.isElementVisible(driver, submenuCust);
		valid.isElementVisible(driver, submenuSupp);
		valid.isElementVisible(driver, menusubpro);
		valid.isElementVisible(driver, menusubexp);
	}

	public String getHeadingTitle() {
		return chooseStore.getText();
	}

	public void getStoreName() throws Exception {
		valid.isElementVisible(driver, store1);
		valid.isElementVisible(driver, store2);
		valid.isElementVisible(driver, store3);
		valid.isElementVisible(driver, store14);
	}

	public void productclick() throws Exception {
		wait.waitforElementClick(productlink);
		click.click(productlink);
	}

}
