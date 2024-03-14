package lt.evaldas.pom.pages.mohito;

import lt.evaldas.pom.pages.Common;
import org.openqa.selenium.By;

public class RegistrationPage {
    public static void open(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void clickOnCookiesButton() {
        Common.clickOnElement(Locators.Mohito.Registration.buttonOnCookies);
    }

    public static void clickOnButtonRegister() {
        Common.clickOnElement(Locators.Mohito.Registration.buttonOnRegister);
    }

    public static void writeEmail(String email) {
        Common.sendKeysToElement(Locators.Mohito.Registration.inputEmail, email);
    }

    public static void inputNameRegistration(String name) {
        Common.sendKeysToElement(Locators.Mohito.Registration.inputName, name);
    }

    public static void inputLastNameRegistration(String lastName) {
        Common.sendKeysToElement(Locators.Mohito.Registration.inputLastName, lastName);
    }

    public static void inputPasswordRegistration(String password) {
        Common.sendKeysToElement(Locators.Mohito.Registration.inputPassword, password);
    }

    public static void clickButtonCreateAccountSubmit() {
        Common.clickOnElement(Locators.Mohito.Registration.buttonOnCreateAccountSubmit);
    }
}
