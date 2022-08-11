package com.simplilearn.testng;

import org.testng.annotations.Test;

public class OrderofExecution {
	
	@Test(priority = 0)
	public void OpenBrowser() {
		System.out.println("Open the Browser");
	}
	
	@Test
	public void addtoCart() {
		System.out.println("Search for the item and Add to cart");
	}
	
	@Test(priority = 2)
	public void Placeorder() {
		System.out.println("Place the order");
	}
	
	@Test
	public void UpdateAddress() {
		System.out.println("Update Address");
	}
	
	
	
//	@Test
//	public void a_OpenBrowser() {
//		System.out.println("Open the Browser");
//	}
//	
//	@Test
//	public void b_AddtoCart() {
//		System.out.println("Search for the item and Add to cart");
//	}
//	
//	@Test
//	public void c_Placeorder() {
//		System.out.println("Place the order");
//	}

}
