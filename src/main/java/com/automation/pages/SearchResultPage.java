package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automation.base.Base;

public class SearchResultPage {
	
	public SearchResultPage() {
		PageFactory.initElements(Base.driver, this);
	  }
	
    @FindBy(linkText="Samsung Galaxy Tab 10.1")
    public static WebElement item_foundpath;
    
    @FindBy(xpath="//*[@id='content']/p[2]")
    public static WebElement itennotfoundmessage;
    
    @FindBy(xpath="//*[@id='content']/p")
    public static WebElement shopcartmessage;
    
    }