package com.cucumber.stepdefinations;

import com.common.BaseTest;

import io.cucumber.java.Before;

public class BeforeActions {
	
	@Before
	public static void setUp() {
		
		BaseTest.getDriver();
		
	}

}
