import StepObject.SortProdactStep;
import Utls.BrowserAction;
import com.codeborne.selenide.selector.ByAttribute;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Sort extends BrowserAction {

    public SoftAssert softAssertion;

    @BeforeTest
    public void setup() {
        this.softAssertion = new SoftAssert();

    }




    @Test
    @Description("აღნიშნული ტესტი პროდუქტებს ალაგებს ფასის კლებადობის მიხედვით")
    public void SortProdact() {
        SortProdactStep step2 = new SortProdactStep(driver);
        step2.NamefiledAction();
        step2.PasswordfiledAction();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        step2.loginBotton();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_button_container")));

        step2.SortprodactAction();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait2.until(ExpectedConditions.elementToBeClickable(new ByAttribute("value", "hilo")));

        step2.HiloAction();





        String

                expectedResult = "Sauce Labs Fleece Jacket",
                actualResult = driver.findElement(By.id("item_5_title_link")).getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        softAssert.assertAll();
    }


    @AfterTest
    public void verifyAssertions1() {
        this.softAssertion.assertAll();

    }
}








