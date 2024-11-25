package tests;

import org.testng.annotations.Test;

import utils.ExcelUtils;

public class TestExcelData {
	
	static String projectPath=System.getProperty("user.dir");
	static String sheetName="Sheet1";
	ExcelUtils exc=new ExcelUtils(projectPath+"/data/data.xlsx",sheetName);
	
	@Test
	public void getCellData() {
		//ExcelUtils exc=new ExcelUtils(projectPath,sheetName);
		exc.getCellDataString(0, 0);
	}

}
