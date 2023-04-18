package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent {
    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

    }

    public void login() {

        driver.get("https://secure-school-admin.netlify.app/school/parent");

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement submit = driver.findElement(By.id("submit"));

        email.sendKeys("olojadeborah37@gmail.com");
        password.sendKeys("Lumaterm1");
        submit.click();
    }

    public void createNewParent(){

        driver.navigate().to("https://secure-school-admin.netlify.app/school/parent");
        
        WebElement registerButton = driver.findElement(By.id("register-parent"));
        WebElement uploadImage = driver.findElement(By.id("polaroid"));
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement emailAddress = driver.findElement(By.id("email"));
        WebElement phoneNumber = driver.findElement(By.id("phoneNumber"));
        WebElement select = driver.findElement(By.id("select-field"));
        WebElement role = driver.findElement(By.cssSelector("option[value*='Mother']"));
        WebElement createAccount = driver.findElement(By.id("submit"));


        registerButton.click();
        uploadImage.sendKeys("IMG_4662.PNG");
        firstName.sendKeys("Obakam");
        lastName.sendKeys("Tom");
        emailAddress.sendKeys("obakamtom@gmail.com");
        phoneNumber.sendKeys("08123456789");
        select.click();
        role.click();
        createAccount.click();
    }
}
