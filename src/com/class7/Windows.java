package com.class7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommondMethods;

public class Windows extends CommondMethods {

	public static void main(String[] args) {
		CommondMethods.setUpDriver("Chrome", "http://uitestpractice.com/Students/Switchto");
		String parent = driver.getTitle();
		String parentId = driver.getWindowHandle();

		driver.findElement(By.linkText("Opens in a new window")).click();

		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		child = driver.getTitle();
		String childId = driver.getWindowHandle();
		System.out.println("title: " + child + " " + " ID: " + childId);
		driver.switchTo().window(parent);

	}

}
