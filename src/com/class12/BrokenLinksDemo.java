package com.class12;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.net.ssl.HttpsURLConnection;

import okhttp3.internal.http2.Http2Connection;
import utils.CommondMethods;

public class BrokenLinksDemo extends CommondMethods {

	@BeforeMethod
	public void setUp() {
		setUpDriver("chrome", "http://google.com");
	}

	@Test
	public void brokenLinksVerification() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links=" + links.size());

		for (WebElement link : links) {
			String linkURL = link.getAttribute("href");

			try {
				URL url = new URL(linkURL);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				int code = conn.getResponseCode();
				if (code == 200) {
					System.out.println("Link is valid " + link.getText());
				} else {
					System.out.println("Link is NOT valid " + link.getText());
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
