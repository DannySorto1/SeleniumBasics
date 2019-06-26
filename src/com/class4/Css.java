package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Css {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User1\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Sean");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Carter");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("7034328765");
		driver.findElement(By.cssSelector("input#username")).sendKeys("JiggaZ@gmail.com");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("3045 Java Ln ");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("New York");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("NY");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("22042");
		driver.manage().window().maximize();
		WebElement dropCon = driver.findElement(By.cssSelector("select[name='country']"));
		Select sS = new Select(dropCon);
		sS.selectByValue("57");
		driver.findElement(By.cssSelector("input#email")).sendKeys("itsHov");
		driver.findElement(By.cssSelector("input[name^='passw']")).sendKeys("HELLLLLO");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("HELLLLLO");
		driver.findElement(By.cssSelector("input[name='register']")).click();
	}

}
