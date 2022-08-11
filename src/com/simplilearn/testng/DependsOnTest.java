package com.simplilearn.testng;

import org.testng.annotations.Test;

public class DependsOnTest {
	
	@Test (groups = "SmokeTest")
	public void OpenBrowser() {
		System.out.println("Opening the browser");
	}
	
	@Test (dependsOnGroups = "SmokeTest")
	public void AddItemtoCart() {
		System.out.println("Add Item to cart");
	}
	
	@Test(dependsOnMethods = "OpenBrowser")
	public void PlaceOrder() {
		System.out.println("Place Order");
	}

}
