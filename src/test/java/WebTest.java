import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import po.YandexPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebTest {

    @Test
    void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
        var browser = new ChromeDriver();
        var yandexPage = new YandexPage(browser);
        browser.get("http://ya.ru");
        yandexPage.typeText("Букмекерская контора марафон");
        browser.findElement(By.cssSelector("button.button_theme_search")).click();
        assertEquals(15, browser.findElements(By.cssSelector("div.VanillaReact.OrganicTitle")).size());
        browser.close();
    }

    @Test
    void test2() {
        Configuration.browser = "opera";
        Selenide.open("http://ya.ru");
        $("input#text").sendKeys("Букмекерская контора марафон");
        $("button.button_theme_search").click();
        $$("div.VanillaReact.OrganicTitle").shouldBe(CollectionCondition.size(15));
    }
}
