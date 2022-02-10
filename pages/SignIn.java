package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
    private WebDriver wd;

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement sigInButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]")
    WebElement userName;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]")
    WebElement password;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement logInButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]")
    WebElement welcomeContent;

    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    WebElement myAccount;

    @FindBy(xpath = "//a[contains(text(),'Sign Out')]")
    WebElement signOutButton;

    public SignIn(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(this.wd, this);
    }


    public void clickOnSignIn() {
        sigInButton.click();
    }

    public void enterUserName(String user) {
        userName.clear();
        userName.sendKeys(user);
    }

    public void enterPassword(String pass) {
        password.clear();
        password.sendKeys(pass);
    }

    public void clickOnLoginButton() {
        logInButton.click();
    }

    public boolean welcomeContentIsDisplayed() {
        return welcomeContent.isDisplayed();
    }

    public String getTextMyAccount() {
        return myAccount.getText();
    }

    public void clickOnSignOut() {
        signOutButton.click();
    }

}
