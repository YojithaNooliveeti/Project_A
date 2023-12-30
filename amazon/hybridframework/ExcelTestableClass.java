package amazon.hybridframework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExcelTestableClass {

	@Test
	public void AmazonProduct() throws Exception {
		Excel_repositoryClass.excelhelperclass("amazon.xlsx", "url");
		Thread.sleep(2000);
		Excel_repositoryClass.excelhelperclass1("amazon.xlsx", "product", "amazonaddcart");
		Reporter.log("click on product");
	}
}
