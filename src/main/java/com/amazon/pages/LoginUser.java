package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.dataread.ReadExcelData;
import com.utilities.ReusableFunctions;

public class LoginUser extends ReusableFunctions
{
	WebDriver driver;
	@FindBy(name="email") WebElement textEmail;
	@FindBy(id="continue") WebElement btnContinue;
	@FindBy(name="password") WebElement textPwd;
	@FindBy(id="signInSubmit") WebElement btnSubmit;
	ExtentTest report;
	public LoginUser(WebDriver d)
	{
		driver =d;
		PageFactory.initElements(d, this);
	}
	
	public void enterUserName(String userName)
	{
		textEmail.sendKeys(userName);
		//enterTextToTextBox(textEmail, "username", userName, report);
	}
	
	public void clickCntinue() throws InterruptedException
	{
		btnContinue.click();
		
		//driver.navigate().back();
		Thread.sleep(2000);
		//verifyDisplayofWbe(textPwd, "password", report);
	}
	
	public void enterPassword(String pw) throws InterruptedException
	{
		textPwd.sendKeys(pw);
		
		//enterTextToTextBox(textPwd, "password", pw, report);
	}
	
	public void clickSubmit() throws InterruptedException
	{
		btnSubmit.click();
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
}
