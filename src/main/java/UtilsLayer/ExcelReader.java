package UtilsLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcelReader extends BaseClass {

	public static XSSFWorkbook workbook;

	public ExcelReader(String path) throws Exception {
		File f = new File(path);
		try {
			FileInputStream fis = new FileInputStream(f);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getExcelData(int index, int row, int cell) {
		try {
			workbook.getSheetAt(index).getRow(row).getCell(cell).getStringCellValue();
		} catch (Exception e) {
			workbook.getSheetAt(index).getRow(row).getCell(cell).getRawValue();
		}

	}

	public static int getRowCount(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getLastRowNum() + 1;
	}

	public static int getCellCount(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
	}

}
