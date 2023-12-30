package framework.testng.dataprovider;

import org.testng.annotations.Test;

public class Read_From_Diff_Class {
	@Test(dataProvider = "MobilePrices", dataProviderClass = Input_Data.class)
	public void test2(String name, int price) {
		if (price < 50000) {
			System.out.println(name);

		}
	}

}
