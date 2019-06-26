package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabFailedLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("erformance_glitch_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("ecret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.className("btn_action")).click();
		WebElement text = driver
				.findElement(By.xpath("//h3[text()='Username and password do not match any user in this service']"));
		String veriText = text.getText();
		String test = "Username and password do not match any user in this service";
		if (test.contains(veriText)) {
			System.out.println("KeyWord " + test + " presents on screen");
		} else {
			System.out.println("text on display is not matching : " + test);
		}
	}

}
