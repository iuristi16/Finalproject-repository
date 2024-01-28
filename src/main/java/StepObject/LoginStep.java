package StepObject;

import PageObject.LoginObject;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginStep extends LoginObject {
    WebDriver driver;

    public LoginStep(WebDriver driver1){
        driver=driver1;

    }
    @Step("name ჩაწერა")

    public  void nameFiledAction(String name){

        driver.findElement(nameFiled).sendKeys(name);
    }
    @Step ("password ჩაწერა")
    public  void  passwordFiledAction (String password){

        driver.findElement(passwordFiled).sendKeys(password);
    }

    @Step ("SignupBotton ღილაკზე დაჭერა")
    public void  loginBotton (){
        driver.findElement(LoginBotton).sendKeys(Keys.ENTER);
    }
}

