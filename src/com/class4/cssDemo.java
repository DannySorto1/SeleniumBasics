package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector(" input[data-test='username']")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.btn_action")).click();
		driver.close();
	}
}
