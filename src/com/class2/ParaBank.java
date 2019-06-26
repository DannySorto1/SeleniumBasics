package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommondMethods;

public class ParaBank extends CommondMethods {

	public static void main(String[] args) throws InterruptedException {

		setUpDriver("chrome",
				"\"https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("Daniel");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.lastName")).sendKeys("Toretto");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.street")).sendKeys("1234 New York Ln");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.city")).sendKeys("New York");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("7035348567");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.ssn")).sendKeys("233-45-2345");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.username")).sendKeys("dannysorto1");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.password")).sendKeys("HelloYou");
		Thread.sleep(2000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("HelloYou");
		Thread.sleep(2000);
		driver.findElement(By.className("button")).click();
	}

}
