package concepts.selenium.SeleniumConcepts;

import static org.junit.Assert.assertFalse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	@Test
	public void amazonProductSearch() throws InterruptedException, AWTException
	{
		WebDriver driver = new ChromeDriver(); // to open browser
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&CTA_FLAG=IWISH");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Dynamic wait
		driver.findElement(By.xpath("(//label)[4]")).click();
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,700)");
		Robot r = new Robot();
		for(int i=1; i<10; i++)
		{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		}
		driver.switchTo().frame("Revamp_Banner_ID");
		driver.findElement(By.xpath("//a[text()='Report a suspicious mail']")).click();
		String parentSessionId = driver.getWindowHandle();
		Set<String> allWindowsId = driver.getWindowHandles();
		for(String eachWindow: allWindowsId)
		{
			if(!eachWindow.equals(parentSessionId))
		    driver.switchTo().window(eachWindow);
		}
		String expectedEmailContent=null;
		try 
		{
			expectedEmailContent = driver.findElement(By.xpath("(//h1/parent::div/p)[2]")).getText();
		}
		catch (NoSuchElementException e) 
		{
			System.out.println("Email redirection failed");
			assertFalse(true);
		}
		if(expectedEmailContent.equals("Bank employees never ask for your Password/ PIN/ OTP/ CVV/ Card Number."))
			System.out.println("Email redirection successful and text found");
		else
			System.out.println("Email redirection successful but text mis-match");
	}
}
