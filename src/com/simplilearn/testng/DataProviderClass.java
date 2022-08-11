package com.simplilearn.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@DataProvider
	public static Object [] [] dataMethod(){
		return new Object [][] {
			{10},{20},{30}
		};
	}
	
	@DataProvider
	public static Object[][] dataMethod1(){
		return new Object[][] {
			{"Kaviya"}, {"Selva"}, {"Murugan"}
		};
	}
	
	@Test (dataProvider = "dataMethod")
	public void testcase(int value) {
		System.out.println(value);
	}
	
	@Test (dataProvider = "dataMethod1")
	public void testcase1(String value) {
		System.out.println(value);
	}
}
