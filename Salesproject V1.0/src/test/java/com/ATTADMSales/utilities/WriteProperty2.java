package com.ATTADMSales.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.testng.annotations.Test;

@Test
public class WriteProperty2 {

	// Reading properties file
		
	Properties prop1; 
	
	{

try

{
	FileInputStream fis1 =new FileInputStream ("./configuration/config.properties");
	prop1 =new Properties();
	prop1.load(fis1);
	System.out.println(prop1.getProperty("username"));
	String password= prop1.getProperty("password");
	System.out.println(password);

	}
catch(Exception e) {
	System.out.println("Exception is"+e.getMessage());
	
	
	}
finally{
	
	System.out.println("Property is read properly");
}

}

@Test

// Writing to Config2.properties  working fine
public class Writetofile{
	Properties prop2;
	{
	try

	{
		FileOutputStream fos =new FileOutputStream ("./configuration/config2.properties");
			prop2 =new Properties();
		prop2.setProperty("Username", prop1.getProperty("username"));
       prop2.store(fos, "Write");
       
		}
	catch(Exception e) {
		System.out.println("Exception is"+e.getMessage());
		
		
		}
	finally{
		
		System.out.println("Value is written properly");
	}
	
	}}}
		
	
	


