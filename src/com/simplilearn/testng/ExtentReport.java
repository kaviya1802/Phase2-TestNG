package com.simplilearn.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	
	public static ExtentTest test;
	public static ExtentReports report;
	
	WebDriver driver;
	String siteUrl = "https://www.amazon.in/";
	
	@Test
	public void TestCase() throws InterruptedException {
		
		//Providing the location for the html file/report to be generated
		
		report = new ExtentReports("./Report/report.html");
		
		//Providing the name for our test case
		
		test = report.startTest("Amazon Search for Product");
		
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(siteUrl);
		test.log(LogStatus.PASS, "The Browser has been opened");
		test.log(LogStatus.INFO, "Chrome browser is opened");
		
		driver.manage().window().maximize();
		test.log(LogStatus.PASS, "The Browser has been Maximized"); 
		
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("Page title")) {
			test.log(LogStatus.PASS, "The Page title is correct");
			test.log(LogStatus.INFO, title);
		}
		else {
			test.log(LogStatus.FAIL, "The page title is incorrect");
			test.log(LogStatus.INFO, title);
		}
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shirts");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.close();
		
		report.endTest(test);
		report.flush();
		
	}

}
