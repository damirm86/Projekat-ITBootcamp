package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PetStoreMenu;

import java.io.IOException;
import java.time.Duration;

public class TestPageStoreMenu {
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

    @Test
    public void FishTest() {

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        PetStoreMenu psm1 = new PetStoreMenu(wd);

        psm1.clickOnLeftFish();
        String fishLeftUrl = wd.getCurrentUrl();

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        psm1.clickOnTopFish();
        String fishTopUrl = wd.getCurrentUrl();

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        psm1.clickOnPhotoFish();
        String fishPhotoUrl = wd.getCurrentUrl();

        SoftAssert sa = new SoftAssert();

        if (fishLeftUrl.contains("jsessionid") || fishTopUrl.contains("jsessionid") || fishPhotoUrl.contains("jsessionid")) {
            if (fishLeftUrl.contains("FISH") && fishTopUrl.contains("FISH") && fishPhotoUrl.contains("FISH")) {
                fishLeftUrl = "";
                fishTopUrl = "";
                fishPhotoUrl = "";
            }
        }

        sa.assertEquals(fishLeftUrl, fishTopUrl, fishPhotoUrl);
        sa.assertAll();
    }

    @Test
    public void DogsTest() {

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        PetStoreMenu psm1 = new PetStoreMenu(wd);

        psm1.clickOnLeftDogs();
        String dogsLeftUrl = wd.getCurrentUrl();

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        psm1.clickOnTopDogs();
        String dogsTopUrl = wd.getCurrentUrl();

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        psm1.clickOnPhotoDog();
        String dogPhotoUrl = wd.getCurrentUrl();

        SoftAssert sa = new SoftAssert();

        if (dogsLeftUrl.contains("jsessionid") || dogsTopUrl.contains("jsessionid") || dogPhotoUrl.contains("jsessionid")) {
            if (dogsLeftUrl.contains("DOGS") && dogsTopUrl.contains("DOGS") && dogPhotoUrl.contains("DOGS")) {
                dogsLeftUrl = "";
                dogsTopUrl = "";
                dogPhotoUrl = "";
            }
        }

        sa.assertEquals(dogsLeftUrl, dogsTopUrl, dogPhotoUrl);
        sa.assertAll();
    }

    @Test
    public void CatsTest() {

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        PetStoreMenu psm1 = new PetStoreMenu(wd);

        psm1.clickOnLeftCats();
        String catsLeftUrl = wd.getCurrentUrl();

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        psm1.clickOnTopCats();
        String catsTopUrl = wd.getCurrentUrl();

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        psm1.clickOnPhotoCat();
        String catPhotoUrl = wd.getCurrentUrl();

        SoftAssert sa = new SoftAssert();

        if (catsLeftUrl.contains("jsessionid") || catsTopUrl.contains("jsessionid") || catPhotoUrl.contains("jsessionid")) {
            if (catsLeftUrl.contains("CATS") && catsTopUrl.contains("CATS") && catPhotoUrl.contains("CATS")) {
                catsLeftUrl = "";
                catsTopUrl = "";
                catPhotoUrl = "";
            }
        }

        sa.assertEquals(catsLeftUrl, catsTopUrl, catPhotoUrl);
        sa.assertAll();
    }

    @Test
    public void ReptilesTest() {

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        PetStoreMenu psm1 = new PetStoreMenu(wd);

        psm1.clickOnLeftReptiles();
        String reptilesLeftUrl = wd.getCurrentUrl();

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        psm1.clickOnTopReptiles();
        String reptilesTopUrl = wd.getCurrentUrl();

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        psm1.clickOnPhotoReptile();
        String reptilePhotoUrl = wd.getCurrentUrl();

        SoftAssert sa = new SoftAssert();

        if (reptilesLeftUrl.contains("jsessionid") || reptilesTopUrl.contains("jsessionid") || reptilePhotoUrl.contains("jsessionid")) {
            if (reptilesLeftUrl.contains("REPTILES") && reptilesTopUrl.contains("REPTILES") && reptilePhotoUrl.contains("REPTILES")) {
                reptilesLeftUrl = "";
                reptilesTopUrl = "";
                reptilePhotoUrl = "";
            }
        }

        sa.assertEquals(reptilesLeftUrl, reptilesTopUrl, reptilePhotoUrl);
        sa.assertAll();
    }

    @Test
    public void BirdsTest() {

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        PetStoreMenu psm1 = new PetStoreMenu(wd);

        psm1.clickOnLeftBirds();
        String birdsLeftUrl = wd.getCurrentUrl();

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        psm1.clickOnTopBirds();
        String birdsTopUrl = wd.getCurrentUrl();

        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        wd.manage().window().maximize();

        psm1.clickOnPhotoBird();
        String birdPhotoUrl = wd.getCurrentUrl();

        SoftAssert sa = new SoftAssert();

        if (birdsLeftUrl.contains("jsessionid") || birdsTopUrl.contains("jsessionid") || birdPhotoUrl.contains("jsessionid")) {
            if (birdsLeftUrl.contains("BIRDS") && birdsTopUrl.contains("BIRDS") && birdPhotoUrl.contains("BIRDS")) {
                birdsLeftUrl = "";
                birdsTopUrl = "";
                birdPhotoUrl = "";
            }
        }

        sa.assertEquals(birdsLeftUrl, birdsTopUrl, birdPhotoUrl);
        sa.assertAll();
    }

}








