package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommondMethods;

public class RcTask extends CommondMethods {
	public static void main(String[] args) throws InterruptedException {

		setUpDriver("chrome", "https://www.saucedemo.com");
		WebElement Rc = driver.findElement(By.cssSelector("input#password"));
		Actions action = new Actions(driver);
		action.contextClick(Rc).click().perform();
		Thread.sleep(3000);
		driver.close();

	}
}
