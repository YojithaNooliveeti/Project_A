package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Cell {

	public static void main(String[] args) throws IOException  {
		// Target file from local system
		FileInputStream fi = new FileInputStream("TestData\\Excel.xlsx");
		System.out.println("File located");

		// Get Workbook access
		XSSFWorkbook book = new XSSFWorkbook(fi);

		// Get sheet using book reference
		XSSFSheet sht = book.getSheet("celldata");

		// Target using sheet Reference
		XSSFRow row = sht.getRow(1);

		// Read data from cell
		Date date =row.getCell(4).getDateCellValue();
		// Create simple date format
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String strdate = sdf.format(date);

		if (strdate.equals("12/12/2023"))
			System.out.println("Data is matching");
		else
			System.out.println("Date mismatched");

	}

}
