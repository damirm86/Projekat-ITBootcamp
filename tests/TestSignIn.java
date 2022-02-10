package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.SignIn;

import java.io.IOException;
import java.time.Duration;

public class TestSignIn {
    private WebDriver wd;

    //// Data provider is used to enter the login fields

    @DataProvider(name = "test")
    public Object[][] test() {

        return new Object[][]{
                {"629idi", "pass123#"}, {"668idi", "pass234#"}, {"989idi", "pass345#"}, {"357idi", "pass456#"},
        };
    }

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
     *  This test tests logging in with valid user.
     *
     *  Test steps:
     *  1. Go to : https://petstore.octoperf.com/actions/Catalog.action
     *  2. Login with valid user
     *  3. Assert that Welcome message is present
     *  8. Assert that My Account button is present
     * @throws IOException
     */

    @Test(dataProvider = "test")
    public void LogInTest(String userId, String password) {

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        SignIn sign1 = new SignIn(wd);

        sign1.clickOnSignIn();
        sign1.enterUserName(userId);
        sign1.enterPassword(password);
        sign1.clickOnLoginButton();

        Assert.assertTrue(sign1.welcomeContentIsDisplayed(), "Welcome content should be displayed.");
        Assert.assertEquals(sign1.getTextMyAccount(), "My Account", "Text should be 'My Account'");

        sign1.clickOnSignOut();

    }
}
