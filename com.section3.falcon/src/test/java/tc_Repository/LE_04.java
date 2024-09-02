package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;
@Test(groups = {"regression", "smoke"})
public class LE_04 extends BaseClass {
	public void le_01Case() throws Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRamdomNumber(1000);
		//ExcelUtility EUTIL = new ExcelUtility();
		String FIRSTNAME = ExcelUtility.readDataFromExcel("Leads", 10, 1);
		String LASTNAME = ExcelUtility.readDataFromExcel("Leads", 10, 2);
		String COMPANY = ExcelUtility.readDataFromExcel("Leads", 10, 3);
		String CITY = ExcelUtility.readDataFromExcel("Leads", 10, 4);
		String COUNTRY = ExcelUtility.readDataFromExcel("Leads", 10, 5);
		String STATE = ExcelUtility.readDataFromExcel("Leads", 10, 6);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME +num, LASTNAME, COMPANY, CITY, COUNTRY, STATE);
		Thread.sleep(3000);
}
}