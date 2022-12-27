package pl.ceneo.pages.topMenuPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pl.ceneo.utils.BasePage;

public class TopMenuPage extends BasePage {

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "asd")
    WebElement searchBar;

    @FindBy(className = "asd")
    WebElement searchButton;

    @FindBy(className = "asd")
    WebElement basketButton;

    @FindBy(className = "asd")
    WebElement favouriteButton;

    @FindBy(className = "asd")
    WebElement loginButton;
}
