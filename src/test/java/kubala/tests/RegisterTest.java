package kubala.tests;

import kubala.pages.HomePage;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void registerUserTest() {
        new HomePage(driver).openMyAccountPage();
    }
}
