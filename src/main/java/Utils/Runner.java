package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Runner {
    @BeforeTest
    public static void setUp (){
        Configuration.browser="chrome";
        Configuration.browserSize="1920x1080";
        Configuration.baseUrl="https://www.google.com/";
        Selenide.open("https://www.google.com/");
        Selenide.open("https://www.adjarabet.am/en");
    }
    @AfterTest
    public static void tearDown (){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
    }
}