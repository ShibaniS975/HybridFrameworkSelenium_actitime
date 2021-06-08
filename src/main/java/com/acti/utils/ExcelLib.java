package com.acti.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {

	public XSSFWorkbook wb;

	public ExcelLib(String xlpath)
	{
		try
		{
		File file = new File(xlpath);
		FileInputStream fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
		System.out.println("Excel not found" + e.getMessage());
		}
	}	
	public int getActiveRows(int sheetNum)
	{
		return wb.getSheetAt(sheetNum).getLastRowNum()+1;
	}
	
	public String getData(int sheetNum,int row, int col)
	{
		return wb.getSheetAt(sheetNum).getRow(row).getCell(col).toString();
	}
}
