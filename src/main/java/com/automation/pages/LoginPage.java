package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;
import com.automation.framework.Elements;


public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-email")
    public static WebElement enter_useremailfield;
	
	@FindBy(name="password")
    public static WebElement enter_passwordfield;
	
	@FindBy(xpath="//input[@type='submit'][@value='Login']")
    public static WebElement login_button;
	
	@FindBy(xpath="//*[@id='content']/div/div[2]/div/h2")
    public static WebElement warningmessagefor_incorrectlogin;
	
	@FindBy(linkText="Login")
    public static WebElement login_breadcrumb;
	
	
	public static void doLogin(String emailid,String password) {
		Elements.TypeText(LoginPage.enter_useremailfield,emailid );
		Elements.TypeText(LoginPage.enter_passwordfield,password );
		Elements.click(LoginPage.login_button);
	}

}
