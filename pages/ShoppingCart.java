package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
    private WebDriver wd;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/a[1]/img[1]")
    WebElement fishGroup;

    @FindBy(xpath = "//a[contains(text(),'FI-SW-01')]")
    WebElement angelfish;

    @FindBy(xpath = "//a[contains(text(),'EST-1')]")
    WebElement largeAngelfish;

    @FindBy(xpath = "//a[contains(text(),'Add to Cart')]")
    WebElement addToCartButton;

    @FindBy(xpath = "//tbody/tr[2]/td[5]/input[1]")
    WebElement quantity;

    @FindBy(xpath = "//tbody/tr[3]/td[1]/input[1]")
    WebElement updateCartButton;

    @FindBy(xpath = "//a[contains(text(),'Return to Main Menu')]")
    WebElement returnToMainMenu;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/a[4]/img[1]")
    WebElement reptilesGroup;

    @FindBy(xpath = "//a[contains(text(),'RP-LI-02')]")
    WebElement iguana;

    @FindBy(xpath = "//a[contains(text(),'Proceed to Checkout')]")
    WebElement proceedToCheckout;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/ul[1]/li[1]")
    WebElement contentMessage;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement shoppingCartButton;

    @FindBy(xpath ="/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement continueButton;

    @FindBy(xpath = "//a[contains(text(),'Confirm')]")
    WebElement confirmButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/ul[1]/li[1]")
    WebElement message;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/th[1]")
    WebElement orderInformation;

    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    WebElement myAccountButton;

    @FindBy(xpath = "//a[contains(text(),'My Orders')]")
    WebElement myOrdersButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/table[1]/tbody[1]")
    WebElement orderTable;

    public ShoppingCart(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(this.wd, this);
    }

    public void clickOnFishGroup() {
        fishGroup.click();
    }

    public void clickOnAngelfish() {
        angelfish.click();
    }

    public void clickOnLargeAngelfish() {
        largeAngelfish.click();
    }

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public void enterQuantity() {
        quantity.clear();
        quantity.sendKeys("2");
    }

    public void clickOnUpdateCart() {
        updateCartButton.click();
    }

    public void clickOnReturnToMainMenu() {
        returnToMainMenu.click();
    }

    public void clickOnReptilesGroup() {
        reptilesGroup.click();
    }

    public void clickOnIguana() {
        iguana.click();
    }

    public void clickOnProceedToCheckout() {
        proceedToCheckout.click();
    }

    public String getTextContentMessage() {
        return contentMessage.getText();
    }

    public void clickOnShoppingCartButton() {
        shoppingCartButton.click();
    }

    public void clickOnContinueButton() {
        continueButton.click();
    }

    public void clickOnConfirmButton() {
        confirmButton.click();
    }

    public void clickOnMyAccountButton() {
        myAccountButton.click();
    }

    public void clickOnMyOrdersButton() {
        myOrdersButton.click();
    }

    public String getTextMessageAboutOrder() {
        return message.getText();
    }

    public String getTextOrderInformation() {
        return orderInformation.getText();
    }

    public String getTextOrderTable() {
        return orderTable.getText();
    }

}
