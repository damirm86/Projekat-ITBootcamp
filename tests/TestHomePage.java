package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

import java.io.IOException;
import java.time.Duration;

public class TestHomePage {
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
     *  This test tests Go to home page
     *
     *  Test steps:
     *  1. Go to : https://petstore.octoperf.com/
     *  2. Click "Enter the Store"
     *  8. Assert that actual url is : https://petstore.octoperf.com/actions/Catalog.action
     * @throws IOException
     */

    @Test
    public void goToHomePage() throws InterruptedException {

        wd.get("https://petstore.octoperf.com/");
        wd.manage().window().maximize();

        HomePage hp = new HomePage(wd);

        hp.clickOnEnterTheStore();

        String url1 = wd.getCurrentUrl();
        String url2 = "https://petstore.octoperf.com/actions/Catalog.action";

        Assert.assertEquals(url1, url2);

        Assert.assertTrue(hp.topLogoIsDisplayed(), "Logo should be displayed.");


    }
}
