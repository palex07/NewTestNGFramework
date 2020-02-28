package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public ExcelDataConfig(String excelPath) throws FileNotFoundException 
	
	{
		
		try {
			File source = new File(excelPath);
			FileInputStream fis= new FileInputStream (source);
			wb= new XSSFWorkbook(fis);
			
		}
		
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
		
		}

	

public String getData(int sheetnumber,int row,int column)

{
	sheet1= wb.getSheetAt(sheetnumber);
	String data=sheet1.getRow(row).getCell(column).getStringCellValue();
	return data;
}}