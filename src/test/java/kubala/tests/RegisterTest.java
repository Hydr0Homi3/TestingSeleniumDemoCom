package kubala.tests;

import kubala.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        WebElement entryTitle = new HomePage(driver).openMyAccountPage()
                .registerUser("Kijaniatest2@test.pl", "Kijaniatest2@test.pl")
                .getEntryTitle();

        Assert.assertTrue(entryTitle.isDisplayed());
        Assert.assertEquals(entryTitle.getText(), "My account");
    }
}
