package com.simplilearn.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FactoryTestCase {
	
	public String param="";
	
	public FactoryTestCase(String param) {
		this.param=param;
	}
	
	@BeforeClass
	public void Beforeclass() {
		System.out.println("Before Class");
	}
	
	@Test
	public void TestCase1() {
		System.out.println("The test data value from factory is: " +param);
	}

}
