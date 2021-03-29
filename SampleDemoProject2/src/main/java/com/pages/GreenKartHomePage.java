package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.Utilities;

public class GreenKartHomePage {
	
	public static WebDriver driver;
	
	Utilities ut = new Utilities();
	
	@FindBy(xpath="//input[contains(@class,'search-keyword')]")
	public WebElement searchField;
	
	@FindBy(xpath="//a[@class='increment']")
	public WebElement incrementQuantity;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	public WebElement addToCartButton;
	
	@FindBy(xpath="//a[contains(@class, 'cart')]/img")
	public WebElement cartButton;
	
	@FindBy(xpath="//button[contains(., 'PROCEED TO CHECKOUT')]")
	public WebElement proceedToCheckoutButton;
	
	//Order Page
	@FindBy(xpath="//td/p[contains(.,'Brinjal')]")
	public WebElement itemAddedinCart;

	public GreenKartHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
		
	
	
	public void searchVegetable(String s) {
		
		ut.waitMethod(searchField);
		ut.clickMethod(searchField);
		ut.sendKeys(searchField, s);
	}
	
	public void addToCart() {
		ut.waitMethod(incrementQuantity);
		ut.clickMethod(incrementQuantity);
		ut.waitMethod(addToCartButton);
		ut.clickMethod(addToCartButton);
	}
	
	public void goOrderPage() {
		ut.waitMethod(cartButton);
		ut.clickMethod(cartButton);
		ut.clickMethod(proceedToCheckoutButton);
	}
	
	public void verifyItem(String s) {
		ut.verifyText(itemAddedinCart, s);
				
	}

}

	
