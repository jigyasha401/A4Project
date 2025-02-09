package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is the pom class for lead homepage
 */
public class LeadsHomePage {
	@FindBy(xpath="//img[@alt='Create Lead...']")
	private WebElement createNewLeadButton;

	public LeadsHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateNewLeadButton() {
		return createNewLeadButton;
	}
	/**
	 * this is the business library to click on new btn
	 */
	
	public void clickOnNewLeadBtn() {
		createNewLeadButton.click();
	}
	
}
