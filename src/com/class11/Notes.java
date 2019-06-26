package com.class11;

public class Notes {
//	Class 11
//
//	Waits in Selenium:
//	Implicit wait
//	Explicit wait 
//	Fluent wait
//
//	public static void waitForElementBeVisible (WebElement element, int time){
//		WebDriverWait wait=new WebDriverWait(driver, time);
//		wait.until(ExpectedConditions.visibilityOf(element));
//	}
//
//	public static void waitForElementBeVisible(By locator, int time){
//		WebDriverWait wait=new WebDriverWait(driver, time);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//	}
//
//	Upload and Download File
//
//	To upload file we can simply use .sendKeys and pass the pat of the File
//
//	Also to upload and download file in Selenium we have Robot Class or we can use 3 party tools such as AutoIT
//
//
//	int=130;
//	byte b=(byte)int
//
//	How do we take screenshots im Selenium:
//
//		Using TakesScreenShot Interface
//
//	3 step to take screen:
//
//	1) convert webdriver object to takesscreenshot type (downcast)
//
//	TakesScreenshot ts=(TakesScreenshot)driver;
//
//	2 ) call getScreenshotAs method
//
//	File pic=ts.getScreenshotAs(OutputType.FILE);
//
//	3 ) Copy file 
//
//	FileUtils.copyFile(src, dest)/dest=new File (path)
//
//	IQ: how would you click on a button without using click() or submit()
//		A: using JavaScriptExecutor
//
//		JavaScriptExecutor js=(JavaScriptExecutor)driver
//		js.executeScript();
//
//	IQ: How would you perform scroll up and scroll down on a page
//		A: using JavaScriptExecutor

}
