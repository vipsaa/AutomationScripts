package sample;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHandling {
public static void main(String[] args) throws Exception {
	FileInputStream fis = new FileInputStream("/home/asta/Selenium/OrangeHrm.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Admin");
	String s = sh.getRow(1).getCell(2).getStringCellValue();
	System.out.println(s);
	
	
}
}
