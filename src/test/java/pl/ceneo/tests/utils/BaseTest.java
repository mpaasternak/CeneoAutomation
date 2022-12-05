package pl.ceneo.tests.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import static pl.ceneo.utils.DriverFactory.getChromeDriver;
import static pl.ceneo.utils.DriverFactory.getWebDriverWait;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected final String BASE_URL = "https://www.ceneo.pl/";

    @BeforeSuite
    public void setup() {
            driver = getChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
            driver.manage().window().maximize();
            wait = getWebDriverWait();
    }

    @BeforeMethod
    public void goToHome(){
        driver.get(BASE_URL);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
