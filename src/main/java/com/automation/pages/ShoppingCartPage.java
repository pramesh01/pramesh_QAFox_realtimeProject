package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class ShoppingCartPage {
	
	public ShoppingCartPage() {
	  PageFactory.initElements(Base.driver, this);
	   }

    @FindBy(linkText="Checkout")
    public static WebElement checkOutlink;
	
       }
