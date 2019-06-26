package com.class7;

import utils.CommondMethods;

public class Test extends CommondMethods {

	public static void main(String[] args) {
		CommondMethods.setUpDriver("firefox", "http://google.com");
		driver.close();
		
	}

}
