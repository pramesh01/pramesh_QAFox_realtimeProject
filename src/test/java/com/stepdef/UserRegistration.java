package com.stepdef;

import com.automation.base.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class UserRegistration {
	
	@Given("I launch application")
	public void launch_application() {
		System.out.println("I am going to launch application");
		Base.driver.get(Base.reader.getUrl());
		
	}
	@And ("I navigate to account navigation page")
	public void account_navigation_page() {
		System.out.println("navigating towards application home page for given url");
	}
	@When ("I provide all the below mentioned vlid credentials")
	public void all_credentials(DataTable table) {
		System.out.println("will print all the datatable values here");
	}
	@And ("I selected privacy policy")
	public void privacy_policy() {
		System.out.println("privacy policy selected");
	}
	@And ("I click on continue button")
	public void continue_button() {
		System.out.println("selecting continue button");
	}
	@Then ("user account should be created successfully")
	public void user_account_created() {
		System.out.println("user account has been created");
	}

}
