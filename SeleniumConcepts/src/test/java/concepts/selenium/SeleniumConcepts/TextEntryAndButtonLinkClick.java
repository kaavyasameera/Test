package concepts.selenium.SeleniumConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextEntryAndButtonLinkClick 
{
	@Test
	public void amazonProductSearch() throws InterruptedException, IOException
	{
		ChromeDriver chrome = new ChromeDriver(); // to open browser
		chrome.manage().window().maximize(); // to maximize window
		chrome.navigate().to("https://www.amazon.in"); 
		WebElement searchBox = chrome.findElement(By.id("twotabsearchtextbox"));
		String product = "iphone 14 plus";
		searchBox.sendKeys(product);
		chrome.findElement(By.id("nav-search-submit-button")).click();
		TakesScreenshot src = (TakesScreenshot)chrome;
		File destinationPath = new File("./Screenshots/"+product+".jpeg");
		File virtualScreenshot = src.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(virtualScreenshot, destinationPath);
		String resultsPageVerificationText = chrome.findElement(By.xpath("//span[text()='RESULTS']")).getText();
		if(resultsPageVerificationText.equalsIgnoreCase("Results"))
			System.out.println("Successfullt navigated to Results Page");
		else
			System.out.println("Results navigation failed");
		Thread.sleep(3000); // static wait - it will wait for entire 3 seconds.
		chrome.quit(); 
	}
}
