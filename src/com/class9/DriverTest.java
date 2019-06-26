package com.class9;

import utils.CommondMethods;

public class DriverTest extends CommondMethods {
	public static void main(String[] args) {
		setUpDriver("chrome", "https://www.google.com/");
		driver.close();
	}
}
