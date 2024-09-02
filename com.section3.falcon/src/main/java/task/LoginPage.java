package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	@FindBy(xpath="//input[@name='username']")
private WebElement username;

	@FindBy(xpath="//input[@name='password']")
private WebElement password;

	@FindBy(xpath="//button[@type='submit']")
private WebElement loginButton;


public LoginPage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}


public WebElement getUsername() {
	return username;
}


public WebElement getPassword() {
	return password;
}


public WebElement getLoginButton() {
	return loginButton;
}
/**
 * 
 * @param name
 * @param pass
 */
public void loginOperation(String uname,String pass)
{
	username.sendKeys(uname);
	password.sendKeys(pass);
	loginButton.click();
}
}