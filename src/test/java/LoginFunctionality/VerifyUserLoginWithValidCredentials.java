package LoginFunctionality;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.pages.HomePage;
import com.amazon.pages.LoginUser;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.dataread.ExcelReadData;
import com.intibrowser.OpenBrowser;
import com.utilities.ExtentReporting;

public class VerifyUserLoginWithValidCredentials extends OpenBrowser
{
	
	@Test
	public void loginWithValidCredentials() throws IOException, InterruptedException
	{
		
		browserOpen("Edge");
		LoginUser login = new LoginUser(driver);
		List<HashMap<String, String>> credentials = ExcelReadData.readData();
		for(int i=0; i<credentials.size(); i++)
		{
		login.enterUserName(credentials.get(i).get("UserName"));
		login.clickCntinue();
		login.enterPassword(credentials.get(i).get("Password"));
		login.clickSubmit();
		
		}
	}
	

	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	

}
