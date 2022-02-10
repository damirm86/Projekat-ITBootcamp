package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.RegisterNewAccount;

import java.io.IOException;
import java.time.Duration;

public class TestRegisterNewAccount {
    private WebDriver wd;
    Faker faker;
    // Data provider is used to create new users account in combination with faker
    @DataProvider(name = "test")
    public Object[][] test() {
        faker = new Faker();

        return new Object[][]{
                {faker.name().username(), "pass123#", "pass123#", faker.name().firstName(), faker.name().lastName(),
                        "emaili248@yahoo.com", "064528968", "Gogoljeva 5",
                        "Tozin Sokak 8", "Novi Sad", "Serbia",
                        "21000", "Serbia"},
                {faker.name().username(), "pass234#", "pass234#", faker.name().firstName(), faker.name().lastName(),
                        "email1525@hotmail.com", "064529968", "Sarajevska 2",
                        "Bulevar Avnoja 10", "Belgrade", "Serbia",
                        "11000", "Serbia"},
                {faker.name().username(), "pass345#", "pass345#", faker.name().firstName(), faker.name().lastName(),
                        "email91987@yahoo.com", "094528968", "JNA 125",
                        "Lenjinova 2", "Ruma", "Serbia",
                        "22400", "Serbia"},
                {faker.name().username(), "pass456#", "pass456#", faker.name().firstName(), faker.name().lastName(),
                        "923458dda@gmail.com", "062528968", "Beogradska 10",
                        "Zlatiborski put bb", "Uzice", "Serbia",
                        "31000", "Serbia"},
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
     *  This test tests new user registration with valid input data
     *
     *  Test steps:
     *  1. Go to : https://petstore.octoperf.com/actions/Account.action?newAccountForm=
     *  2. Use data provider for enter all the fields
     *  3. Click save account
     *  8. Assert that registering was successfull (current url is same with home page
     *  https://petstore.octoperf.com/actions/Catalog.action)
     * @throws IOException
     */

    @Test(dataProvider = "test")
    public void RegisterNewAccountTest(String i, String p, String r, String f, String l, String e,
                                       String ph, String a1, String a2, String c, String s, String z,
                                       String co) {


        wd.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
        wd.manage().window().maximize();

        RegisterNewAccount reg1 = new RegisterNewAccount(wd);

        reg1.enterUserID(i);
        reg1.enterNewPassword(p);
        reg1.enterRepeatPassword(r);
        reg1.enterFirstName(f);
        reg1.enterLastName(l);
        reg1.enterEmail(e);
        reg1.enterPhone(ph);
        reg1.enterAddress1(a1);
        reg1.enterAddress2(a2);
        reg1.enterCity(c);
        reg1.enterState(s);
        reg1.enterZipCode(z);
        reg1.enterCountry(co);
        reg1.clickOnSaveAccount();

        String url1= "https://petstore.octoperf.com/actions/Catalog.action";

        String url2 = wd.getCurrentUrl();

        Assert.assertEquals(url1,url2);

    }

    /**
     *  This test tests new user registration with fake input data
     *
     *  Test steps:
     *  1. Go to : https://petstore.octoperf.com/actions/Account.action?newAccountForm=
     *  2. Use faker for enter userID (faker.name().username());
     *  3. EnterNewPassword("asSA");
     *  4. EnterRepeatPassword("dfdsf");
     *  5. EnterFirstName("dcs");
     *  6. EnterLastName("csdcs");
     *  7. EnterEmail("xasx");
     *  8. EnterPhone("cxvx");
     *  9. EnterAddress1("scd");
     *  10. EnterAddress2("csaca");
     *  11. EnterCity("bvcbcv");
     *  12. EnterState("hzth");
     *  13. EnterZipCode("cxv");
     *  14. EnterCountry("gfhfg");
     *  15. ClickOnSaveAccount();
     *  16. Assert that registering was unsuccessfull (current url is not equal with home page :
     *  https://petstore.octoperf.com/actions/Catalog.action)
     * @throws IOException
     */

    @Test
    public void RegisterNewAccountWithFakeInputData() {

        wd.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
        wd.manage().window().maximize();

        RegisterNewAccount reg2 = new RegisterNewAccount(wd);

        reg2.enterUserID(faker.name().username());
        reg2.enterNewPassword("asSA");
        reg2.enterRepeatPassword("dfdsf");
        reg2.enterFirstName("dcs");
        reg2.enterLastName("csdcs");
        reg2.enterEmail("xasx");
        reg2.enterPhone("cxvx");
        reg2.enterAddress1("scd");
        reg2.enterAddress2("csaca");
        reg2.enterCity("bvcbcv");
        reg2.enterState("hzth");
        reg2.enterZipCode("cxv");
        reg2.enterCountry("gfhfg");
        reg2.clickOnSaveAccount();

        String url1= "https://petstore.octoperf.com/actions/Catalog.action";

        String url2 = wd.getCurrentUrl();

        Assert.assertNotEquals(url1,url2);

    }
}