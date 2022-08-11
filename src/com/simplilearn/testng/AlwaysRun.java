package com.simplilearn.testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
	
	@Test
	public void method1() {
		System.out.println("Method1");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "method1", alwaysRun = true)
	public void method2() {
		System.out.println("Method2");
		
	}

}
