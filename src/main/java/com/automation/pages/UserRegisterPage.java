package com.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;
import com.automation.framework.Elements;

import io.cucumber.datatable.DataTable;

public class UserRegisterPage {
	
	public UserRegisterPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-firstname")
	public static WebElement firstName;
	
	@FindBy(id="input-lastname")
	public static WebElement lastName;
	
	@FindBy(id="input-email")
	public static WebElement email;
	
	@FindBy(id="input-telephone")
	public static WebElement telephone;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(id="input-confirm")
	public static WebElement confirmpassword;
	
	@FindBy(name="agree")
	public static WebElement privacyPolicy;
	
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement continueLink;
	
	@FindBy(xpath="//*[@id='account-register']/div[1]")
	public static WebElement warningmessagepath;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")
	public static WebElement subscribebutton;
	
	@FindBy(xpath="//*[@id='account-register']/ul/li[3]/a")
	public static WebElement registrationbreadcrumb;
	
	@FindBy(xpath="//*[text()='First Name must be between 1 and 32 characters!']")
	public static WebElement mandatory_fname;
	
	@FindBy(xpath="//*[text()='Last Name must be between 1 and 32 characters!']")
	public static WebElement mandatory_lname;
	
	@FindBy(xpath="//*[text()='E-Mail Address does not appear to be valid!']")
	public static WebElement mandatory_email;
	
	
	public static void enterAllDetails(DataTable datatable,String userdataType) {
        Map<String,String> map=datatable.asMap(String.class,String.class);
		Elements.TypeText(UserRegisterPage.firstName,map.get("FirstName"));
		Elements.TypeText(UserRegisterPage.lastName,map.get("LastName"));
		//Elements.TypeText(UserRegisterPage.email,System.currentTimeMillis()+map.get("Email"));
		Elements.TypeText(UserRegisterPage.telephone,map.get("Telephone"));
		Elements.TypeText(UserRegisterPage.password,map.get("Password"));
		Elements.TypeText(UserRegisterPage.confirmpassword,map.get("Password"));
		
		if(userdataType.equalsIgnoreCase("duplicate")) {
			Elements.TypeText(UserRegisterPage.email,map.get("Email"));
		}
		else {
			Elements.TypeText(UserRegisterPage.email,System.currentTimeMillis()+map.get("Email"));
		}
	}
}
