package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_1 extends BaseClass {
	 
		@Test
		public void ORG_1Case() throws Exception {
			JavaUtility JUTIL = new JavaUtility();
			int num = JUTIL.getRamdomNumber(1000);
		//ExcelUtility EUTIL = new ExcelUtility();
			String ORGNAME = ExcelUtility.readDataFromExcel("Organization", 1, 1);
			String WEBSITE = ExcelUtility.readDataFromExcel("Organization", 1, 2);
			String EMPLOYEES = ExcelUtility.readDataFromExcel("Organization", 1, 3);
			HomePage hp = new HomePage(driver);
			hp.clickOnOrg();
			OrgHomePage lp = new OrgHomePage(driver);
			lp.clickOnNewBtn();;
			CreateNewOrgPage cn = new CreateNewOrgPage(driver);
				cn.createOrganisation(ORGNAME +num, WEBSITE, EMPLOYEES);
			Thread.sleep(3000);
		}
	}

