package com.utility;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String getParticularData(int rowvalue, int clmnvalue) {
		String data = null;
		try {
			File file = new File("C:\\Users\\Win10\\Downloads\\DataDriven_IPT.xlsx");
			Workbook book = new XSSFWorkbook(file);
			Sheet sheet = book.getSheet("Sheet1");
			Row row = sheet.getRow(rowvalue);
			Cell cell = row.getCell(clmnvalue);
			// String data=cell.getStringCellValue();
			// DataFormatter it helps format data
			DataFormatter dataFormat = new DataFormatter();
			data = dataFormat.formatCellValue(cell);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;

	}

	public static void getAllData() {
		try {
			File file = new File("C:\\Users\\Win10\\Downloads\\DataDriven_IPT.xlsx");
			Workbook book = new XSSFWorkbook(file);
			Sheet sheet = book.getSheet("Sheet1");

			int lastRowNum = sheet.getLastRowNum();
			System.out.println("No Of Rows: " + lastRowNum);

			short lastCellNum = sheet.getRow(0).getLastCellNum();
			System.out.println("No Of columns: " + lastCellNum);

			for (int i = 1; i <= lastRowNum; i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j <= lastCellNum; j++) {
					Cell cell = row.getCell(j);

					DataFormatter dataFormat = new DataFormatter();
					String data = dataFormat.formatCellValue(cell);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getParticularData(1, 0);

	}
}
