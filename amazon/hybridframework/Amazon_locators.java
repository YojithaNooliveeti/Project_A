package amazon.hybridframework;

import org.openqa.selenium.By;

public class Amazon_locators {

	public static By ExcelLocators(String proname, String provalue) {

		By obj = null;

		switch (proname) {
		case "xpath":
			obj = By.xpath(provalue);

			break;

		case "css":
			obj = By.cssSelector(provalue);
			break;

		default:
			break;
		}

		return obj;
	}
}
