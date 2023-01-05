package com.dataread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReadData 
{
	public static List<HashMap<String, String>> readData() throws IOException 
	{
		FileInputStream excel = new FileInputStream("./DataFiles/UserCredentials.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(excel);
		XSSFSheet sheet = wb.getSheetAt(0);
//		String data = sheet.getRow(2).getCell(0).toString();
//		System.out.println(data);
		List<HashMap<String, String>> allData = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> userData;
		int lastRow = sheet.getLastRowNum();
		for(int i = 1; i<lastRow; i++)
		{
			userData = new HashMap<String, String>();
			userData.put("UserName", sheet.getRow(i).getCell(0).toString());
			userData.put("Password", sheet.getRow(i).getCell(1).toString());
			allData.add(userData);
		}
		System.out.println(allData);
		return allData;
	}
}
