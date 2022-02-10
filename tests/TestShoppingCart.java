package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ShoppingCart;
import pages.SignIn;

import java.io.IOException;
import java.time.Duration;

public class TestShoppingCart {
    private WebDriver wd;

    @BeforeClass
    public void init() throws IOException {
        System.setProperty("webdriver.chrome.driver",
                "chromedriver.exe");

        wd = new ChromeDriver();

        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterClass
    public void zatvoriWebDriver() {
        wd.close();
    }

    /**
     *  This test tests shopping on the site.
     *
     *  Test steps:
     *  1. Go to : https://petstore.octoperf.com/actions/Catalog.action
     *  2. Click fisch group
     *  3. Click angelfish
     *  4. Click large angelfish
     *  5. Click Add To Cart
     *  6. Enter Quantity value "2"
     *  7. Click Update Cart
     *  8. Click Return to main menu
     *  9. Click Reptiles
     *  10. Click "Iguana"
     *  11. Click Add To Cart Button
     *  12. Click Proceed to checkout
     *  13. Assert that the warning message "You must sign on..."  is present
     *  14. Enter Username
     *  15. Enter password
     *  16. Click login
     *  17. Click Shopping cart
     *  18. Click Proceed to checkout
     *  19. Click Continue
     *  20. Click Confirm
     *  21. Assert that the message "Thank you, your order has been submitted." is present, and save the order number
     *  22. Click My Account
     *  23. Click My Orders
     *  24. Assert that the order table contains saved order number
     * @throws IOException
     */

    @Test
    public void ShoppingCartHappyPath() {

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        ShoppingCart shop1 = new ShoppingCart(wd);

        shop1.clickOnFishGroup();
        shop1.clickOnAngelfish();
        shop1.clickOnLargeAngelfish();
        shop1.clickOnAddToCartButton();
        shop1.enterQuantity();
        shop1.clickOnUpdateCart();
        shop1.clickOnReturnToMainMenu();
        shop1.clickOnReptilesGroup();
        shop1.clickOnIguana();
        shop1.clickOnAddToCartButton();
        shop1.clickOnProceedToCheckout();

        Assert.assertEquals(shop1.getTextContentMessage(),
                "You must sign on before attempting to check out. Please sign on and try checking out again.");

        SignIn sign = new SignIn(wd);

        sign.enterUserName("629idi");
        sign.enterPassword("pass123#");
        sign.clickOnLoginButton();

        shop1.clickOnShoppingCartButton();
        shop1.clickOnProceedToCheckout();
        shop1.clickOnContinueButton();
        shop1.clickOnConfirmButton();

        Assert.assertEquals(shop1.getTextMessageAboutOrder(),"Thank you, your order has been submitted.");

        String orderInfoText = shop1.getTextOrderInformation();
        String fragment = orderInfoText.substring(7, 13);

        shop1.clickOnMyAccountButton();
        shop1.clickOnMyOrdersButton();

        String orderTableText = shop1.getTextOrderTable();

        Assert.assertTrue(orderTableText.contains(fragment));

    }

}




