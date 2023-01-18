package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    //declare driver
    private final WebDriver driver;

    //create the elements
    private final By email = By.id("email");
    private final By password = By.id("password");
    private final By loginButton = By.id("submit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;}

    /**
     * Login as valid user
     * @return HomePage object
     */
    public HomePage enterLoginInformation(String emailAddress, String passWord){
        driver.findElement(email).sendKeys(emailAddress);
        driver.findElement(password).sendKeys(passWord);
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }

}
