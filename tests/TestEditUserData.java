package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.EditUserData;
import pages.ShoppingCart;
import pages.SignIn;

import java.io.IOException;
import java.time.Duration;

public class TestEditUserData {
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
     *  This test tests Edit user data
     *
     *  Test steps:
     *  1. Go to : https://petstore.octoperf.com/actions/Catalog.action
     *  2. Sign In with valid user
     *  3. Assert that welcome message is present
     *  4. Click "My account button"
     *  5. Enter new value for First name
     *  6. Click "Save account information"
     *  7. Back to home page
     *  8. Assert that Welcome message is present with new first name
     *  9. Log out
     *  10. Sign in again with same user
     *  11. Assert that Welcome message is present with new first name
     * @throws IOException
     */

    @Test
    public void EditUserData() {

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        SignIn sign1 = new SignIn(wd);

        EditUserData edit1 = new EditUserData(wd);

        sign1.clickOnSignIn();
        sign1.enterUserName("629idi");
        sign1.enterPassword("pass123#");
        sign1.clickOnLoginButton();

        Assert.assertTrue(sign1.welcomeContentIsDisplayed(), "Welcome content should be displayed.");
        Assert.assertEquals(sign1.getTextMyAccount(), "My Account", "Text should be 'My Account'");

        edit1.clickOnMyAccountButton();
        edit1.enterFirstName();

        edit1.clickOnSaveAccountInformation();

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        Assert.assertEquals(edit1.getTextWelcomeMessage(),
                "Welcome Borislav!","Welcome message should be 'Welcome Borislav!'");

        edit1.clickOnSignOutButton();

        sign1.clickOnSignIn();
        sign1.enterUserName("629idi");
        sign1.enterPassword("pass123#");
        sign1.clickOnLoginButton();

        Assert.assertEquals(edit1.getTextWelcomeMessage(),
                "Welcome Borislav!","Welcome message should be 'Welcome Borislav!'");

    }
}

