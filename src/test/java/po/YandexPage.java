package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Суть PageObject pattern
// 1. На каждую страницу или виджет на странице или повторяющийся элемент создается свой class
public class YandexPage {

    private final WebDriver browser;

    public YandexPage(WebDriver browser) {
        this.browser = browser;
    }

    // 2. Каждому элементу на странице соответствует поле в классе
    private final By searchInput = By.cssSelector("input#text");

    //3. Действия над элементами это методы в классе
    public void typeText(String text) {
        browser.findElement(searchInput).sendKeys(text);
    }
}
