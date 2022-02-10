package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterNewAccount {

    private WebDriver wd;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
    WebElement userID;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")
    WebElement newPassword;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")
    WebElement repeatPassword;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[1]/td[2]/input[1]")
    WebElement firstName;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[2]/td[2]/input[1]")
    WebElement lastName;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[3]/td[2]/input[1]")
    WebElement email;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[4]/td[2]/input[1]")
    WebElement phone;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[5]/td[2]/input[1]")
    WebElement address1;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[6]/td[2]/input[1]")
    WebElement address2;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[7]/td[2]/input[1]")
    WebElement city;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[8]/td[2]/input[1]")
    WebElement state;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[9]/td[2]/input[1]")
    WebElement zipCode;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[10]/td[2]/input[1]")
    WebElement country;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement saveAccount;

    public RegisterNewAccount(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(this.wd, this);
    }

    public void enterUserID(String id) {
        this.userID.clear();
        this.userID.sendKeys(id);
    }

    public void enterNewPassword(String pass) {
        this.newPassword.clear();
        this.newPassword.sendKeys(pass);
    }

    public void enterRepeatPassword(String rpass) {
        this.repeatPassword.clear();
        this.repeatPassword.sendKeys(rpass);
    }

    public void enterFirstName(String fname) {
        this.firstName.clear();
        this.firstName.sendKeys(fname);
    }

    public void enterLastName(String lname) {
        this.lastName.clear();
        this.lastName.sendKeys(lname);
    }

    public void enterEmail(String mail) {
        this.email.clear();
        this.email.sendKeys(mail);
    }

    public void enterPhone(String ph) {
        this.phone.clear();
        this.phone.sendKeys(ph);
    }

    public void enterAddress1(String add1) {
        this.address1.clear();
        this.address1.sendKeys(add1);
    }

    public void enterAddress2(String add2) {
        this.address2.clear();
        this.address2.sendKeys(add2);
    }

    public void enterCity(String ci) {
        this.city.clear();
        this.city.sendKeys(ci);
    }

    public void enterState(String st) {
        this.state.clear();
        this.state.sendKeys(st);
    }

    public void enterZipCode(String zip) {
        this.zipCode.clear();
        this.zipCode.sendKeys(zip);
    }

    public void enterCountry(String cou) {
        this.country.clear();
        this.country.sendKeys(cou);
    }

    public void clickOnSaveAccount() {
        this.saveAccount.click();
    }

}






