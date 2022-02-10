package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PetStoreMenu {

    private WebDriver wd;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/a[1]/img[1]")
    WebElement leftElementFish;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/a[2]/img[1]")
    WebElement leftElementDogs;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/a[3]/img[1]")
    WebElement leftElementCats;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/a[4]/img[1]")
    WebElement leftElementReptiles;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/a[5]/img[1]")
    WebElement leftElementBirds;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/a[1]/img[1]")
    WebElement topElementFish;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/a[2]/img[1]")
    WebElement topElementDogs;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/a[3]/img[1]")
    WebElement topElementReptiles;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/a[4]/img[1]")
    WebElement topElementCats;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/a[5]/img[1]")
    WebElement topElementBirds;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[2]")
    WebElement photoElementFish;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[3]")
    WebElement photoElementDog;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[4]")
    WebElement photoElementReptile;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[5]")
    WebElement photoElementCat;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/map[1]/area[6]")
    WebElement photoElementBird;


    public PetStoreMenu(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(this.wd, this);
    }


    public void clickOnLeftFish() {
        leftElementFish.click();
    }

    public void clickOnLeftDogs() {
        leftElementDogs.click();
    }

    public void clickOnLeftCats() {
        leftElementCats.click();
    }

    public void clickOnLeftReptiles() {
        leftElementReptiles.click();
    }

    public void clickOnLeftBirds() {
        leftElementBirds.click();
    }

    public void clickOnTopFish() {
        topElementFish.click();
    }

    public void clickOnTopDogs() {
        topElementDogs.click();
    }

    public void clickOnTopReptiles() {
        topElementReptiles.click();
    }

    public void clickOnTopCats() {
        topElementCats.click();
    }

    public void clickOnTopBirds() {
        topElementBirds.click();
    }

    public void clickOnPhotoFish() {
        photoElementFish.click();
    }

    public void clickOnPhotoDog() {
        photoElementDog.click();
    }

    public void clickOnPhotoReptile() {
        photoElementReptile.click();
    }

    public void clickOnPhotoCat() {
        photoElementCat.click();
    }

    public void clickOnPhotoBird() {
        photoElementBird.click();
    }

}


