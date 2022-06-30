package com.obs.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obs.actions.ClickActionHelpers;
import com.obs.base.AutomationBase;
import com.obs.utils.WaitUtil;

public class AddProduct  {
	WebDriver driver;
	public WaitUtil wait;
	public ClickActionHelpers click;

	public AddProduct(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		click=new ClickActionHelpers();
	}

	@FindBy(xpath="//a[@href='https://qalegend.com/restaurant/products']")
	public WebElement menu;
	
	@FindBy(xpath="//button[@type='button' and @class='navbar-toggle collapsed']")
	public WebElement button;
	
	
	@FindBy(xpath="//*[@id='Type' and @name='type']")
	public WebElement ptype;
	
	@FindBy(xpath="//input[@id='ProductCode']")
	public WebElement pcode;
	
	@FindBy(xpath="//input[@id='ProductName']")
	public WebElement pname;
	
	@FindBy(xpath="//*[@id='Category']")
	public WebElement pcategory;
	
	@FindBy(xpath="//input[@id='PurchasePrice']")
	public WebElement pprice;
	
	@FindBy(xpath="//input[@id='Unit']")
	public WebElement punit;
	
	@FindBy(xpath="//input[@id='AlertQt']")
	public WebElement palertqt;
	
	@FindBy(xpath="//*[@id='ProductOptions']")
	public WebElement poptions;
	
	@FindBy(xpath="//div[@class='note-editable panel-body']")
	public WebElement ppanelbody;
	
	
	
public boolean isproButtonclickable() throws Exception
{
	wait.waitforElementClick(menu);
	click.click(menu);
	return false;
	
}

}
