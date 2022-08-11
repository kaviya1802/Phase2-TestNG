package com.simplilearn.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracTestNG {
  @Test
  public void testNG() throws InterruptedException {
	  
	  WebDriver driver;
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selvaprakash\\eclipse-workspace\\Phase2-TestNG\\BrowserUtils\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.swiggy.com/");
	  
	  driver.manage().window().maximize();
	  
	  Thread.sleep(2000);
	  
	  driver.close();
	  
  }
}
