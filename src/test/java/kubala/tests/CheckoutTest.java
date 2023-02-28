package kubala.tests;

import kubala.models.Customer;
import kubala.pages.HomePage;
import kubala.pages.OrderDetailsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {
        Customer customer = new Customer();

        OrderDetailsPage orderDetailsPage =
                new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCart()
                .openAddressDetails()
                .fillAddressDetails(customer,"Some random comment");

        Assert.assertEquals(orderDetailsPage.getOrderNotice().getText(),"Thank you. Your order has been received.");
    }
}
