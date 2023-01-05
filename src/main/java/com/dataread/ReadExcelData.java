package com.dataread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelData 
{
	
	public static XSSFSheet readCredentials() throws FileNotFoundException, IOException
	{
		
		//.xlsx	XSSFWorkbook
		// .xls  HSSFWorkbook
		
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("./DataFiles/UserCredentials.xlsx"));
		XSSFSheet sheet = wb.getSheet("UserCred");
		
	return sheet;
	}
	
	
	@DataProvider(name="userCred")
	public static Object[] [] dataRead() throws FileNotFoundException, IOException
	{
		int totalRows= readCredentials().getLastRowNum();
		Object[][] data = new Object[totalRows][1];
		LinkedHashMap<String, String> logins = null;
		for(int rowStart = 1; rowStart<totalRows; rowStart++)
		{
			logins = new LinkedHashMap<String, String>();
			String userName = readCredentials().getRow(rowStart).getCell(0).toString();
			String pwd = readCredentials().getRow(rowStart).getCell(1).toString();
			logins.put("UserName", userName);
			logins.put("Password", pwd);
			data[rowStart-1][0] = logins;
			//data[rowStart-1][1] = logins.get("Password");
		}
		return data;
	}
}
