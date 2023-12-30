package framework.testng.dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Input_Data {
	@Test(dataProvider = "dp")
	public void test1(int num, String name) {

		System.out.println(num + "     " + name);
	}

	@Test(dataProvider = "MobilePrices")
	public void test2(String name, int price) {
		if (price < 100000) {

			System.out.println(name);
		} else {
			System.out.println(name);

		}
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] { 101, "apple" }, 
			new Object[] { 201, "car" },
				new Object[] { 301, "Duck" }, 
				new Object[] { 401, "bag" }, 
				new Object[] { 501, "egg" },
				new Object[] { 601, "fish" }, 
				};
	}

	@DataProvider
	public static Object[][] MobilePrices() {
		Object[][] data = { 
				new Object[] { "Iphone", 55550 }, 
				new Object[] { "Samsung", 45550 },
				new Object[] { "Vivo", 25550  } 
				};
		return data;
	}
}
