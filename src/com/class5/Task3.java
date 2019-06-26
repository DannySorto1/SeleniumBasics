package com.class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/automation-practice-form/");
		List<WebElement> listExp = driver.findElements(By.name("exp"));

		for (WebElement check : listExp) {

			if (check.isEnabled()) {
				check.click();
			}

		}

		List<WebElement> all = driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement check : all) {
			Thread.sleep(300);
			if (check.isEnabled()) {
				check.click();
			}
		}
	}
}
