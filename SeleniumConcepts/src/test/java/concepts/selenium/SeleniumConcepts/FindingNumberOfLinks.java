package concepts.selenium.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindingNumberOfLinks {
	@Test
	public void amazonProductSearch() throws InterruptedException
	{
		ChromeDriver chrome = new ChromeDriver(); // to open browser
		chrome.manage().window().maximize(); // to maximize window
	//	chrome.get("https://www.amazon.in"); // to launch url
		chrome.navigate().to("https://www.amazon.in"); 
		int links = chrome.findElements(By.tagName("a")).size();
		System.out.println(links);
	}
}
