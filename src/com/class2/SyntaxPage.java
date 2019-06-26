package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxPage {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.syntaxtechs.com/");
		driver.navigate().to("https://google.com");
		driver.navigate().back();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());

		String title = driver.getTitle();
		if (title.contains("Syntax")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
