package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePageLocators {

	
	//btn-Search = //Input[@Value='Search']
	
	@FindBy(xpath="//Input[@Value='Search']")
	public WebElement btnSearch;
	
	@FindBy(xpath="//Input[@Value='Search']")
	public WebElement txtbxSearch;
	
}
