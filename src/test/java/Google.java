import Utils.Runner;
import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Google extends Runner {
    @Test (priority = 0)
    public void mymethod12() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        open("https://www.google.com/");
        $(".gLFyf").setValue("Tamo");
        Assert.assertEquals($(".gLFyf").getValue(), "Tamo");
        Assert.assertNotEquals($(".gLFyf").getValue(), "Tako");

   /* @Test (priority = 1)
            public void test111() {
            Faker faker = new Faker();
            String fak = faker.number().digits(5);
            System.out.println(fak);
        }

        /*@Test (priority = 2)
        // public void assertTest ()

            Configuration.browser = "chrome"
            open("https://www.google.com/");

            SoftAssert soft = new SoftAssert();
            $(byName("q")).setValue("other");
            soft.assertEquals($(byName("q")).getValue(), "her");
            $(byName("q")).setValue("Mari");
            Thread.sleep(3000);

            soft.assertAll();*/

    }
}
