package com.simplilearn.testng;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test (groups = {"SmokeTest", "Regression"})
	public void OpenBrowser() {
		System.out.println("Opening browser");
	}
	
	@Test (groups = {"SmokeTest", "Regression"})
	public void LoginTest() {
		System.out.println("Login Test");
	}
	
	@Test (groups = {"SmokeTest", "Regression"})
	public void AdditemToCart() {
		System.out.println("AdditemToCart");
	}
	
	@Test (groups = "Regression")
	public void AddMobileToCart() {
		System.out.println("AddMobileToCart");
	}
	
	@Test (groups = "Regression")
	public void AddLaptoptoCart() {
		System.out.println("AddLaptoptoCart");
	}
	
	@Test (groups = {"SmokeTest", "Regression"})
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}

}
