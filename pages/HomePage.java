package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver wd;

    @FindBy(xpath = "//a[contains(text(),'Enter the Store')]")
    WebElement enterTheStore;

    @FindBy(xpath = "//body/div[@id='Header']/div[@id='Logo']/div[@id='LogoContent']/a[1]/img[1]")
    WebElement toplLogo;


    public HomePage(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(this.wd, this);
    }

    public void clickOnEnterTheStore() {
        enterTheStore.click();
    }

    public boolean topLogoIsDisplayed() {
        return toplLogo.isDisplayed();
    }
}

