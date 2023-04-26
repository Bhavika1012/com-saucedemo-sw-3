package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Utilities extends BaseTest {
    /**
     * This is click element method
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    /**
     * This method will send Text to element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method is for Assertion
     */
    public void verifyFromElement(By by, String text) {
        String expectedMessage = text;
        WebElement actualElement = driver.findElement(by);
        String actualMessage = actualElement.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    public void verifyListOfElements(By by) {
        List<WebElement> a = driver.findElements(by);
        System.out.println("Total no of Products " + a.size());
    }
}
