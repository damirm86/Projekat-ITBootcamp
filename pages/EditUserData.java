package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUserData {
    private WebDriver wd;

    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    WebElement myAccountButton;

    @FindBy(xpath= "//tbody/tr[1]/td[2]/input[1]")
    WebElement firstName;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement saveAccountInformationButton;

    @FindBy(xpath = "//a[contains(text(),'Sign Out')]")
    WebElement signOutButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]")
    WebElement welcomeMessage;

    public EditUserData(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(this.wd, this);
    }

    public void clickOnMyAccountButton() {
        myAccountButton.click();
    }

    public void enterFirstName() {
        firstName.clear();
        firstName.sendKeys("Borislav");
    }

    public void clickOnSaveAccountInformation() {
        saveAccountInformationButton.click();
    }

    public void clickOnSignOutButton() {
        signOutButton.click();
    }

    public String getTextWelcomeMessage() {
        return welcomeMessage.getText();
    }

    public String getTextFirstName() {
        return firstName.getText();
    }

}
