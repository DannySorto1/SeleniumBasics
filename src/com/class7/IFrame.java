package com.class7;

import org.openqa.selenium.By;

import utils.CommondMethods;

public class IFrame extends CommondMethods {

	public static void main(String[] args) {
		CommondMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		// Way 1
//		driver.switchTo().frame("iframe_a");
//		driver.findElement(By.cssSelector("input#name")).sendKeys("Daniel");

//		WebElement ele = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));

		// Way 2
//		WebElement ele = driver.findElement(By.cssSelector("iframe[name='iframe_a']"));
//
//		driver.switchTo().frame(ele);
//		driver.findElement(By.cssSelector("input#name")).sendKeys("hhhhhhh");

		// Way 3
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='iframe_a']")));

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tom");

		driver.switchTo().defaultContent();

		boolean Switch = driver.findElement(By.xpath("//h2[text()='SwitchTo']")).isDisplayed();
		if (Switch == true) {
			driver.close();
		}

	}

}
