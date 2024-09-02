package task;
 

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
public class SeleniumUtility {

	//WebDriver driver = null;
	Actions act = null;
	Select s = null;

	public void implicitwait(WebDriver driver, int particularSecods) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(particularSecods));
	}

	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * 
	 * @param element
	 */
	public void rightClickOnElement(WebDriver driver, WebElement element) {
		act = new Actions(driver);
		act.contextClick(element).perform();
	}

	/**
	 * 
	 * @param src
	 * @param target
	 */
	public void dragAndDropAnElement(WebDriver driver, WebElement src, WebElement target) {
		act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}

	/**
	 * 
	 * @param src
	 * @param xOffset
	 * @param yOffset
	 */
	public void dragAPointer(WebDriver driver, WebElement src, int xOffset, int yOffset) {
		act = new Actions(driver);
		act.dragAndDropBy(src, xOffset, yOffset).perform();
	}

	/**
	 * 
	 * @param element
	 */
	public void scrollToElement(WebDriver driver, WebElement element) {
		act = new Actions(driver);
		act.scrollToElement(element).perform();
	}

	/**
	 * 
	 * @param element
	 */
	public void moveCursorToAnElement(WebDriver driver, WebElement element) {
		act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * 
	 * @param element
	 */
	public void holdToElement(WebDriver driver, WebElement element) {
		act = new Actions(driver);
		act.clickAndHold(element).perform();
	}

	/**
	 * 
	 * @param element
	 */
	public void releaseAnElement(WebDriver driver, WebElement element) {
		act = new Actions(driver);
		act.release(element).perform();
	}

	/**
	 * 
	 * @param element
	 * @param indexNum
	 */
	public void selectElementByIndex(WebElement element, int indexNum) {
		s = new Select(element);
		s.selectByIndex(indexNum);
	}

	/**
	 * 
	 * @param element
	 * @param text
	 */
	public void selectElementByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}

	/**
	 * 
	 * @param element
	 * @param text
	 */
	public void selectElementByValue(WebElement element, String text) {
		s = new Select(element);
		s.deselectByValue(text);
	}

	/**
	 * 
	 * @param element
	 * @param indexNum
	 */
	public void deselectElementByIndex(WebElement element, int indexNum) {
		s = new Select(element);
		s.deselectByIndex(indexNum);
	}

	/**
	 * 
	 * @param element
	 * @param text
	 */
	public void deselectElementByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.deselectByVisibleText(text);
	}

	/**
	 * 
	 * @param element
	 * @param text
	 */
	public void deselectElementByValue(WebElement element, String text) {
		s = new Select(element);
		s.deselectByValue(text);
	}

	/**
	 * 
	 * @param element
	 */
	public void deSelectAllOptions(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public List<WebElement> fetchAllSelectedOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> all = s.getOptions();
		return all;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public List<WebElement> fetchAllOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> all = s.getOptions();
		return all;
	}

	/**
	 * 
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * 
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

//----------Frame-----------/
	public void switchToChildFrame(WebDriver driver,int childFrameindex) {
		driver.switchTo().frame(childFrameindex);
	}
}

	

