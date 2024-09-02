package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_03  extends BaseClass {
	
			@Test
			public void ORG_3Case() throws Exception {
				JavaUtility JUTIL = new JavaUtility();
				int num = JUTIL.getRamdomNumber(1000);
			
				String ORGNAME = ExcelUtility.readDataFromExcel("Organization", 7, 1);
				String WEBSITE = ExcelUtility.readDataFromExcel("Organization", 7, 2);
				String BILLINGADDRESS = ExcelUtility.readDataFromExcel("Organization", 7, 3);
				String BILLINGCITY = ExcelUtility.readDataFromExcel("Organization", 7, 4);
				String BILLINGSTATE = ExcelUtility.readDataFromExcel("Organization", 7, 5);
				
				HomePage hp = new HomePage(driver);
				hp.clickOnOrg();
				OrgHomePage lp = new OrgHomePage(driver);
				lp.clickOnNewBtn();;
				CreateNewOrgPage cn = new CreateNewOrgPage(driver);
					cn.createOrganisation(ORGNAME+num, WEBSITE,BILLINGADDRESS,BILLINGCITY, BILLINGSTATE);
				Thread.sleep(3000);
			}
		}


