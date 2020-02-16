package com.ATTADMSales.salesproject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static  Logger logger;
	@BeforeTest
	public void initsetup()
	{
		logger = Logger.getLogger(BaseClass.class);
		//String log4Jpath=System.getProperty("log4j.properties");
		PropertyConfigurator.configure("log4j.properties");
	}
	}



