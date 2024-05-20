package genericLibraryOrUtility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getSingleData(String sheetName , int startRowNum , int startCellnum) throws Exception {
		FileInputStream fis = new FileInputStream("/home/asta/Selenium/OrangeHrm.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		String s = sh.getRow(startRowNum).getCell(startCellnum).getStringCellValue();
		return s;
	}
	
	
	
	
	
	
	
	
	 public String getMultipleDataFromExcel(String sheetName, int startRowNum, int starCellNum) throws Exception{
		  String value = null;
		  FileInputStream fis = new  FileInputStream(iConstantUtility.excelpath);
		  Workbook book = WorkbookFactory.create(fis);
		  Sheet sh = book.getSheet(sheetName);
		  DataFormatter df  = new DataFormatter();
		  for(int i =startRowNum; i<=sh.getLastRowNum();i++) {
			  Row r = sh.getRow(i);
			  for(int j=starCellNum; j<=r.getFirstCellNum();j++)
			  {
				  value = df.formatCellValue(r.getCell(j));
			  }
		  }
		  return value;
	  }
	 	
}
