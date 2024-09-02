package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is the pom class for orgHomePage
 */
public class OrgHomePage {
	@FindBy(xpath="//img[@alt='Create Organization...']")
private WebElement newOrg;
	
	public OrgHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateNewOrgButton() {
		return newOrg;
	}
	/**
	 * Business lib to click on new Org btn
	 */
	public void clickOnNewBtn()
	{
		newOrg.click();
	}
}
