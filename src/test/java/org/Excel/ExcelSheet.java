package org.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\DELL\\eclipse-workspace\\MavenTask\\src\\test\\resources\\ExcelData\\Data1.xlsx");
		FileInputStream st=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(st);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		System.out.println(cell);
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);
			for (int j = 0; j <row2.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row2.getCell(j);
				System.out.print(cell2+"\t");
				
			}
			System.out.println();
			
		}
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(3);
	
		System.out.println(cell1);
	}

}
