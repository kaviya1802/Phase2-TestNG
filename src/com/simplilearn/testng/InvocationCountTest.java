package com.simplilearn.testng;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount = 10)
	public void invoctaionTest() {
		System.out.println("Invocation Test");
	}

}
