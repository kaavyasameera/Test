package com.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporting
{
	@Test
	public static ExtentTest reporting(String methodName, ExtentReports extent, String TCName, String TCdesc)
	{
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");  
		   LocalDateTime now = LocalDateTime.now(); 
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./ReportResults/"+methodName+".html");
		
		 extent.attachReporter(htmlReporter);
		 ExtentTest test = extent.createTest(TCName, TCdesc); 
		return test;
		
	}
}
