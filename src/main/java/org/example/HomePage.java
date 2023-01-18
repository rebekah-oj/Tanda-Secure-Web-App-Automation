package org.example;

import org.openqa.selenium.WebDriver;

public class HomePage {
        protected WebDriver driver;

        public HomePage(WebDriver driver) {
            this.driver = driver;
            if (!driver.getTitle().equals("Secure App (School Portal) - Signin")) {
                throw new IllegalStateException("This is not Home Page of a logged in user," +
                        " current page is: " + driver.getCurrentUrl());
            }
        }

        public HomePage manageProfile() {
            // Page encapsulation to manage profile functionality
            return new HomePage(driver);
        }

}
