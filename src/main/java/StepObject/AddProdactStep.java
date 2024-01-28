package StepObject;

import PageObject.AddProdactobject;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static DataObject.LoginData.correctnameData;
import static DataObject.LoginData.correctpasswordData;

public class AddProdactStep  extends AddProdactobject {
    WebDriver driver;


    public AddProdactStep (WebDriver driver1) {
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

    @Step ("ყველაზე ძვირიანი პროდუქტის დამატება")
    public  void addProdactAction () {
        driver.findElement(addProdact).click();

    }

    @Step ("your cart-ზე გადასვლა")
    public void addCartAction (){
        driver.findElement(addCart).click();
    }
}





