import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class BasePage {

    WebDriver clickOn(WebDriver driver, By locator) { //нажатие определенной кнопки
        driver.findElement(locator).click();
        return driver;
    }
}
