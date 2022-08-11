package com.simplilearn.testng;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Executable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {
	
	@Test
	public void testCase() {
		
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actual = driver.getTitle();
		
//		Assert.assertEquals(expected, actual);
		
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(expected, actual);
		
		s1.assertAll(); //to checks all assert and mark test case as PASS , if one assertion is a failure, mark as FAIL
		
//		System.out.println("After Failure");
		
		driver.close();
	}

}
