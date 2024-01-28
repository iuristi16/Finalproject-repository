import StepObject.LoginStep;
import Utls.BrowserAction;
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

import javax.print.attribute.Attribute;
import java.time.Duration;

import static DataObject.LoginData.*;


public class Login extends BrowserAction {
    public SoftAssert softAssertion;

    @BeforeTest
    public void setup() {
        this.softAssertion = new SoftAssert();
    }



        @Test
        @Description("აღნიშნული ტესტი ახორციელებს სისტემაში დალოგინებას სწორი მონაცემებით")
        @Severity(SeverityLevel.CRITICAL)
        @Link("www.saucedemo.com")

        public void LoginCorrectData () throws InterruptedException {
            LoginStep step2 = new LoginStep(driver);
            step2.nameFiledAction(correctnameData);
            step2.passwordFiledAction(correctpasswordData);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
            wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
            step2.loginBotton();
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_button_container")));

            Thread.sleep(2000);

            String



                    expectedResult = "https://www.saucedemo.com/inventory.html",
                    actualResult = driver.getCurrentUrl();

            SoftAssert softAssert= new SoftAssert();
            softAssert.assertEquals(actualResult,expectedResult);
            softAssert.assertAll();
        }


        @Test
        @Description("აღნიშნული ტესტი ახორციელებს სისტემაში დალოგინებას არასწორი მონაცემებით")
        @Link("www.saucedemo.com")
        public void LoginInCorrectData () throws InterruptedException {
            LoginStep step2 = new LoginStep(driver);
            step2.nameFiledAction(incorrectnameData);
            step2.passwordFiledAction(incorrectpasswordData);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
            wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
            step2.loginBotton();
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));



            Thread.sleep(2000);


            String

                    expectedResult = "Epic sadface: Username and password do not match any user in this service",
                    actualResult = driver.findElement(By.tagName("h3")).getText();

            SoftAssert softAssert= new SoftAssert();
            softAssert.assertEquals(actualResult,expectedResult);
            softAssert.assertAll();
        }


    @AfterTest
    public void verifyAssertions1() {
        this.softAssertion.assertAll();
    }

    }





