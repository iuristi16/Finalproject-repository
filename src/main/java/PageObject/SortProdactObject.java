package PageObject;

import com.codeborne.selenide.selector.ByAttribute;
import org.openqa.selenium.By;

public class SortProdactObject {

    protected By

            nameFiled = By.id("user-name"),
            passwordFiled = By.id("password"),
            LoginBotton = By.id("login-button"),



           SortProdact = By.className("product_sort_container"),
           HiloBotton = new ByAttribute("value", "hilo");
}
