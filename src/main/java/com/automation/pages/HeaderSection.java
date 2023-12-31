package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class HeaderSection {
	
	public HeaderSection() {
		
		PageFactory.initElements(Base.driver,this);
	  }	
	
	@FindBy(xpath="//span[text()='My Account']")
    public static WebElement myAccountLink;
	
	@FindBy(linkText="Register")
    public static WebElement registerLink;
	
	@FindBy(linkText="Login")
    public static WebElement loginLink;
	
	@FindBy(name="search")
    public static WebElement searchtextfield;
	
	@FindBy(xpath="//*[@id='search']/span/button")
    public static WebElement searchiconbutton;
	
	@FindBy(linkText="Shopping Cart")
    public static WebElement shopingcartLink;
	
	
	
	
	
}
