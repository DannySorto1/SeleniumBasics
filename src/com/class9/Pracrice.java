package com.class9;

import org.openqa.selenium.By;

import utils.CommondMethods;

public class Pracrice extends CommondMethods {

	public static void main(String[] args) {

		setUpDriver("chrome", "http://uitestpractice.com/Students/Select#");
		driver.findElement(By.xpath("//div[@class='dropdown btn-group']")).click();
	
	}
}
