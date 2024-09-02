package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_04 extends BaseClass {
	 
			
			@Test
			public void ORG_4Case() throws Exception {
				JavaUtility JUTIL = new JavaUtility();
				int num = JUTIL.getRamdomNumber(1000);
			//ExcelUtility EUTIL = new ExcelUtility();
				String ORGNAME = ExcelUtility.readDataFromExcel("Organization", 10, 1);
				String WEBSITE = ExcelUtility.readDataFromExcel("Organization", 10, 2);
				String EMPLOYEES = ExcelUtility.readDataFromExcel("Organization", 10, 3);
				String PHONE = ExcelUtility.readDataFromExcel("Organization", 10, 4);
				String OTRPHN = ExcelUtility.readDataFromExcel("Organization", 10, 5);
				String EMAIL = ExcelUtility.readDataFromExcel("Organization", 10, 6);
				String BILLINGADDRESS = ExcelUtility.readDataFromExcel("Organization", 10, 7);
				String BILLINGCITY = ExcelUtility.readDataFromExcel("Organization", 10, 8);
				String BILLINGSTATE = ExcelUtility.readDataFromExcel("Organization", 10, 9);
				
				HomePage hp = new HomePage(driver);
				hp.clickOnOrg();
				OrgHomePage lp = new OrgHomePage(driver);
				lp.clickOnNewBtn();;
				CreateNewOrgPage cn = new CreateNewOrgPage(driver);
					cn.createOrganisation(ORGNAME +num, WEBSITE, EMPLOYEES, PHONE,OTRPHN, EMAIL, BILLINGADDRESS, BILLINGCITY, BILLINGSTATE);
				Thread.sleep(3000);
			}
		}



