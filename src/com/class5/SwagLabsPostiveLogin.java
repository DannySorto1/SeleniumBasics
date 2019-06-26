package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsPostiveLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.cssSelector(" input[data-test='username']")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.btn_action")).click();
		boolean isDisplayed = driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed();
		if (isDisplayed) {
			System.out.println("Products text is displayed");
		} else {
			System.out.println("Products text is NOT displayed");
		}
		boolean RoboIsDisplayed = driver.findElement(By.cssSelector("div.peek")).isDisplayed();

		if (RoboIsDisplayed) {
			System.out.println("Robo Img is displayed");
		} else {
			System.out.println("Robo Img is NOT displayed");
		}
	}

}
