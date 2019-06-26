package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbosouloteXPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@type='text']")).sendKeys("standard_user");
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@type='submit']")).click();

	}

}
