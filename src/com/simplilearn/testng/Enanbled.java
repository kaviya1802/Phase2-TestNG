package com.simplilearn.testng;

import org.testng.annotations.Test;

public class Enanbled {
	
	@Test(enabled = true, description = "the test case is being executed")
	public void TestCase1() {
		System.out.println("Executing test case1");
	}

	@Test(enabled = false)
	public void TestCase2() {
		System.out.println("Executing Test case2");
	}
}
