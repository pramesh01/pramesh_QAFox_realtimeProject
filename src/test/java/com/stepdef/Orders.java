package com.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.CheckoutPage;
import com.automation.pages.HeaderSection;
import com.automation.pages.LoginPage;
import com.automation.pages.OrderCompletePage;
import com.automation.pages.SearchResultPage;
import com.automation.pages.ShoppingCartPage;

import io.cucumber.java.en.*;

public class Orders {
	
	HeaderSection headerSection=new HeaderSection();
	LoginPage loginpage=new LoginPage();
	SearchResultPage searchresultPage=new SearchResultPage();
	ShoppingCartPage shoppingcartPage=new ShoppingCartPage();
	CheckoutPage checkoutPage=new CheckoutPage();
	OrderCompletePage ordercompletePage=new OrderCompletePage();
	
	@Given("Login to application")
	public void login_to_application() {
		System.out.println("Trying to login to application");
		Base.driver.get(Base.reader.getUrl());
		Elements.click(HeaderSection.myAccountLink);
		Elements.click(HeaderSection.loginLink);
		Elements.TypeText(LoginPage.enter_useremailfield,Base.reader.getUsername());
		Elements.TypeText(LoginPage.enter_passwordfield,Base.reader.getPassword());
		Elements.click(LoginPage.login_button);
		System.out.println("User has been logged in successfully to the application");
	    
	}
	
	@And("add product to bag and checkout")
	public void add_product_to_bag_and_checkout() throws InterruptedException {
		System.out.println("Trying to chekout the selected product");
		Elements.TypeText(HeaderSection.searchtextfield, Base.reader.getproductname());
		Elements.click(HeaderSection.searchiconbutton);
		Thread.sleep(2000);
		Elements.click(SearchResultPage.addtocartLink);
		//Elements.click(SearchResultPage.addtocartLink);
		System.out.println("successfully added product to cart");
		Thread.sleep(2000);
		Elements.click(HeaderSection.shopingcartLink);
		System.out.println("successfully clicked on shopping cart link");
		Thread.sleep(2000);
		Elements.click(ShoppingCartPage.checkOutlink);
		System.out.println("successfully clicked on checkout link");
		System.out.println("Selected Product has been checked out successfully");
	  }
	
	@When("I place a complete order")
	public void i_place_a_complete_order() throws InterruptedException {
		System.out.println("trying to place an order");
	    //CheckoutPage.filling_billing_details();
	    Elements.click(CheckoutPage.billingdetailpage_continueLink);
	    Elements.click(CheckoutPage.deliverydetailpage_continueLink);
	    Elements.click(CheckoutPage.deliverymethod_continueLink);
	    Elements.click(CheckoutPage.paymentmethod_checkboxLink);
	    Elements.click(CheckoutPage.paymentmethod_continueLink);
	    Elements.click(CheckoutPage.confirmorder_continueLink);
	    Thread.sleep(5000);
	    System.out.println("order is placed");
	  }
	
	@Then("order placed message should get displayed")
	public void order_placed_message_should_get_displayed() {
		System.out.println("checking for your order status");
	Assert.assertTrue(Elements.VerifyTextEquals(OrderCompletePage.orderplaced_message,"Your order has been placed!")); 
	System.out.println("your Order has been placed successfully");
	}
}
