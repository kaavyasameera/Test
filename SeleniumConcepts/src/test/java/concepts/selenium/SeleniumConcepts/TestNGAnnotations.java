package concepts.selenium.SeleniumConcepts;


import static org.junit.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	@Test(priority=1, enabled=false, groups="Sanity")
	public void verifyHomePage()
	{System.out.println("Test 1");}
	
	@BeforeSuite
	public void bs()
	{System.out.println("Before suite");}
	
	@AfterSuite
	public void as()
	{System.out.println("After suite");}
	
	@Test(groups="Adhoc")
	public void loginCheck()
	{System.out.println("Test 2");}
	
	@Test(priority=252,  groups= {"Sanity", "Regression"})
	public void closeBrowser()
	{System.out.println("Test 3");}
	
	@BeforeTest
	public void bt()
	{System.out.println("Before Test");}
	
	@AfterTest
	public void at()
	{System.out.println("After Test");}
	
	@AfterClass
	public void ac()
	{System.out.println("AFter class");}
	
	@BeforeClass
	public void bc()
	{System.out.println("AFter class");}
	
	@BeforeMethod
	public void bm()
	{System.out.println("Before Method");	}
	
	@AfterMethod
	public void am()
	{System.out.println("After Method");}

}
