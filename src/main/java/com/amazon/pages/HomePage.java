package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.utilities.ReusableFunctions;

public class HomePage extends ReusableFunctions
{

	@FindBy(id="twotabsearchtextbox") WebElement txtSearchBox;
	@FindBy(id="nav-search-submit-button") WebElement btnSearch;
	ExtentTest report;
	public HomePage(WebDriver d, ExtentTest report)
	{
		this.report = report;
		PageFactory.initElements(d, this);
	}
	
	public void verifySearchBoxDisplayInHomePage()
	{
		verifyDisplayofWbe(txtSearchBox, "Search box", report);
	}
}
