package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_03 extends BaseClass {
@Test(groups= {"sanity"})
	public void le_01Case() throws Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRamdomNumber(1000);
		//ExcelUtility EUTIL = new ExcelUtility();
		String FIRSTNAME = ExcelUtility.readDataFromExcel("Leads", 7, 1);
		String LASTNAME = ExcelUtility.readDataFromExcel("Leads", 7, 2);
		String COMPANY = ExcelUtility.readDataFromExcel("Leads", 7, 3);
		String TITLE = ExcelUtility.readDataFromExcel("Leads", 7, 4);
		String PHONE = ExcelUtility.readDataFromExcel("Leads", 7, 5);
		String EMAIL = ExcelUtility.readDataFromExcel("Leads", 7, 6);
		String MOBILE = ExcelUtility.readDataFromExcel("Leads", 7, 7);
		String NOOFEMP = ExcelUtility.readDataFromExcel("Leads", 7, 8);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME + num, LASTNAME, COMPANY, TITLE, PHONE, EMAIL, MOBILE, NOOFEMP);
		Thread.sleep(4000);
}
}