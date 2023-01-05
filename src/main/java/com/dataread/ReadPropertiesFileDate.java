package com.dataread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.internal.PropertiesFile;

public class ReadPropertiesFileDate 
{

	public static Properties propertiesDataBasedOnKey() throws IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./DataFiles/commonData.properties"));
		return p;
	}
}
