import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTest {

    @Test
    void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        var browser = new ChromeDriver();
        browser.get("http://ya.ru");
        browser.findElement(By.cssSelector("input#text")).sendKeys("Букмекерская контора марафон");
        browser.findElement(By.cssSelector("button.button_theme_search")).click();
        browser.close();
    }
}
