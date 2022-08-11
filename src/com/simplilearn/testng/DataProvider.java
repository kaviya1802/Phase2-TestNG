package com.simplilearn.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider {
	
	@Test
//	@Parameters("Password")
    
    public void LoginTest()
    {
        //Step 1: Set the property for the browser exe location
        System.out.println("LoginTest");
        System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
        
        //Step 2: Create object for the webdriver with reference to chromedrivfer
        
        WebDriver driver = new ChromeDriver();
        
        //Always maximize your browser and execute
        
        driver.manage().window().maximize();
        
        driver.get("https://the-internet.herokuapp.com/login");
        
        WebElement userid = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement button = driver.findElement(By.xpath("//button[@class='radius']"));
        
        userid.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        button.click();
        
        //Always close the browser once the test is executed
        
        driver.close();
        
        //System.out.println("First TestNG Program");
        
        
        
    }



}
