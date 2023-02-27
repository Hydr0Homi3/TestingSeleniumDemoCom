package kubala.tests;

import kubala.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        WebElement dashboardLink = new HomePage(driver).openMyAccountPage()
                .registerUser("Kijaniatest4@test.pl", "Kijaniatest4@test.pl")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }
}
