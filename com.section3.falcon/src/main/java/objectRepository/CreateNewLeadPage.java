package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateNewLeadPage {
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;

	@FindBy(xpath="//input[@name='company']")
	private WebElement company ;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement title;

	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;

	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
 
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployees;

	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement street;

	@FindBy(xpath="//input[@name='pobox']")
	private WebElement poBox;

	@FindBy(xpath="//input[@name='code']")
	private WebElement postalCode;

	@FindBy(xpath="//input[@name='city']")
	private WebElement city;

	@FindBy(xpath="//input[@name='country']")
	private WebElement country;

	@FindBy(xpath="//input[@name='state']")
	private WebElement state;
	
	@FindBy(xpath="(//input[@name='button'])[1]")
	private WebElement saveBtn;

	public CreateNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getTitle() {
		return title;
	}
	
	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNoOfEmployees() {
		return noOfEmployees;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getPoBox() {
		return poBox;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}
	public WebElement getSaveBtn() {
		return saveBtn;

}
/**
 * 
 * @param leadFirstName
 * @param lastname
 * @param comp
 */
	public void createLead(String leadFirstName, String lastname,String comp )
	{
		firstName.sendKeys(leadFirstName);
		lastName.sendKeys(lastname);
		company.sendKeys(comp);
		saveBtn.click();
	}
	
	public void createLead(String leadFirstName, String lastname,String comp,String tit,String Phone,
			String Mobile,String Email,String noOfEmp,String Street,
			String PoBox,String Postalcode,String City,String Country,String State )
	{
		firstName.sendKeys(leadFirstName);
		lastName.sendKeys(lastname);
		company.sendKeys(comp);
		title.sendKeys(tit);
		phone.sendKeys(Phone);
		mobile.sendKeys(Mobile);
		email.sendKeys(Email);
		noOfEmployees.sendKeys(noOfEmp);
		street.sendKeys(Street);
		poBox.sendKeys(PoBox);
		postalCode.sendKeys(Postalcode);
		city.sendKeys(City);
		country.sendKeys(Country);
		state.sendKeys(State);
		saveBtn.click();
	}
	/**
	 * 
	 * @param lastname
	 * @param comp
	 * @param tit
	 * @param Phone
	 * @param Mobile
	 * @param Email
	 * @param noOfEmp
	 */
	public void createLead( String firstname ,String lastname,String comp,String tit,String Phone,String Mobile,String Email,String noOfEmp)
	{
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		company.sendKeys(comp);
		title.sendKeys(tit);
		phone.sendKeys(Phone);	
		mobile.sendKeys(Mobile);
		email.sendKeys(Email);
		noOfEmployees.sendKeys(noOfEmp);
		saveBtn.click();
	}
	/**
	 * 
	 * @param lastname
	 * @param Comp
	 * @param Postalcode
	 * @param City
	 * @param Country
	 * @param State
	 */
	public void createLead( String firstname,String lastname,String Comp, String City,
			String Country,String State )
	{
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		company.sendKeys(Comp);
		city.sendKeys(City);
		country.sendKeys(Country);
		state.sendKeys(State);
		saveBtn.click();
	}
}
 

