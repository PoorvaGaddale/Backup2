package com.steps;

import com.common.BaseTest;
import com.pages.GreenKartHomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends BaseTest{
	
	
	GreenKartHomePage hp = new GreenKartHomePage(driver);
	
	 @Given("^User is on GreenKart landing page$")
	    public void user_is_on_greenkart_landing_page() {
	       launchUrl();
	    }

	    @When("^User searched for \"([^\"]*)\" vegetable$")
	    public void user_searched_for_something_vegetable(String strArg1) {
	    	try {
				System.out.println("Item name "+strArg1);
				hp.searchVegetable(strArg1);
			} catch (Exception e) {
				e.printStackTrace();
			}
	        
	    }

	    @Then("^verify selected \"([^\"]*)\" items are displayed in checkout page$")
	    public void verify_selected_something_items_are_displayed_in_checkout_page(String strArg1) {
	    	System.out.println("Item added to Cart "+strArg1);
	    }

	    @And("^Added items to cart$")
	    public void added_items_to_cart()  {
	       hp.addToCart();
	    }

	    @And("^User proceeded to checkout page$")
	    public void user_proceeded_to_checkout_page() {
	        hp.goOrderPage();
	    }
	
}
