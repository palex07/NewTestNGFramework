package com.ATTADMSales.salesproject;

import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Sales01 extends BaseClass
{

	
@Test
		
	public void testff()
	
	{
	
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/Prasanth.html");
	
	
	System.out.println("Sales 02 First TC");
    logger.info("Sales 01, first TC is passed");
		}

 @Test
    public void testff01()

   {
    System.out.println("Sales 01 Second TC");
    
    logger.info("Sales 01, Second TC is passed");
	}

  @Test
  public void testff02()

 {
   System.out.println("Sales 02 Third TC");
   logger.info(" Sales02, Third tC is passed");
	}	
 }
	


