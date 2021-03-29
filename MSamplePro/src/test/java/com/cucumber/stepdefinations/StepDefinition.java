package com.cucumber.stepdefinations;


import com.common.BaseTest;
import com.pages.TES2SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	TES2SearchPage tes2 = new TES2SearchPage();
	
	 @Given("^that I have \"([^\"]*)\" number$")
	    public void that_i_have_something_number(String barcode) throws Throwable {
		 System.out.println("Entering barcode :"); 
		 BaseTest.launchUrl();
		 tes2.enterBarcode(barcode);
	    }

	    @When("^I check for the tes2 portal$")
	    public void i_check_for_the_tes2_portal() throws Throwable {
	    	System.out.println("Click on Find items ");
	    	tes2.clickOnFindItem();
	    }

	    @Then("^barcode details should be displayed$")
	    public void barcode_details_should_be_displayed() throws Throwable {
	    	System.out.println("Barcode details displaying");
	    }
		

}
