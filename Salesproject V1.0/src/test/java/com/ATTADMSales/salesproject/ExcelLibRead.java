package com.ATTADMSales.salesproject;

import java.io.FileNotFoundException;

import library.ExcelDataConfig;

public class ExcelLibRead {

	public static void main(String[] args) throws FileNotFoundException 
	
	{
		ExcelDataConfig excel = new ExcelDataConfig("./TestData/LoginData.xlsx");
		System.out.println(excel.getData(0, 1, 1));

	}

}
