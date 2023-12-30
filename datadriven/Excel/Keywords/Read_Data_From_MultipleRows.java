package datadriven.Excel.Keywords;

public class Read_Data_From_MultipleRows {

	public static void main(String[] args) {
		Excel.getexcel("Excel.xlsx", "multiplerows");
		for (int i = 1; i < Excel.GetRowCount(); i++) 
		{
			String UID=Excel.getCellData(i, 0);
			String PWD=Excel.getCellData(i, 1);
			System.out.println(UID+"   "+PWD);
		}
		
	}

}
