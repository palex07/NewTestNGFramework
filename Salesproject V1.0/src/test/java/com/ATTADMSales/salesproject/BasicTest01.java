package com.ATTADMSales.salesproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;


public class BasicTest01 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
        Eyes eyes =new Eyes();
        eyes.
		
		Thread.sleep(10000);
		driver.get("http://facebook.com");
		
		

	}

}
