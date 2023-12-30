package datadriven.Excel.Keywords;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	
		static String filepath = "TestData\\Excel";
		static XSSFWorkbook book;
		static XSSFSheet sht;
		static XSSFRow row;
		static XSSFCell cell;

		public static XSSFSheet getexcel(String filename, String sheetname) {
			try {
				FileInputStream fi = new FileInputStream(filepath + filename);
				book = new XSSFWorkbook(fi);
				sht = book.getSheet(sheetname);
			} catch (Exception e) {
				// TODO: handle exception
			}
			return sht;
		}

		// This method reads the test data from the Excel cell.
		// We are passing row number and column number as parameters.
		public static String getCellData(int RowNum, int ColNum) {
			cell = sht.getRow(RowNum).getCell(ColNum);
			DataFormatter formatter = new DataFormatter();
			return formatter.formatCellValue(cell);
		}

		// This method takes row number as a parameter and returns the data of given row
		// number.
		public static XSSFRow getRowData(int RowNum) {
			row = sht.getRow(RowNum);
			return row;
		}

		// Return Row End Cout
		public static int GetRowCount() {
			return sht.getLastRowNum() + 1;
		}

		/*
		 * Keyword:--> Write Cell Data Description:-->
		 */
		public static void WriteCellData_At_newCell(int row, int cell, String text) {
			sht.getRow(row).createCell(cell).setCellValue(text);
		}

		/*
		 * Keyword:--> Create output file and Dump all to otuput file Description:-->
		 */
		public static void CreateOtuputFile(String Ofilename) {
			try {
				FileOutputStream fo = new FileOutputStream(filepath + Ofilename);
				book.write(fo);
				book.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

