package com.cucumber.testrunner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue="com.cucumber.stepdefinations",
		tags = "@SearchBarcodePostive",
		plugin= {"pretty","html:target/RunCuke/cucumber.html", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome=true
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	@BeforeClass
	public static void setUp() {
		SimpleDateFormat sdf = new SimpleDateFormat("ddmmyy_hhmmss");
		Date currentDate = new Date();
		String strDate = sdf.format(currentDate);
		String fileName = System.getProperty("user.dir")+"\\target\\Extent_Reports\\"+strDate+".html";
		File newFile = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile, false);
		//Loads the extent config xml to customize on the report
		ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));
		
		
		//User can add the system information as follows
		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Selenium version", "v3.1.14");;
		
		
	}
	
	@AfterClass
	public static void writeExtentReport() {
		//Reporter.loadXMLConfig("configs/extent-config.xml");
	}

}
