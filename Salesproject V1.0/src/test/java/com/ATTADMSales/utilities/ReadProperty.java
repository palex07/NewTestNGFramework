package com.ATTADMSales.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) {
		
		// Reading properties file
		
Properties prop= new Properties();
try

{
	FileInputStream fis =new FileInputStream ("./configuration/config.properties");
	prop.load(fis);
	System.out.println(prop.getProperty("username"));
	String password= prop.getProperty("password");
	System.out.println(password);

	}
catch(Exception e) {
	System.out.println("Exception is"+e.getMessage());
	
	
	}
finally{
	
	System.out.println("Property is read properly");
}

}}
