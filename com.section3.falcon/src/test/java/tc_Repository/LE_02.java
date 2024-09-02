package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

@Test(groups= {"smoke"})
public class LE_02 extends BaseClass{
	public void le_01Case() throws Exception{
	JavaUtility JUTIL = new JavaUtility();
	int num = JUTIL.getRamdomNumber(1000);
	//ExcelUtility EUTIL = new ExcelUtility();
	String FIRSTNAME = ExcelUtility.readDataFromExcel("Leads", 4, 1);
	String LASTNAME = ExcelUtility.readDataFromExcel("Leads", 4, 2);
	String COMPANY = ExcelUtility.readDataFromExcel("Leads", 4, 3);
	String TITLE = ExcelUtility.readDataFromExcel("Leads", 4, 4);
	String PHONE = ExcelUtility.readDataFromExcel("Leads", 4, 5);
	String EMAIL = ExcelUtility.readDataFromExcel("Leads", 4, 6);
	String MOBILE = ExcelUtility.readDataFromExcel("Leads", 4, 7);
	String NOOFEMP = ExcelUtility.readDataFromExcel("Leads", 4, 8);
	String STREET = ExcelUtility.readDataFromExcel("Leads", 4, 9);
	String POBOX = ExcelUtility.readDataFromExcel("Leads", 4, 10);
	String POSTALCODE = ExcelUtility.readDataFromExcel("Leads",4 , 11);
	String CITY = ExcelUtility.readDataFromExcel("Leads", 4, 12);
	String COUNTRY = ExcelUtility.readDataFromExcel("Leads", 4, 13);
	String STATE = ExcelUtility.readDataFromExcel("Leads", 4, 14);
	HomePage hp = new HomePage(driver);
	hp.clickOnLeads();
	LeadsHomePage lp = new LeadsHomePage(driver);
	lp.clickOnNewLeadBtn();
	CreateNewLeadPage cn = new CreateNewLeadPage(driver);
	cn.createLead(FIRSTNAME +num, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOOFEMP, STREET, POBOX, POSTALCODE, CITY, COUNTRY, STATE);
	Thread.sleep(4000);
	
}

}
