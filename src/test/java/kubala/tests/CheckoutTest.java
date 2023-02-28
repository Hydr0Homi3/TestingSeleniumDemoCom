package kubala.tests;

import kubala.models.Customer;
import kubala.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {
        Customer customer = new Customer();
        customer.setFirstName("Jakub");
        customer.setLastName("Test");
        customer.setCompanyName("K&K");
        customer.setCountry("Poland");
        customer.setStreet("Kanonicza");
        customer.setFlatNumber("2137");
        customer.setZipCode("21370");
        customer.setCity("Krakow");
        customer.setPhone("123456789");
        customer.setEmail("random123@gmail.com");

        new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCart()
                .openAddressDetails()
                .fillAddressDetails(customer,"Some random comment");
    }
}
