package com.obs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.obs.actions.ClickActionHelpers;
import com.obs.actions.SendKeysActionHelpers;
import com.obs.actions.ValidationActionHelpers;
import com.obs.actions.WebActionHelpers;
import com.obs.base.AutomationBase;
import com.obs.utils.WaitUtil;

public class LoginPage extends AutomationBase {
	public ValidationActionHelpers vah;
	public SendKeysActionHelpers send;
	public ClickActionHelpers click = new ClickActionHelpers();
	public WaitUtil wait;
	public WebActionHelpers action = new WebActionHelpers();
	public ValidationActionHelpers valid;
	public LoginPage lpage;
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		send = new SendKeysActionHelpers();
		lpage=new LoginPage(driver);
		
		wait = new WaitUtil(driver);
		// action

	}

	@FindBy(xpath = "//input[@name='username']")
	public static WebElement usname;

	@FindBy(xpath = "//input[@name='password']")
	public static WebElement pawd;

	@FindBy(xpath = "//input[@name='submit']")
	public static WebElement loginb;

	@FindBy(xpath = "//img[@src ='https://qalegend.com/restaurant/assets/img/logo.png']")
	public WebElement adminlogo;

	// @FindBy(xpath = "//a[@href='https://qalegend.com/restaurant/products']")
	// public WebElement menu;

	/// @FindBy(xpath = "//input[@type='submit' and @class='login
	/// loginmodal-submit']")
	// public WebElement button;

	@FindBy(xpath = "//div[@class='login-help']")
	public WebElement Cname;

	public String getCurrentPageUrl() {
		
		return action.getSiteURL(driver);

	}

	public String getCurrentPageTitle() {
		return action.getSiteTitle(driver);
	}

	public String getCafteriaName() {
		return Cname.getText();
	}

	public boolean isLoginfieldsdisplayed() {
		return usname.isDisplayed();
	}

	public boolean isPasswordfieldsdisplayed() {
		return pawd.isDisplayed();
	}
	public void typeUsername(String email) {
		usname.sendKeys(email);
	}
	public void typePassword(String password) {
		pawd.sendKeys(password);
	}
	public void clickLogin() {
		loginb.click();
	}

	/*public void loginAction(String uname, String pword) throws Exception {

		send.clearAndsendkeys(usname, uname);
		send.clearAndsendkeys(pawd, pword);
		// wait.waitforElementClick(loginb);
	click.click(loginb);
		// click.click(menu);

	}*/

	// TODO Auto-generated method stub

	// public boolean homePageElements() throws Exception {

	// boolean a = vah.isElementVisible(driver, adminlogo);
	// return a;
	// }

}
