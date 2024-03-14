package lt.evaldas.pom.tests.mohito;

import lt.evaldas.pom.pages.mohito.RegistrationPage;
import lt.evaldas.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        RegistrationPage.open("https://www.mohito.com/lt/lt/customer/account/login/");
        RegistrationPage.clickOnCookiesButton();

    }

    @Test
    public void test() throws InterruptedException {
        String email = "evaldas@techzity.com";
        String expectedResult = "evaldas@techzity.com";
        String name = "Harry";
        String lastName = "Potter";
        String password = "Harry123";
        String actualResult = null;

        Thread.sleep(3000);
        RegistrationPage.clickOnButtonRegister();
        RegistrationPage.writeEmail(email);
        RegistrationPage.inputNameRegistration(name);
        RegistrationPage.inputLastNameRegistration(lastName);
        RegistrationPage.inputPasswordRegistration(password);
        RegistrationPage.clickButtonCreateAccountSubmit();


//    Assert.assertTrue(
//            actualResult.contains(expectedResult),
//            "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
//    );
    }
}
