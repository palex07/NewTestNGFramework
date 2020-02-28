package com.ATTADMSales.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLutls {

	public static void main(String[] args) throws IOException {
		File source = new File("./TestData/LoginData.xlsx");
	
		// eXcel reading code is working fine	
		try {
			
			FileInputStream fis= new FileInputStream (source);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sheet1= wb.getSheetAt(0);
			String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
			System.out.println(data0);
			
			// Last Raw count
			int last1=sheet1.getLastRowNum();
			System.out.println(last1);
			
		//	Traversing through all data in Excel
			
			for(int i=1;i<last1+1;i++)
			{
				String data1=sheet1.getRow(i).getCell(0).getStringCellValue();
				System.out.println("The Cell data is"+data1);
			}
			
			wb.close();
			
		} 
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
	}
finally{
	System.out.println(" XCEL Workbook Read complete");
	
	
}
	}

}
