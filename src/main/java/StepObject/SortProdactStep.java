package StepObject;

import PageObject.SortProdactObject;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static DataObject.LoginData.*;

public class SortProdactStep extends SortProdactObject {

    WebDriver driver;


    public SortProdactStep(WebDriver driver1) {
        driver = driver1;

    }

    @Step("სისტემაში დალოგინება")

    public  void NamefiledAction(){
        driver.findElement(nameFiled).sendKeys(correctnameData);

    }
    public  void PasswordfiledAction(){

        driver.findElement(passwordFiled).sendKeys(correctpasswordData);
    }

    public void  loginBotton () {
        driver.findElement(LoginBotton).sendKeys(Keys.ENTER);

    }
    @Step ("პროდუქტების დალაგება ფასის კლებადობით")
    public  void  SortprodactAction () {
        driver.findElement(SortProdact).click();
    }
    public  void  HiloAction (){
        driver.findElement(HiloBotton).click();
    }
}