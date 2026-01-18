package com.listner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.base.Base_Class;

public class ExtentReport_Test {
	
	public static ExtentTest extenttest;
	@BeforeSuite
	public void extentTestReportStartup() {
		Base_Class base = new Base_Class() {
			
		};
		base.extentReportStart(null);
	}
     @AfterSuite
	  public void extentReportEnd() {
		  Base_Class base = new Base_Class() {
			  
		  };
		  base.extentReportTearDown(null);
	  }
	
}
