package com.intibrowser;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.dataread.ReadPropertiesFileDate;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser 
{
	// cross browser testing
	protected WebDriver driver;
//	@BeforeSuite
//	@Parameters()
	public WebDriver browserOpen(String browserName) throws IOException
	{
		
		if(browserName.equals("Chrome"))
		{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		}
		
		if(browserName.equals("Edge"))
		{
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		}
		if(browserName.equals("FF"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Long.parseLong(ReadPropertiesFileDate.propertiesDataBasedOnKey().getProperty("implicitWaitTime")), TimeUnit.SECONDS);
		driver.get(ReadPropertiesFileDate.propertiesDataBasedOnKey().getProperty("url"));
		
		return driver;
	}
}
