package com.crm.GenericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.POIXMLProperties;
import org.apache.poi.hwpf.usermodel.ParagraphProperties;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fileutils {
	public Properties getPropertyObj() throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\SarathPalanisamy\\eclipse-workspace\\SeleniumCRMframeWork\\testData\\CommonData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		return pobj;
		
	}
	public String getExcelData(String SheetName,int RowNum,int CellNum) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream flib=new FileInputStream("C:\\Users\\SarathPalanisamy\\eclipse-workspace\\SeleniumCRMframeWork\\testData\\TestScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(flib);
		Sheet sh=wb.getSheet(SheetName);
		Row row=sh.getRow(RowNum);
		String data=row.getCell(CellNum).getStringCellValue();
		return data;
		
	}

}
