package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Numeric_Value {

	public static void main(String[] args) throws IOException 
	{
		// Target file from local system
		FileInputStream fi = new FileInputStream("TestData\\Excel.xlsx");
		System.out.println("File located");

		// Get Workbook access
		XSSFWorkbook book = new XSSFWorkbook(fi);

		// Get sheet using book reference
		XSSFSheet sht = book.getSheet("celldata");

		// Target using sheet Reference
		XSSFRow row = sht.getRow(1);

		// GetNumricCellvalue method by default read number into double format
		double num = row.getCell(1).getNumericCellValue();
		if (num == 100)
			System.out.println("pass");
		else
			System.out.println("Fail");

		// Convert number into String
		String strnum = NumberToTextConverter.toText(num);
		System.out.println(strnum);

		if (strnum.equals("100"))
			System.out.println("pass");
		else
			System.out.println("fail");

	}

}
