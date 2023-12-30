package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_DecimalData {

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

		double price = row.getCell(0).getNumericCellValue();
		System.out.println(price);

		int expintprice = 2800;
		if (price > expintprice)
			System.out.println("Above");
		else
			System.out.println("below");

		// Converting Numeric value into text format
		String expstrprice = "2500.2";
		String strprice = NumberToTextConverter.toText(price);

		if (strprice.equals(expstrprice))
			System.out.println("match");
		else
			System.out.println("no match");

	}

}
