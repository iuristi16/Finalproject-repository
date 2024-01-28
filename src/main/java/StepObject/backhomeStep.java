package StepObject;

import PageObject.backhomeObject;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static DataObject.CheckoutData.zipData;
import static DataObject.LoginData.correctnameData;
import static DataObject.LoginData.correctpasswordData;

public class backhomeStep extends backhomeObject {
    WebDriver driver;


    public backhomeStep (WebDriver driver1) {
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

    @Step (" ყველაზე ძვირიანი პროდუქტის დამატება")
    public  void addProdactAction () {
        driver.findElement(addProdact).click();

    }

    @Step ("your cart-ზე გადასვლა")
    public void addCartAction (){
        driver.findElement(addCart).click();
    }



    @Step ("checkout: მონაცემების შევსება - სახელი")

    public void checkoutfirstnameAction (String name){
        driver.findElement(checkOut).click();
        driver.findElement(fillName).sendKeys(name);
    }
    @Step ("checkout: მონაცემების შევსება - გვარი")

    public void checkoutlastnameAction (String lastname) {
        driver.findElement(fillLastName).sendKeys(lastname);
    }

    @Step("checkout: მონაცემების შევსება - zip code")
    public void zipcodeFiledAction (String zip) {
        driver.findElement(fillZipCode).sendKeys(zipData);

    }



    @Step ("გაგრძელება")
    public void continueAction (){
        driver.findElement(continue1).click();
    }

    @Step (" checkout-ის დასრულება")
    public void finishAction (){
        driver.findElement(finish).click();
    }


    @Step("მთავარ გვერდზე დაბრუნება")
    public void backhomeAction (){
        driver.findElement(backhome).click();
    }
}
