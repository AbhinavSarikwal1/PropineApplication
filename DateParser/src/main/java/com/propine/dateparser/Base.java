package com.propine.dateparser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import utilities.ExtentManager;
	
public class Base {

	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;	
	public static WebDriver driver;

	public static void waitForResult() throws InterruptedException {	
		WebDriverWait wait = new WebDriverWait(driver,30);	
		wait.until(ExpectedConditions.urlContains("/submit"));
		Thread.sleep(1000);
	}

}
