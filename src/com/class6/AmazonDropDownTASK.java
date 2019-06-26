package com.class6;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDownTASK {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement DropB = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select Ss = new Select(DropB);
		
		List<WebElement> allOptions = Ss.getOptions();
		System.out.println(allOptions.size());
//		Iterator<WebElement> DepText=allOptions.iterator();
//		while(DepText.hasNext()) {
//			String Departments =DepText.next().getText();
//			System.out.println(Departments);
//		}
		for(WebElement ele:allOptions) {
			System.out.println(ele.getText());
		}
		
		Ss.selectByValue("search-alias=computers");
		Thread.sleep(3000);
		driver.quit();
	
		

	}

}
