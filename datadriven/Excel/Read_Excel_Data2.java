package datadriven.Excel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_Data2 {

	public static void main(String[] args) {
		FileInputStream fi = null;
		try {
			// Target file from local system
			fi = new FileInputStream("TestData\\Excel.xlsx");
			System.out.println("File located");

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (fi != null) {
			XSSFWorkbook book = null;
			try {
				book = new XSSFWorkbook(fi);
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (book != null) {
				XSSFSheet sht = book.getSheet("config");
				String Browser = sht.getRow(1).getCell(0).getStringCellValue();
				String url = sht.getRow(1).getCell(1).getStringCellValue();

				System.out.println(Browser + "   " + url);
			}
		}

	}

}

