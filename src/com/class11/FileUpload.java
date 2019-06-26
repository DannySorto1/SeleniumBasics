package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;

import utils.CommondMethods;

public class FileUpload extends CommondMethods {

	public static void main(String[] args) {
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("File Upload")).click();

		String filePath ="C:/Users/User1/Desktop/000081410004.jpg";

		driver.findElement(By.id("file-upload")).sendKeys(filePath);
		driver.findElement(By.id("file-submit")).click();
		
		takeScreenshot("fileUploadTask", "Task1");
		
		driver.close();

	}

}
