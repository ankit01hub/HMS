package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
	// Excel------ wrokbook----sheet---- row---- cells
		
		// FileInputStrem--read the data from excel
		//XSSFWorkbook-----Extract the Workbook from the excel
		//XSSRow------ Extract the row from the sheet
		//XSSFcell---Extract the cell from the rows
		//1.use call -file-
		FileInputStream file= new FileInputStream("C:\\Selenium\\seleniumwebdriver\\Testdata\\Datadriventesting.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet =workbook.getSheet("sheet1");
 int totalrows =sheet.getLastRowNum();
         int totalcell=   sheet.getRow(1).getLastCellNum();
         System.out.println("number of total row" + totalrows);
         System.out.println("number of total cell" + totalcell);
           
	for (int r=0;r<=totalrows;r++)
	{
		XSSFRow currentrow=sheet.getRow(r);
		for (int c=0;c<totalcell;c++)
		{
			XSSFCell  cell =currentrow.getCell(c);
			System.out.println(cell.toString());  
		}
	
	
		
	}
	}
}

	

	
	
	
	
	
	
	
	
	
	
	
	
