package com.propine.dateparser;


import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;





/**
 * Unit test for Date Parser
 */
public class DateParserTest{
	
	DateParser dp = new DateParser();
	WebDriver driver;
	
	@BeforeMethod
	public void launch() throws IOException,InterruptedException{	
		driver=dp.browserMethod();
	}
	
	
		
	/*@Test(priority=1)
	public void testDateParserLaunch(String inputdata) throws Exception{
		
		dp.dateInput(inputdata);
		dp.submitButton();
		Assert.assertTrue(dp.launchVerify());
	
	}*/
	
	
	
	@Test(dataProvider ="testdata")
	public void dateParser( String tc , String inputdata, String expectedresponse) throws Exception{
		if(tc.equals("TC_001")){
			Assert.assertTrue(dp.launchVerify(inputdata));
		}
		else if(tc.equals("TC_002")) {
			Assert.assertTrue(dp.resultFieldVerify(inputdata));		
		}
		else if(tc.equals("TC_003")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_004")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_005")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_006")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_007")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_008")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_009")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_010")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_011")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_012")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_013")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_014")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_015")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_016")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_017")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_018")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_019")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_020")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_021")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_022")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_023")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_024")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_025")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_026")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_027")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_028")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_029")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_030")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_031")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_032")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_033")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_034")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_035")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_036")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_037")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_038")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_039")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_040")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_041")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_042")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_043")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_044")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		else if(tc.equals("TC_045")) {
			dp.dateInputFormat(inputdata);
			dp.submitButton();
		    Assert.assertTrue(dp.dateExpectedFormat(expectedresponse));			
		}
		
	}
	
	
	@DataProvider(name="testdata")
	public static Object [] [] readExcel() throws IOException, BiffException {
		File f = new File(".\\TestData\\TestData.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		int rows = s.getRows()-1;
		int columns = s.getColumns();
		String[][] inputData = new String [rows] [columns];
		for (int i=1; i<=rows; i++){
		for (int j=0; j<columns; j++){
		jxl.Cell c = s.getCell(j, i);
		inputData [i-1][j] = c.getContents();
		}
		}
		return inputData;
		
		}
		
	@AfterMethod
	public void logoutTest(){
		driver.close();
		
	}
}