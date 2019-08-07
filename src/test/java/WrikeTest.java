import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WrikeTest extends InitialTest {

    @Test
    public void clickLogIn() { //проверка перехода на следующую страницу
        HomePage homePage = new HomePage();
        homePage.getFreeTrial(driver);

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(homePage.createAccButton))); //ожидание загрузки страницы

        assertTrue("https://www.wrike.com/resend/".equals(driver.getCurrentUrl()) ||
                "https://www.wrike.com/resend-va/".equals(driver.getCurrentUrl()));
    }

    @Test
    public void qaSubmit(){ //проверка успешной отправки ответов
        HomePage homePage = new HomePage();
        homePage.getFreeTrial(driver);

        QAPage qaPage = new QAPage(); //заполнение и отправка ответов
        qaPage.clickOn(driver, qaPage.firstQ);
        qaPage.clickOn(driver, qaPage.secondQ);
        qaPage.clickOn(driver, qaPage.thirdQ);
        qaPage.clickOn(driver, qaPage.submitButton);

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(qaPage.surveyForm))); //ожидание отправки ответов

        assertEquals(true, driver.findElement(qaPage.successSubmit).isDisplayed());
    }

    @Test
    public void correctTwitterIcon(){ //проверка корректной ссылки и изображения кнопки "Twitter"
        HomePage homePage = new HomePage();
        homePage.getFreeTrial(driver);

        String expectedTwitterUrl = "twitter.com/wrike"; //ожидаемое значение ссылки
        String expectedTwitterIcon = "/content/themes/wrike/dist/img/sprite/vector/footer-icons.symbol.svg?v2#twitter"; //ожидаемое значение изобраения

        QAPage qaPage = new QAPage();
        assertTrue(expectedTwitterUrl.equals(driver.findElement(qaPage.twitterUrl).getAttribute("href")) ||
        expectedTwitterIcon.equals(driver.findElement(qaPage.twitterIcon).getAttribute("xlink:href")));
    }

}
