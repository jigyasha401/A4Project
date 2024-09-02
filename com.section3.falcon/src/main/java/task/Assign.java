 package task;

import objectRepository.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericUtilityOrLib.SeleniumUtility;

public class Assign extends BaseClass {

    @Test
    public void work() {
        // Create an instance of SeleniumUtility
        SeleniumUtility SUTIL = new SeleniumUtility();
        HomePage hp = new HomePage(driver);
         
    }
}
