package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName){
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet=workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void getRowCount() {	
	try {
	int rowCount=sheet.getPhysicalNumberOfRows();
	System.out.println("Number of Rows are:");
	System.out.println(rowCount);
	}
	catch(Exception e) {
		e.getMessage();
		e.printStackTrace();
	}
	}
	
	public String getCellDataString(int rowNum, int colNum) {
		String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(cellData);
		return cellData;
	}
	
	public double getCellDataNumericValue(int rowNum, int colNum) {
		double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(cellData);
		return cellData;
	}
	
	public Object[][] excelDataProvider(){
		Object[][] celldata=new Object[3][2];
		return celldata;
	}

}
