package pl.ceneo.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverFactory {
    private static WebDriver driver;
    private static WebDriverWait wait;

    private DriverFactory() {
        // prevent instantiation
    }

    private static WebDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static WebDriver getChromeDriver() {
        if (driver == null) {
            driver = createChromeDriver();
        }
        return driver;
    }

    public static WebDriverWait getWebDriverWait() {
        if (wait == null){
            wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(5));
        }
        return wait;
    }
}
