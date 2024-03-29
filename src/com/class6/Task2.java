package com.class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.linkText("Select")).click();

		// working with single DD

		WebElement countriesDD = driver.findElement(By.id("countriesSingle"));
		Select select = new Select(countriesDD);
//		int ddSize = select.getOptions().size();
//		System.out.println(ddSize);
		select.selectByVisibleText("United states of America");

		// working with Multiple DD
		WebElement multDD = driver.findElement(By.cssSelector("select#countriesMultiple"));
		select = new Select(multDD);
		List<WebElement> optionList = select.getOptions();
		int ddSize = optionList.size();
		System.out.println("# of options in multiple countries dd=" + ddSize);
		// check if we can select multiple options
		if (select.isMultiple()) {
			for (int i = 0; i < ddSize; i++) {
				select.selectByIndex(i);
				Thread.sleep(1000);
			}
			// another way
			for (WebElement option : optionList) {
				option.click();
				Thread.sleep(1000);
			}
		}
	}
}
