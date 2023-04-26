package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utilities;

public class LoginTest extends Utilities {
    String baseUrl = "https://www.saucedemo.com/ ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter “standard_user” username
        sendTextToElement(By.id("user-name"), "standard_user");
        //Enter “secret_sauce” password
        sendTextToElement(By.id("password"), "secret_sauce");
        //click on login button
        clickOnElement(By.id("login-button"));
        //verify the text products
        verifyFromElement(By.xpath("//span[@class='title']"), "Products");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        //enter username
        sendTextToElement(By.id("user-name"), "standard_user");
        // enter password
        sendTextToElement(By.id("password"), "secret_sauce");
        // click on login button
        clickOnElement(By.id("login-button"));
        // verify the 6 products
        verifyListOfElements(By.className("inventory_item"));

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
