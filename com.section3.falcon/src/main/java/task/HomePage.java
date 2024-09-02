package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityOrLib.SeleniumUtility;
public class HomePage {

		@FindBy(xpath = "//span[text()='Dashboard']")
		private WebElement clickOnDashboard;

		@FindBy(xpath = "(//button[@type='button'])[2]")
		private WebElement order;

		@FindBy(xpath = "(//button[@type='button'])[3]")
		private WebElement orders;

		@FindBy(xpath = "//button[text()='Add Bulk Orders']")
		private WebElement clickOnBulkOrders;

		@FindBy(xpath = "//input[@type='file']")
		private WebElement chooseFile;
		
		
		@FindBy(xpath = "C:\\Users\\jigya\\OneDrive\\Desktop\\Downloads\\demo-data.xlsx")
		private WebElement importFile;
		
		
		@FindBy(xpath ="//button[text()='Validate Data']")
		private WebElement validate ;
		
		
		
		

		@FindBy(xpath ="//button[text()='Submit']")
		private WebElement submit ;
		
		public HomePage(WebDriver driver) {

			PageFactory.initElements(driver, this);
		}

		

		

		public WebElement getClickOnDashboard() {
			return clickOnDashboard;
		}





		public WebElement getOrder() {
			return order;
		}





		public WebElement getOrders() {
			return orders;
		}





		public WebElement getClickOnBulkOrders() {
			return clickOnBulkOrders;
		}





		public WebElement getChooseFile() {
			return chooseFile;
		}





		public WebElement getImportFile() {
			return importFile;
		}





		public WebElement getValidate() {
			return validate;
		}





		public WebElement getSubmit() {
			return submit;
		}





		/**
		 * this is business lib to logout
		 * 
		 * @throws Exception
		 */
		public void LogoutOperation(WebDriver driver) throws Exception {
			SeleniumUtility SUTIL = new SeleniumUtility();
			SUTIL.moveCursorToAnElement(driver,submit);
			Thread.sleep(3000);
			//SUTIL.moveCursorToAnElement(driver, submit);
		}
	}

	

