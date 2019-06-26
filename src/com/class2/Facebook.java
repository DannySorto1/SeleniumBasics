package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommondMethods;

public class Facebook extends CommondMethods {

	public static void main(String[] args) throws InterruptedException {

		setUpDriver("chrome", "https://www.facebook.com/");
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("danny23so@aol.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("A$$hole23");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_2")).click();
	}

}
