package concepts.selenium.SeleniumConcepts;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;

public class MouseHover 
{
	@Test
	public void amazonProductSearch() throws InterruptedException
	{
		WebDriver chrome = new ChromeDriver(); // to open browser
		chrome.get("https://www.languageline.com/");
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Dynamic wait
		WebElement clientRosources = chrome.findElement(By.xpath("//a[text()='Client Resources']"));
		Actions action = new Actions(chrome);
		action.moveToElement(clientRosources).build().perform();
		String expectedDropDownItem = "Voice of the Customer";
		chrome.findElement(By.xpath("//a[text()='"+expectedDropDownItem+"']")).click();
		String header = chrome.findElement(By.tagName("h1")).getText();
		if(header.equals("Voice of the Customer"))
			System.out.println("Page correctly redirected "+expectedDropDownItem);
		else
		{
			System.out.println("Page failed to redirect to "+expectedDropDownItem);
			assertTrue(false);
		}
		   JavascriptExecutor js = (JavascriptExecutor) chrome;

	      
	        // This  will scroll down the page by  1000 pixel vertical		
	        js.executeScript("window.scrollBy(0,700)");
	        chrome.switchTo().frame("voc-submission");
	        chrome.findElement(By.xpath("//input[contains(@id,'firstname')]")).sendKeys("Jean ");
	        Select dropDownValueSelect;
	        dropDownValueSelect = new Select(chrome.findElement(By.id("pg:frm:voc_product")));
	        dropDownValueSelect.selectByVisibleText("LanguageLine Testing");
	        Thread.sleep(1000);
	        dropDownValueSelect = new Select(chrome.findElement(By.id("pg:frm:category")));
	        dropDownValueSelect.selectByIndex(3);
	  //      js. executeScript("arguments[0]. value='Kevin';", chrome.findElement(By.xpath("//input[contains(@id,'firstname')]")));
	        
		//chrome.quit(); 
	}
}
