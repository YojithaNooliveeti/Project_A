package datadriven.Excel.Keywords;

public class GetExcel_with_Keywords {

	public static void main(String[] args) {

		Excel.getexcel("Excel.xlsx", "config");
		String Cellvalue1 = Excel.getCellData(1, 0);
		System.out.println(Cellvalue1);

		Excel.getexcel("InputData.xlsx", "celldata");
		String Cellvalue2 = Excel.getCellData(1, 0);
		System.out.println(Cellvalue2);

	}

}
