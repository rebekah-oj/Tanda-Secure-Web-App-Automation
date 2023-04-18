
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.ParentModel;

import java.time.Duration;

public class Parent {

       private WebDriver driver;
       private ParentModel parentModel;

       private WebDriverWait wait;

       @BeforeTest
       public void setUp(){

      driver = new ChromeDriver();

      driver.get("https://secure-school-admin.netlify.app/school/parent");

      parentModel = new ParentModel(driver);


       }

       @Test
       public void loginTest(){
           parentModel.enterEmail("Olojadeborah37@gmail.com");
           parentModel.enterPassword("Lumaterm1");
           parentModel.clickLoginButton();
       }

       @Test
       public void parentCreationTest(){

           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

           parentModel.clickRegisterButton();
           parentModel.enterFirstName("Zed");
           parentModel.enterLastName("tolu");
           parentModel.enterEmailAddress("zed@gmail.com");
           parentModel.enterPhoneNumber("08067894578");
           parentModel.clickSelect();
           parentModel.selectRole();
           parentModel.createAccount();

           WebElement login = driver.findElement(By.id("login-success"));
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
           Assert.assertTrue(login.isDisplayed());

           //String actualMessage = "login successful";
           //String expectedMessage = "login successful";

           //Assert.assertEquals(actualMessage, expectedMessage);

           WebElement success = driver.findElement(By.id("success"));
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
           success.getText();

    }
}
