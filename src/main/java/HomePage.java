import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class HomePage extends BasePage{

    private By getStartedButton = By.xpath("//div[@class=\"r\"]//button[@class=\"wg-header__free-trial-button wg-btn wg-btn--green\"]");
    private By inputForm = By.xpath("//*[@id=\"modal-pro\"]/form/label[1]/input");
    By createAccButton= By.xpath("//*[@id=\"modal-pro\"]/form/label[2]/button");

    private WebDriver inputEmail(WebDriver driver, By locator, String text) { //ввод почты
        driver.findElement(locator).sendKeys(text);
        return driver;
    }

    void getFreeTrial(WebDriver driver){ //осуществление шагов по переходу на вторую страницу
        clickOn(driver, getStartedButton);
        inputEmail(driver, inputForm, "abcdefwpt@wriketask.qaa");
        clickOn(driver, createAccButton);
    }
}
