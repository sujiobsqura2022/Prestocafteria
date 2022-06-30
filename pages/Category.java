package com.obs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category {
	WebDriver driver;
	
	
	
	@FindBy(xpath="//*[@type='button' and @class='btn btn-add btn-lg']")
	public static WebDriver addCat;
	
	
	@FindBy(xpath="//a[@href='https://qalegend.com/restaurant/categories']")
	public static WebDriver subPro;
	
	
	
}
