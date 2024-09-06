package interview;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadExcel {

	@Test
	public void testdatacheck() throws IOException{
	//Path of the excel file
	FileInputStream fs = new FileInputStream("C:\\Users\\rajes\\OneDrive\\Desktop\\Test.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(fs);
	XSSFSheet sheet = workbook.getSheet("TestData");
	
	int rows=sheet.getLastRowNum();
	int cols=sheet.getRow(1).getLastCellNum();
	
	for(int r=0;r<rows;r++){
		XSSFRow row=sheet.getRow(r);
		
		for(int c=0;c<cols;c++){
			XSSFCell cell=row.getCell(c);
			
			
			switch(cell.getCellType())
			{
			case STRING: System.out.println(cell.getStringCellValue());break;
			case NUMERIC: System.out.println(cell.getNumericCellValue());break;
			
			}
		}
		System.out.println();
	}
	
	
	}
	

}


//Row row = sheet.getRow(0);
//Cell cell = row.getCell(0);
//System.out.println(sheet.getRow(0).getCell(0));
//Row row1 = sheet.getRow(1);
//Cell cell1 = row1.getCell(1);
//System.out.println(sheet.getRow(0).getCell(1));
//Row row2 = sheet.getRow(1);
//Cell cell2 = row2.getCell(1);
//System.out.println(sheet.getRow(1).getCell(0));
//Row row3 = sheet.getRow(1);
//Cell cell3 = row3.getCell(1);
//System.out.println(sheet.getRow(1).getCell(1));
////String cellval = cell.getStringCellValue();
////System.out.println(cellval);