package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBXpathFunctions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("dannysorto1@gmail.com");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("A$$hole23");
		driver.findElement(By.xpath("//input[starts-with(@type,'submit')]")).click();
	}

}
