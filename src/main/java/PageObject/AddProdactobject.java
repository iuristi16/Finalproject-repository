package PageObject;

import com.codeborne.selenide.selector.ByAttribute;
import org.openqa.selenium.By;

public class AddProdactobject {

    protected By

            nameFiled = By.id("user-name"),
            passwordFiled = By.id("password"),
            LoginBotton = By.id("login-button"),



    SortProdact = By.className("product_sort_container"),
            HiloBotton = new ByAttribute("value", "hilo"),
            addProdact= By.id("add-to-cart-sauce-labs-fleece-jacket"),
            addCart = By.className("shopping_cart_link");

}
