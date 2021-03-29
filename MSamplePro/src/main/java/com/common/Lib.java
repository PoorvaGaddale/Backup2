package com.common;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Lib implements IConstantValues {
	
	public static String getProperty(String CONFIG_PATH, String key) {
		String property="";
		Properties prop = new Properties();
		try {
			//read the file
			prop.load(new FileInputStream(CONFIG_PATH));
			//get property to extract value of url
			property = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return property;
	}
	
	public void sendKeys(WebElement element, String fieldValue) {
		
		if("input".equals(element.getTagName())) {
			element.sendKeys(fieldValue);
		
		}else
		{
			new Actions(BaseTest.getDriver()).moveToElement(element).build().perform();
			element.sendKeys(fieldValue);
		}
	}
	
	public void clickMethod(WebElement element) {
		element.click();
	}
	
	public void verifyElementText(WebElement element) {
		
	}
	
}
