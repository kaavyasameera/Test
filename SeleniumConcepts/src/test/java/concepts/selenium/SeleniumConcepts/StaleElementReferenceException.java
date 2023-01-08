package concepts.selenium.SeleniumConcepts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaleElementReferenceException 
{
	@Test
	public void amazonProductSearch() throws InterruptedException, IOException
	{
		ChromeDriver chrome = new ChromeDriver(); // to open browser
		chrome.manage().window().maximize(); // to maximize window
		chrome.navigate().to("https://www.amazon.in"); 
		WebElement cs = chrome.findElement(By.xpath("//*[text()='Customer Service']"));
		System.out.println(cs.isDisplayed()); // true
		WebElement searchBox = chrome.findElement(By.id("twotabsearchtextbox"));
		String product = "iphone 15 plus";
		searchBox.sendKeys(product);
		chrome.findElement(By.id("nav-search-submit-button")).click();
		WebElement afterRefreshCS = chrome.findElement(By.xpath("//*[text()='Customer Service']"));
		System.out.println(afterRefreshCS.isDisplayed()); // true
	}

}
