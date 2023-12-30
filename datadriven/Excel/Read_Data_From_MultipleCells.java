package datadriven.Excel;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_MultipleCells {

	public static void main(String[] args) throws Exception 
	{
		// Target file from local system
		FileInputStream fi = new FileInputStream("C:\\Users\\MINDQ DSNR\\Desktop\\Selenium_Wor\\selenium1_java\\TestData\\Excel.xlsx");
		System.out.println("File located");

		// Get Workbook access
		XSSFWorkbook book = new XSSFWorkbook(fi);

		// Get sheet using book reference
		XSSFSheet sht = book.getSheet("multiplecells");

		// Target Row
		XSSFRow row = sht.getRow(1);

		int FirstCellNum = row.getFirstCellNum();
		int LastCellNum = row.getLastCellNum();

		for (int i = FirstCellNum; i < LastCellNum; i++) {
			String Data = row.getCell(i).getStringCellValue();
			System.out.println(Data);
		}

		for (int i = 1; i <= sht.getLastRowNum(); i++) {
			for (int j = 0; j < sht.getRow(i).getLastCellNum(); j++) {
				String CellData = sht.getRow(i).getCell(j).getStringCellValue();
				System.out.println(CellData);
			}
		}

	}

}

