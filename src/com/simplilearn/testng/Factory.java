package com.simplilearn.testng;

public class Factory {
	
	@org.testng.annotations.Factory
	
	public Object[] factoryMethod() {
		return new Object[] {
				new FactoryTestCase("Kaviya"),
				new FactoryTestCase("Selva")
				
		};
	}

}
