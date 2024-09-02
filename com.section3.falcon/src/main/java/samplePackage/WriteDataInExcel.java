package samplePackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtilityOrLib.IconstantUtility;

public class WriteDataInExcel {
	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("D:\\Jigya\\Selenium\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(f);
		Sheet sh = book.getSheet("Sheet1");
		sh.createRow(9).createCell(1).setCellValue("SOAP API");
		FileOutputStream fos = new FileOutputStream(IconstantUtility.excelPath);
		book.write(fos);
	}
}
 