package com.steps;

import com.common.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {
	@Before
	public void setUp(){
		getDriver();
	}
	
	@After
	
	public void afterTest() {
		tearDown();
	}
}
