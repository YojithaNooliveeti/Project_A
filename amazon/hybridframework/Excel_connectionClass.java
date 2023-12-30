package amazon.hybridframework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_connectionClass {
	
	public static XSSFWorkbook wbook;
	public static XSSFSheet sheet;
	public static String path="TestData//";
	
	public static void excelConnection(String Filename, String Sheetname) {
		
		try {
			
			FileInputStream file=new FileInputStream(path+ Filename);
			wbook = new XSSFWorkbook(file);
			sheet = wbook.getSheet(Sheetname);	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String excel_rows(int row, int col) {
		return sheet.getRow(row).getCell(col).getStringCellValue();
		
	}

}