package com.class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommondMethods;

//TC 1: OrangeHRM Login
//
//Navigate to “https://opensource-demo.orangehrmlive.com/”
//Login to the application
//Verify user is successfully logged in
//
//Note: must use properties file

public class Task1 extends CommondMethods {

	Properties prop;

	@BeforeMethod
	public void setUp() {
		String filePath = "src/configs/credintials.properties";

		try {
			FileInputStream fis = new FileInputStream(filePath);

			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(prop.get("browser"));
		System.out.println(prop.get("url"));

		CommondMethods.setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
	}

	@Test
	public void ulogin() {
		sendText(driver.findElement(By.cssSelector("input#txtUsername")), "Admin");
		sendText(driver.findElement(By.cssSelector("input#txtPassword")), "admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		
	}
}
