package com.stepdef;

import org.testng.Assert;

import com.automation.framework.Elements;
import com.automation.pages.HeaderSection;
import com.automation.pages.SearchResultPage;
import com.automation.pages.UserRegisterPage;


import io.cucumber.java.en.*;

public class Search {
	
	HeaderSection headerSection=new HeaderSection();
	SearchResultPage searchresultPage=new SearchResultPage();
	
	@Given("I search for the product {string} in search textbox")
	public void i_search_for_the_product_in_search_textbox(String productName) {
		Elements.TypeText(HeaderSection.searchtextfield, productName);
		Elements.click(HeaderSection.searchiconbutton);
		System.out.println("entered name of product and clicked on searched button");
	   }
	
	@Then("I get the result for the searched items")
	public void i_get_the_result_for_the_searched_items() {
		
	 Assert.assertTrue(Elements.isDisplayed(SearchResultPage.item_foundpath));
	 System.out.println("items which was searched is found after search functioanlity");
		
	}
	@Then("gets the message regarding item not found")
	public void gets_the_message_regarding_item_not_found() {
		//Assert.assertTrue(Elements.isDisplayed(SearchResultPage.itennotfoundmessage));
		Assert.assertTrue(Elements.VerifyTextEquals(SearchResultPage.itennotfoundmessage,"There is no product that matches the search criteria."));
		System.out.println("successfully got message of item not found on console");
		//System.out.println("after confirming on real page, checking inside the shopping cart");
		//Elements.click(HeaderSection.shopingcartLink);
		//Assert.assertTrue(Elements.VerifyTextEquals(SearchResultPage.shopcartmessage,"Your shopping cart is empty!"));
		//System.out.println("got the message i.e Your ' shopping cart is empty!'");
		
	}
}
