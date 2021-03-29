package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue="com.steps",
		tags = "@SearchAndToCart",
		plugin= {"pretty","html:target/RunCuke/cucumber.html"},
		monochrome=true
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	
	
}
