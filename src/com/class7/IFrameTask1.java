package com.class7;

import org.openqa.selenium.By;

import utils.CommondMethods;

public class IFrameTask1 extends CommondMethods {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*
		 * Open chrome browser Go to “https://www.toolsqa.com/iframe-practice-page/”
		 * Click on “ Guest Blogs” link inside first frame Verify element “Interactions”
		 * is present in second frame Navigate to Home Page Quit browser
		 * 
		 */
		CommondMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//a[text()='Git Log']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		boolean inter = driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
		if (inter == true) {
			driver.switchTo().defaultContent();
			driver.close();
		}
	}
}
