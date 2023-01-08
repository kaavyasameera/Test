package concepts.selenium.SeleniumConcepts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpiceJetFlightDepartureDateSelection {
	@Test
	public void amazonProductSearch() throws InterruptedException, IOException
	{
		ChromeDriver chrome = new ChromeDriver(); // to open browser
		chrome.manage().window().maximize(); // to maximize window
	//	chrome.get("https://www.amazon.in"); // to launch url
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.navigate().to("https://www.spicejet.com/"); 
		String month = "December";
		String year = "2022";
		String date = "27";
		chrome.findElement(By.xpath("//div[text()='Departure Date']")).click();
		Thread.sleep(2000);
		chrome.findElement(By.xpath("//div[contains(@data-testid,'month-"+month+"-"+year+"')]//div[@data-testid='undefined-calendar-day-"+date+"']/div")).click();
	}
}
