package PageObject;

import com.codeborne.selenide.selector.ByAttribute;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static DataObject.LoginData.correctnameData;
import static DataObject.LoginData.correctpasswordData;

public class LogoutObject  {

    protected By

        nameFiled = By.id("user-name"),
        passwordFiled = By.id("password"),
        LoginBotton = By.id("login-button"),



    SortProdact = By.className("product_sort_container"),
            HiloBotton = new ByAttribute("value", "hilo"),
            addProdact= addProdact= By.id("add-to-cart-sauce-labs-fleece-jacket"),
            addCart = By.className("shopping_cart_link"),
            checkOut = By.id("checkout"),
            fillName = By.id("first-name"),
            fillLastName = By.id("last-name"),
            fillZipCode = By.id("postal-code"),
            continue1 = By.name("continue"),

            finish = By.id("finish"),

            backhome= By.id("back-to-products"),
            burger = By.id("react-burger-menu-btn"),
            logOut= By.id("logout_sidebar_link");


}
