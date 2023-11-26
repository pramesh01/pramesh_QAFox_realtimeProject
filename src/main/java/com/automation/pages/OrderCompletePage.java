package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class OrderCompletePage {
	
	public OrderCompletePage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//*[@id='content']/h1")
    public static WebElement orderplaced_message;

}
