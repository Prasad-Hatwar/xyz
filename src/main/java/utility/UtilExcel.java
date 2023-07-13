package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import ecomm.baseclass.baseclass;

public class UtilExcel extends baseclass {
	
	public static String Excel_path="../Ecomm-Biz/src/main/java/utility/STP.xlsx";
	
	public static Workbook workbook;
	static Sheet sheet;
	
	public static Object[][] getTestData(String sheetName) {
		
		FileInputStream fInput = null;
		try {
			fInput=new FileInputStream(Excel_path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			workbook=WorkbookFactory.create(fInput);
		}
		 catch (IOException e) {
			
			e.printStackTrace();
		}
		
		sheet=workbook.getSheet(sheetName);
		
		Object[][] dataObject=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int r=0;r<sheet.getLastRowNum();r++) {
			for(int c=0;c<sheet.getRow(0).getLastCellNum();c++) {
				
				dataObject[r][c]=sheet.getRow(r+1).getCell(c).toString();
				
			}
			
		}
		
		
		return dataObject;
		
	}
	
	
	

}
