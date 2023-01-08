package concepts.selenium.SeleniumConcepts;

import java.awt.AWTException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertsExample {

	@Test
	public void amazonProductSearch() throws InterruptedException, AWTException
	{
	WebDriver driver = new EdgeDriver(); // to open browser
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Dynamic wait
	
//	 ((JavascriptExecutor)driver).executeScript("alert('Welcome to Selenium class');"); 
//	 System.out.println("Alert text is: "+driver.switchTo().alert().getText());
	 driver.switchTo().alert().accept();
	 
	//driver.switchTo().frame("Revamp_Banner_ID");
	 WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(20));
	 explicit.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("twotabsearchtextbox"))));
	 System.out.println("visible");
	 FluentWait fluent = new FluentWait(driver);
	 fluent.withTimeout(Duration.ofSeconds(150)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
	}
}
