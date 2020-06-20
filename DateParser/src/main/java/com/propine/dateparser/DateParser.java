package com.propine.dateparser;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.read.biff.BiffException;

public class DateParser extends Base {
	/*
	 * Following is the Propine Date Parser Application Launch URL
	 */

	String baseurl = "https://vast-dawn-73245.herokuapp.com/";

	/*
	 * Following are elements under Date Parser Web Page
	 */

	By datetxt = By.xpath("//input[@name='date']");

	By submitbtn = By.xpath("//input[@class='btn btn-default']");

	By output = By.cssSelector("div.row div:nth-of-type(2) div");

	/*
	 * Following method is to launch the browser
	 */

	public WebDriver browserMethod() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/java/browserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		return driver;
	}
	
	/*
	 * Following Code is to check Application Launch Successfully or not
	 */

	public boolean launchVerify(String expURL) throws InterruptedException {
		String currenturl = driver.getCurrentUrl();
		String Title=driver.getTitle();
		if (currenturl.equals(expURL) && Title.equals("Propine Date Parser")){
			System.out.println("Test Case PASSED:" + " "+ "Application Launched Successfully");
			return true;
		} else {
			System.out.println("Test Case FAILED:" + " "+ "Application not Lauched Successfully");
			return false;
		}
	}
	
	/*
	 * Following Code is to check result field value when application launch First Time
	 */

	public boolean resultFieldVerify(String input) throws InterruptedException {
		String resultfieldvalue = result();
		String resultfieldexpected = input;
		if (resultfieldvalue.equals(resultfieldexpected)) {
			System.out.println("Test Case PASSED:" + " "+ "Got the Correct Default Result Field Value : " + resultfieldvalue );
			return true;
		} else {
			System.out.println("Test Case FAILED:" + " "+ "Got the InCorrect Default Result Field Value : " + resultfieldvalue );
			return false;
		}
	}
	

	/*
	 * Following method is to input the Date
	 */

	public void dateInputFormat(String inputs) throws InterruptedException, IOException, ParseException, BiffException {

		driver.findElement(datetxt).sendKeys(inputs);		
	}

	/*
	 * Following method is to submit the Entered Date
	 */

	public void submitButton() throws InterruptedException {
		driver.findElement(submitbtn).click();
		waitForResult();
	}

	public String result() throws InterruptedException {
		String resulttext = driver.findElement(output).getText();
		return resulttext;
	}

	public boolean dateExpectedFormat(String expectedresponse)
			throws InterruptedException, IOException, ParseException {
		String Currentresponse = result();
		String xlsexpected = expectedresponse;
		if (Currentresponse.equals(xlsexpected)) {
			
			System.out.println("Test Case PASSED:" + " "+ "{Expected Date:" + xlsexpected + "," + "Actual date:" + Currentresponse + "}" );
			return true;
		} else {
			System.out.println("Test Case FAILED:" + " "+ "{Expected Date:" + xlsexpected + "," + "Actual date:" + Currentresponse + "}" );
			return false;
		}
	}
}
