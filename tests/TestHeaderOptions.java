package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HeaderOptions;

import java.io.IOException;
import java.time.Duration;

public class TestHeaderOptions {
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
     *  This test tests Header options.
     *
     *  Test steps:
     *  1. Go to : https://petstore.octoperf.com/actions/Catalog.action
     *  2. Click Cart, save the current url and go back to home page
     *  3. Click Sign, save the current url and go back to home page
     *  4. Click Question Mark(Help), save the current url and go back to home page
     *  5. Enter "Bulldog" in search input
     *  6. Click Search button
     *  6. Assert that searched result element have title "Bulldog"
     *  8. Assert that all url are correct
     * @throws IOException
     */

    @Test
    public void HeaderOptionsTest() {
        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        HeaderOptions header1 = new HeaderOptions(wd);

        header1.clickOnCartButton();
        String cartURL = wd.getCurrentUrl();

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        header1.clickOnSignInButton();
        String signInURL = wd.getCurrentUrl();

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        header1.clickOnQuestionMark();
        String helpURL = wd.getCurrentUrl();

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        header1.enterSearchInput();
        header1.clickOnSearchButton();

        String result = header1.getTexSearchResult();


        Assert.assertEquals(result,"Bulldog","Search result should be 'Bulldog'");

        SoftAssert sa = new SoftAssert();

        if (cartURL.contains("jsessionid") || signInURL.contains("jsessionid") || helpURL.contains("jsessionid")) {
            if (cartURL.contains("Cart") && signInURL.contains("sign") && helpURL.contains("help")) {
                cartURL = "";
                signInURL = "";
                helpURL = "";
            }
        }

        sa.assertEquals(cartURL, signInURL, helpURL);
        sa.assertAll();

    }
}
