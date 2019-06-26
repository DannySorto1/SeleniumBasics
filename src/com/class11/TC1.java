package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommondMethods;

public class TC1 extends CommondMethods {

	public static void main(String[] args) {
		setUpDriver("chrome", "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");

		String filepath = "C:/Users/User1/Desktop/000081410004.jpg";
		driver.findElement(By.id("gwt-debug-cwFileUpload")).sendKeys(filepath);
		driver.findElement(By.cssSelector("button.gwt-Button")).click();

		Alert getAlert = driver.switchTo().alert();
		System.out.println(getAlert.getText());
		getAlert.accept();

		TakesScreenshot camera = (TakesScreenshot) driver;
		File Sc = camera.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(Sc, new File("screenshots/Google/task1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("SC not Taken");
		}
		
		driver.close();

	}

}
