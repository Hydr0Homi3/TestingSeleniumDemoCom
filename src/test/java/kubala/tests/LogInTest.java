package kubala.tests;

import kubala.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void logInTest() {

        WebElement dashboardLink = new HomePage(driver).openMyAccountPage()
                .logInValidData("Kijaniatest@test.pl", "Kijaniatest@test.pl")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Test
    public void logInWithInvalidPasswordTest() {
        WebElement error = new HomePage(driver).openMyAccountPage()
                .logInInvalidData("Kijaniatest@test.pl", "test@test.pl")
                .getError();

        Assert.assertTrue(error.getText().contains("Incorrect username or password."), "Expected error text doesn't match");
    }
}
