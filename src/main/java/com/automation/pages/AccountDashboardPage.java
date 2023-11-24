package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class AccountDashboardPage {
	
	public AccountDashboardPage() {
		PageFactory.initElements(Base.driver, this);
	 }
	@FindBy(linkText="Edit your account information")
     public static WebElement texttobverified;
	  
        }
