package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommondMethods;

public class RightClick extends CommondMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://www.saucedemo.com");
		WebElement rightClick = driver.findElement(By.cssSelector("input#user-name"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightClick).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
