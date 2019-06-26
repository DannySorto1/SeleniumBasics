package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Click on Register Link
//Fill out all required info
//Click Submit
//User successfully registered
//(Create 2 scripts using different locators)
public class MercuryTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Donald");
		driver.findElement(By.name("lastName")).sendKeys("Glover");
		driver.findElement(By.name("phone")).sendKeys("911-911-9911");
		driver.findElement(By.id("userName")).sendKeys("DLOVER11");
		driver.findElement(By.name("address1")).sendKeys("1223 Yerp Ln");
		driver.findElement(By.name("city")).sendKeys("Falls Church");
		driver.findElement(By.name("state")).sendKeys("VA");
		driver.findElement(By.name("postalCode")).sendKeys("22042");
		driver.manage().window().maximize();
		WebElement dropCon = driver.findElement(By.name("country"));
		Select sS = new Select(dropCon);
		sS.selectByValue("57");
		driver.findElement(By.id("email")).sendKeys("DLOVER11");
		driver.findElement(By.name("password")).sendKeys("Gucci");
		driver.findElement(By.name("confirmPassword")).sendKeys("Gucci");
		driver.findElement(By.name("register")).click();
	}

}
