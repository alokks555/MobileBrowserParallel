package com.mobileauto.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenerateReport {

	public static ExtentReports extent;
	ExtentHtmlReporter htmlReporter;

	public ExtentReports extentReporting()
	{
	
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/MobileDemo.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		System.out.println("Setting Reports!!");
		
		return extent;
	}


}
