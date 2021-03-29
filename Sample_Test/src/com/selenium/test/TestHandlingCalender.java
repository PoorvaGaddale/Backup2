package com.selenium.test;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHandlingCalender {
	
	static int targetDate=0,
			targetMonth=0,
			targetYear=0;
	
	static int currentDate=0,
			currentMonth=0,
			currentYear=0;
	
	static int jumpMonthsBy=0;
	static boolean increment=true;
	
	//current date
	//target date
	//jump to the month
	//increment or decrement
			
			public static void main(String[] args) throws InterruptedException {
				
				String dateToSet="11/06/2021";
				
				//get current date
				getCurrentDateMonthYear();
				System.out.println(currentDate+" "+currentMonth+" "+currentYear);
				
				//get target month
				getTargetDateMonthYear(dateToSet);
				System.out.println(targetDate+" "+targetMonth+" "+targetYear);
				
				//get jump month
				calculateHowManyMonthsToJump();
				System.out.println(jumpMonthsBy);
				System.out.println(increment);
				
				System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.cleartrip.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
				for (int i = 0; i < jumpMonthsBy; i++) {
					if(increment){
						System.out.println("Click on next ");
						driver.findElement(By.xpath("(//div[@id='ui-datepicker-div']/div/div/a)[2]")).click();
					}else{
						driver.findElement(By.xpath("(//div[@id='ui-datepicker-div']/div/div/a)[1]")).click();
					}
					Thread.sleep(1000);
				}
				
				driver.findElement(By.linkText(Integer.toString(targetDate))).click();
				
				//driver.close();
			
			}
			public static void getCurrentDateMonthYear(){
				Calendar cal=Calendar.getInstance();
				currentDate = cal.get(Calendar.DAY_OF_MONTH);
				currentMonth = cal.get(Calendar.MONTH)+1;
				currentYear = cal.get(Calendar.YEAR);
			}
			
			public static void getTargetDateMonthYear(String dateString){
				int firstIndex=dateString.indexOf("/");
				int lastIndex=dateString.lastIndexOf("/");
				String day = dateString.substring(0, firstIndex);
				targetDate=Integer.parseInt(day);
				String month = dateString.substring(firstIndex+1, lastIndex);
				targetMonth = Integer.parseInt(month);
				String year = dateString.substring(lastIndex+1, dateString.length());
				targetYear=Integer.parseInt(year);
				
			}
			
			public static void calculateHowManyMonthsToJump(){
				if((targetMonth-currentMonth)>0){
					jumpMonthsBy=targetMonth-currentMonth;
				}else {
					jumpMonthsBy=currentMonth-targetMonth;
					increment=false;
				}
			}
	
	

}
