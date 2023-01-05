package com.utilities;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

public class ReusableFunctions 
{
	public void enterTextToTextBox(WebElement wbe, String typeOfWbe, String actualText, ExtentTest report)
	{
		wbe.sendKeys(actualText);
		if(wbe.getAttribute("value").equals(actualText))
		report.pass(typeOfWbe+" entered success");
		else
			report.fail(typeOfWbe+" not entered");
	}
	
	public void verifyDisplayofWbe(WebElement wbe, String typeOfWbe,ExtentTest report)
	{
		try {
			if(wbe.isDisplayed())
			report.pass(typeOfWbe+" displayed success");
			else
				report.fail(typeOfWbe+" display failed");
		} catch (Exception e) {
		
			report.fail(typeOfWbe+" display failed");
		}
	}

}
