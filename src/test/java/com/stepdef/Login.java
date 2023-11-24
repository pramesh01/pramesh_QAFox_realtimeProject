package com.stepdef;

import org.testng.Assert;

import com.automation.framework.Elements;
import com.automation.pages.AccountDashboardPage;
import com.automation.pages.HeaderSection;
import com.automation.pages.LoginPage;
import com.automation.pages.UserRegisterPage;

import io.cucumber.java.en.*;

public class Login {
	HeaderSection headerSection=new HeaderSection();
	LoginPage loginpage=new LoginPage();
	AccountDashboardPage accountdashboardpage=new AccountDashboardPage();
	
	
	@And ("I am navigation towards login account page")
	public void i_am_navigation_towards_login_account_page() {
		System.out.println("i am navigating to user login page");
		Elements.click(HeaderSection.myAccountLink);
		Elements.click(HeaderSection.loginLink);
		System.out.println("Successfully navigated towards credentials login page");
	}
	
	@When("i am entering username {string} and password {string}")
	public void i_am_entering_username_and_password(String email, String password) {
		System.out.println("Going to Enter Username & password in the Login WebPage");
		LoginPage.doLogin(email, password); 
		
	  }
	
	@Then("user account dashboard should get appeared")
	public void user_account_dashboard_should_get_appeared() {
		System.out.println("verifying the Text inside dashboard page for successfull validation");
		Assert.assertTrue(Elements.isDisplayed(AccountDashboardPage.texttobverified));
		System.out.println("text inside Dashboard is validated successfully");
	    
	}
	
	@Then("warning message should get displayed")
	public void warning_message_should_get_displayed() {
		System.out.println("trying to login with incorrect credentials");
		  //Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.warningmessagefor_incorrectlogin,"Returning Customer"));
		  Assert.assertTrue(Elements.isDisplayed(LoginPage.warningmessagefor_incorrectlogin));
		  System.out.println("Login cancelled due to incorrect login");
	 }
	
	@Then("user should not be allowed to login")
	public void user_should_not_be_allowed_to_login() {
	    Assert.assertTrue(Elements.isDisplayed(LoginPage.login_breadcrumb));
	    System.out.println("User is not able to log in with wrong credentials and still inside login breadcrumb");
		
	 }
       }
