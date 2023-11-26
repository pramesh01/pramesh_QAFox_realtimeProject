package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.base.Base;
import com.automation.framework.Elements;

public class CheckoutPage {
	
	public CheckoutPage() {
	   PageFactory.initElements(Base.driver,this);
	 }
	
	@FindBy(name="firstname")
    public static WebElement billingdetailpage_firstname;
	
	@FindBy(name="address_1")
    public static WebElement billingdetailpage_address1;
	
	@FindBy(name="lastname")
    public static WebElement billingdetailpage_lastname;
	
	@FindBy(name="city")
    public static WebElement billingdetailpage_city;
	
	@FindBy(name="postcode")
    public static WebElement billingdetailpage_postalcode;
	
	@FindBy(id="input-payment-country")
    public static WebElement billingdetailpage_country;
	
	@FindBy(id="input-payment-zone")
    public static WebElement billingdetailpage_region_country;
    
	@FindBy(id="button-payment-address")
    public static WebElement billingdetailpage_continueLink;
	
	@FindBy(id="button-shipping-address")
    public static WebElement deliverydetailpage_continueLink;
	
	@FindBy(id="button-shipping-method")
    public static WebElement deliverymethod_continueLink;
	
	@FindBy(xpath="//input[@type='checkbox'][@name='agree']")
    public static WebElement paymentmethod_checkboxLink;
	
	@FindBy(id="button-payment-method")
    public static WebElement paymentmethod_continueLink;
	
	@FindBy(id="button-confirm")
    public static WebElement confirmorder_continueLink;
	
	public static void filling_billing_details() throws InterruptedException {
		
		/*Elements.TypeText(CheckoutPage.billingdetailpage_firstname, "pramesh");
		Elements.TypeText(CheckoutPage.billingdetailpage_lastname, "kumar");
		Elements.TypeText(CheckoutPage.billingdetailpage_address1, "MIG 21 B Sector B Unnao");
		//Elements.TypeText(CheckoutPage.billingdetailpage_city, "Unnao");
		//Elements.TypeText(CheckoutPage.billingdetailpage_postalcode, "209801");
		//Elements.TypeText(CheckoutPage.billingdetailpage_country, "India");
		Select s=new Select(CheckoutPage.billingdetailpage_country);
		s.selectByVisibleText("India");
		Thread.sleep(2000);
		Elements.TypeText(CheckoutPage.billingdetailpage_region_country, "Uttar Pradesh");
		s=new Select(CheckoutPage.billingdetailpage_region_country);
		s.selectByVisibleText("D");
		Thread.sleep(2000);
		
		Elements.TypeText(CheckoutPage.billingdetailpage_city, "UNNAO");
		Elements.TypeText(CheckoutPage.billingdetailpage_postalcode, "209801");*/
		
		Elements.click(CheckoutPage.billingdetailpage_continueLink);
	  }
       }