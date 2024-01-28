package PageObject;

import com.codeborne.selenide.selector.ByAttribute;
import org.openqa.selenium.By;

public class backhomeObject {
    protected By

            nameFiled = By.id("user-name"),
            passwordFiled = By.id("password"),
            LoginBotton = By.id("login-button"),



            SortProdact = By.className("product_sort_container"),
            HiloBotton = new ByAttribute("value", "hilo"),
            addProdact= By.id("add-to-cart-sauce-labs-fleece-jacket"),
            addCart = By.className("shopping_cart_link"),
            checkOut = By.id("checkout"),
            fillName = By.id("first-name"),
            fillLastName = By.id("last-name"),
            fillZipCode = By.id("postal-code"),
            continue1 = By.id("continue"),

            finish = By.id("finish"),

            backhome= By.id("back-to-products");



}
