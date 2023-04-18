package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ParentModel {
    private final WebDriver driver;
    private final By email = By.id("email");
    private final By password = By.id("password");
    private final By submit = By.id("submit");
    private final By registerButton = By.id("register-parent");
    private final By firstNameInput = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By emailAddress = By.id("email");
    private final By phoneNumber = By.id("phoneNumber");
    private final By select = By.id("select-field");
    private final By role = By.id("mother");
    private final By createAccount = By.id("submit");

    private final By success = By.id("success");
    public ParentModel(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String emailLogin){
        driver.findElement(email).sendKeys(emailLogin);
    }

    public void enterPassword(String password1){
        driver.findElement(password).sendKeys(password1);
    }

    public void clickLoginButton(){
        driver.findElement(submit).click();
    }

    //parent creation
    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }

    public void enterFirstName(String firstname) {
        driver.findElement(firstNameInput).sendKeys(firstname);
    }

    public void enterLastName(String surname) {
        driver.findElement(lastName).sendKeys(surname);
    }

    public void enterEmailAddress(String email) {
        driver.findElement(emailAddress).sendKeys(email);
    }

    public void enterPhoneNumber(String phonenumber) {
       driver.findElement(phoneNumber).sendKeys(phonenumber);
    }

    public void clickSelect() {
        driver.findElement(select).click();
    }

    public void selectRole() {
        driver.findElement(role).click();
    }

    public void createAccount() {
       driver.findElement(createAccount).click();
    }

}
