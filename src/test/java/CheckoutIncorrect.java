import StepObject.CheckoutStep;
import Utls.BrowserAction;
import com.codeborne.selenide.selector.ByAttribute;
import com.codeborne.selenide.selector.ByTagAndText;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static DataObject.CheckoutData.correctfirstnameData;
import static DataObject.CheckoutData.correctlastnameData;


public class CheckoutIncorrect extends BrowserAction {

    public SoftAssert softAssertion;
    @BeforeTest

    public void setup() {
        this.softAssertion = new SoftAssert();
    }
    @Test
    @Description("აღნიშნული ტესტი ახორციელებს checkout-ს  მონაცემების არასრულად მითითებით, zip კოდის მითითების გარეშე")
    @Severity(SeverityLevel.CRITICAL)
    @Link("www.saucedemo.com")

    public void checkoutProdactinncorect () throws InterruptedException {
        CheckoutStep step2 = new CheckoutStep (driver);
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
        step2.addProdactAction();
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait3.until(ExpectedConditions.elementToBeClickable(By.className("shopping_cart_link")));

        step2.addCartAction();

        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"contents_wrapper\"]/div[2]")));

        step2.checkoutfirstnameAction(correctfirstnameData);
        step2.checkoutlastnameAction(correctlastnameData);
        step2.continueAction();
        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait5.until(ExpectedConditions.visibilityOfElementLocated(new ByTagAndText("h3","Error: Postal Code is required")));






        Thread.sleep(2000);

        String

                expectedResult = "Error: Postal Code is required",
                actualResult = driver.findElement(new ByTagAndText("h3","Error: Postal Code is required")).getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        softAssert.assertAll();

    }

    @AfterTest
    public void verifyAssertions1() {
        this.softAssertion.assertAll();
    }



}
