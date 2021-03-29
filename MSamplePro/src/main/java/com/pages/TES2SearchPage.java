package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.BaseTest;
import com.common.Lib;


public class TES2SearchPage {
	
	Lib lb = new Lib();
	
	@FindBy(xpath="//input[@id='input-search']")
	public WebElement searchField;
	
	@FindBy(xpath="//button[text()='Find Item']")
	public WebElement findItembutton;

	
	public TES2SearchPage() {
		PageFactory.initElements(BaseTest.getDriver(), this);
	}
	
	public void enterBarcode(String barcode) {
		lb.sendKeys(searchField, barcode);
	}
	
	public void clickOnFindItem() {
		lb.clickMethod(findItembutton);
	}
}
