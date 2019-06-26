package com.class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import utils.CommondMethods;

public class ReadingPropertyFile {
	Properties prop;

	@Test
	public void readFile() {

		String filePath = "src/configs/credintials.properties";

		try {
			FileInputStream fis = new FileInputStream(filePath);

			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		CommondMethods.setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
	}
}
