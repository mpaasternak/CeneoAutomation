package pl.ceneo.pages.homePage;

import pl.ceneo.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "header__logo__link")
    WebElement mainPageLogo;

    public void clickOnMainPageIconButton(){
        mainPageLogo.click();
    }

    public String getMainPageTitle(WebDriver driver){
        return driver.getTitle();
    }

}
