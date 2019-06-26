package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommondMethods;

public class DropBox extends CommondMethods {

	public static void main(String[] args) {
		setUpDriver("chrome", "https://demoqa.com/");

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.findElement(By.linkText("Controlgroup")).click();

	}

}
