package samplePackage;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("D:\\Jigya\\Selenium\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(f);
		Sheet sh = book.getSheet("Sheet1");
			DataFormatter format = new DataFormatter();
String value = format.formatCellValue(sh.getRow(2).getCell(4));
System.out.println(value);
	}

}
