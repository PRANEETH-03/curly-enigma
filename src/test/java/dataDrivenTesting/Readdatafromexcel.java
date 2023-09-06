package dataDrivenTesting;


import java.io.FileInputStream;

import java.io.IOException;

 

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdatafromexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis =new FileInputStream("C:\\Users\\pramvlss\\eclipse-workspace\\EplsilonSelenium\\src\\test\\resources\\trainee.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
	Sheet sh=(Sheet) wb.getSheet("Sheet1");
	
	//step 4:navigate to required row
	
	
	Row r=((org.apache.poi.ss.usermodel.Sheet) sh).getRow(1);

    //step 5:navigate to required cell

    Cell cl = (Cell) r.getCell(1);

    

    //step 6:capture the data in the cell

    String value = ((org.apache.poi.ss.usermodel.Cell) cl).getStringCellValue();

    System.out.println(value);
	
		

	}

}
