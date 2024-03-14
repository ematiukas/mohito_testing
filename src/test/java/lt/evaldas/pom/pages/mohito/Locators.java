package lt.evaldas.pom.pages.mohito;

import org.openqa.selenium.By;

public class Locators {
    public static By inputEmail = By.xpath("//input[@id='email_id']");

    public static class Mohito {
        public class Registration {

            public static By buttonOnCookies = By.xpath("//button[@id='cookiebotDialogOkButton']");
            public static By buttonOnRegister = By.xpath("//button[@data-selen='register-select']");
            public static By inputEmail = By.xpath("//input[@id='email_id']");
            public static By inputName = By.xpath("//input[@id='firstname_id']");
            public static By inputLastName = By.xpath("//input[@id='lastname_id']");
            public static By inputPassword = By.xpath("//input[@id='password_id']");
            public static By buttonOnCreateAccountSubmit = By.xpath("//*[@data-selen='create-account-submit']");
        }
    }
}