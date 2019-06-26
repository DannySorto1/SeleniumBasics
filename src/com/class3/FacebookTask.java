package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User1\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.name("email")).sendKeys("dannysorto1@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("A$$hole23");
		driver.findElement(By.id("u_0_2")).click();

	}

}
