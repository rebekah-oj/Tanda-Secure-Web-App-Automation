import org.example.HomePage;
import org.example.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

     WebDriver driver = new ChromeDriver();
   // driver.manage().window().fullscreen();

    @Test
    public void validLogin(){

        driver.get("https://secure-school-admin.netlify.app/login");
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.enterLoginInformation("olojadeborah37@gmail.com",  "Lumaterm1");

        String actualTitle = "Secure App (School Portal) - Signin";

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String expectedTitle= driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Test
    public void invalidLogin()
    {
        driver.get("https://secure-school-admin.netlify.app/login");
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.enterLoginInformation("John Does",  "ThisIsNotAPassword");
       // String bodyText = driver.findElement(By.className("input-message mt-2 animate-shake font-secureSchool text-sm text-red-700")).getText();
       // Assert.assertTrue(true, String.valueOf(bodyText.contains("Invalid email")));
    }
}
