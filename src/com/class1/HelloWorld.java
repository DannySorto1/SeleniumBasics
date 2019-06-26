package com.class1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Selenium\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://facebook.com");
//		driver.get("http://amazon.com");
		
		System.setProperty("webdriver.gecko.driver", "src\\drivers\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		
		
	}

}
