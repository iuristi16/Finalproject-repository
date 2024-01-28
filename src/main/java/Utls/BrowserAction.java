package Utls;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserAction {

    public static WebDriver driver;
   // public  BrowserAction(){



    @BeforeMethod(description = "აქ ხდება Chrome ბრაუზერის გახსნა")

    public  void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");

    }

    @AfterMethod(description = "აქ ხდება Chrome ბრაუზერის დახურვა")
    public static  void closeBrowser(){
       takeScreenshot();
       driver.quit();
    }


    @Attachment(
            value = "Screenshot",
            type = "image/png"
    )
    public static byte[] takeScreenshot() {
        return (byte[])((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}


