package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements IConstantValues {
	
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void launchUrl() {
		String url=Utilities.getProperty(CONFIG_PATH, "url");
		driver.get(url);
	}	
	
	public static void tearDown() {
		driver.close();
	}
}
