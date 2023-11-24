package com.stepdef;

import java.util.Map;

import org.testng.Assert;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.AccountSuccessPage;
import com.automation.pages.HeaderSection;
import com.automation.pages.UserRegisterPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class UserRegistration {
	
	HeaderSection headerSection=new HeaderSection();
	UserRegisterPage userregisterPage=new UserRegisterPage();
	AccountSuccessPage accountsuccessPage=new AccountSuccessPage();
	
	@Given("I launch application")
	public void launch_application() {
		System.out.println("I am going to launch application");
		Base.driver.get(Base.reader.getUrl());
		
	}
	@And ("I navigate to account navigation page")
	public void account_navigation_page() {
		System.out.println("navigating towards application home page for given url");
		Elements.click(HeaderSection.myAccountLink);
		Elements.click(HeaderSection.registerLink);
	  }
	
	@When ("I provide all the below mentioned credentials")
	public void all_credentials(DataTable datatable) {
		System.out.println("will print all the datatable values here");
		UserRegisterPage.enterAllDetails(datatable,"unique");
	      }
	@When ("I provide following duplicate user details")
	public void duplicate_credentials(DataTable datatable) {
		System.out.println("providing duplicate user details");
		UserRegisterPage.enterAllDetails(datatable,"duplicate");
	      }
	
	@And ("I selected privacy policy")
	public void privacy_policy() {
		System.out.println("privacy policy selected");
		Elements.click(UserRegisterPage.privacyPolicy);
	}
	
	@And ("I click on continue button")
	public void continue_button() {
		System.out.println("selecting continue button");
		Elements.click(UserRegisterPage.continueLink);
	}
	
	@Then ("user account should be created successfully")
	public void user_account_created() {
	  System.out.println("user account has been created");
	  Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.successbreadcrum));
	  System.out.println("Registration Verified and it is successful.");
	   }
	
	@Then ("user should get the error warning message")
	public void user_account_rejected() {
		  System.out.println("user account creation is rejected");
		  Assert.assertTrue(Elements.VerifyTextEquals(UserRegisterPage.warningmessagepath,"Warning: E-Mail Address is already registered!"));
		  System.out.println("Registration is UnAuthorised.");
        }
	
	@And ("I selected subscribed radio button")
	public void subscribed_users() {
		System.out.println("i am selecting Subscribed option for user registration");
		Elements.click(UserRegisterPage.subscribebutton);
	}
	
	@Then ("I must see that user is not registered")
	 public void registration_breadcrumb() {
		System.out.println("verifying that user is still on Registration breadcrumb");
		Assert.assertTrue(Elements.isDisplayed(UserRegisterPage.registrationbreadcrumb));
	  }
	
	@And ("error message should be displayed related to mandatory fields warnings")
	 public void warning_messages_mandatoryfields() {
		System.out.println("confirming for he warning messages on registration page for mandatory fields.");
		Assert.assertTrue(Elements.isDisplayed(UserRegisterPage.mandatory_fname));
		Assert.assertTrue(Elements.isDisplayed(UserRegisterPage.mandatory_lname));
		Assert.assertTrue(Elements.isDisplayed(UserRegisterPage.mandatory_email));
		
	 }
 }
