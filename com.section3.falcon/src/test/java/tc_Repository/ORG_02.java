package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;

import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_02  extends BaseClass {
	@Test
	public void ORG_2Case() throws Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRamdomNumber(1000);
	//ExcelUtility EUTIL = new ExcelUtility();
		String ORGNAME = ExcelUtility.readDataFromExcel("Organization", 4, 1);
		String WEBSITE = ExcelUtility.readDataFromExcel("Organization", 4, 2);
		String EMPLOYEES = ExcelUtility.readDataFromExcel("Organization", 4, 3);
		String PHONE = ExcelUtility.readDataFromExcel("Organization", 4, 4);
		String OTRPHN = ExcelUtility.readDataFromExcel("Organization", 4, 5);
		String EMAIL = ExcelUtility.readDataFromExcel("Organization", 4, 6);
		HomePage hp = new HomePage(driver);
		hp.clickOnOrg();
		OrgHomePage lp = new OrgHomePage(driver);
		lp.clickOnNewBtn();;
		CreateNewOrgPage cn = new CreateNewOrgPage(driver);
			cn.createOrganisation(ORGNAME+num, WEBSITE, EMPLOYEES,PHONE,OTRPHN,EMAIL);
		Thread.sleep(3000);
	}
}

