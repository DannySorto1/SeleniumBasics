package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utils.CommondMethods;

public class DoubleClick extends CommondMethods {

	public static void main(String[] args) throws InterruptedException {

		setUpDriver("chrome", "https://www.saucedemo.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("SUUUUHHHDUE");
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.cssSelector("input#password"))).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
