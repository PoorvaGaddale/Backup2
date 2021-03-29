package com.cucumber.stepdefinations;

import com.common.BaseTest;

import io.cucumber.java.After;

public class AfterAction {

	@After
	public static void tearDown() {
		
		//BaseTest.driver.close();
		
	}
}
