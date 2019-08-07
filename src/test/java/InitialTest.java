import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class InitialTest {

    WebDriver driver;
    Wait<WebDriver> wait;

    @Before
    public void setUp(){ //подготовка к проведению тестов
        initializeDriver();
        setPropertyWindow(driver);
        open("https://www.wrike.com/");
        wait = new WebDriverWait(driver, 5, 1000);
    }

    @After
    public void closeTab() { //закрытие браузера
        driver.close();
    }

    private WebDriver initializeDriver() { //инициализация драйвера
        ChromeOptions options = new ChromeOptions();
        options.setCapability("capability_name", "capability_value");
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        driver = new ChromeDriver(options);
        return driver;
    }

    private WebDriver setPropertyWindow(WebDriver driver) {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        return driver;
    }

    private void open(String url) {
        driver.get(url);
    }


}
