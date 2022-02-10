package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderOptions {
    private WebDriver wd;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement cartButton;

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signInButton;

    @FindBy(xpath = "//a[contains(text(),'?')]")
    WebElement questionMark;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/form[1]/input[1]")
    WebElement searchInput;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/form[1]/input[2]")
    WebElement searchButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[3]")
    WebElement searchResult;

    public HeaderOptions(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(this.wd, this);
    }

    public void clickOnCartButton() {
        cartButton.click();
    }

    public void clickOnSignInButton() {
        signInButton.click();
    }

    public void clickOnQuestionMark() {
        questionMark.click();
    }

    public void enterSearchInput() {
        searchInput.clear();
        searchInput.sendKeys("Bulldog");
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public String getTexSearchResult() {
        return searchResult.getText();
    }
}
