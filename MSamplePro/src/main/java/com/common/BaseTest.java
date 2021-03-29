package com.common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest implements IConstantValues{
	
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	public static WebDriver driver;
	
	
	public static WebDriver getDriver(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void launchUrl() throws AWTException {
		String url=Lib.getProperty(CONFIG_PATH, "url");
		driver.get(url);
		
		Robot r = new Robot();
		StringSelection selection =new StringSelection("RMGN\\poorva.gaddale");
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection); 
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		StringSelection selection1 =new StringSelection("Green1monday2");
		Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard1.setContents(selection1, selection1); 
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void takeScreenshot(String testName) {
		Date d=new Date();
		String currentDate=d.toString().replaceAll(":", "_");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		File destFile=new File(".\\screenshots"+currentDate+"\\"+testName+"_screenshot.png");
		
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
