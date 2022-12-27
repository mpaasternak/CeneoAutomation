package pl.ceneo.pages.favouritePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pl.ceneo.utils.BasePage;

public class FavouritePage extends BasePage {
    public FavouritePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "asd")
    WebElement changeFavouriteList;

    @FindBy(className = "asd")
    WebElement saveFavouriteList;

    @FindBy(className = "asd")
    WebElement compareProductsFromFavouriteList;

    @FindBy(className = "asd")
    WebElement checkBundlePriceOfFavouriteList;

    @FindBy(className = "asd")
    WebElement showAllFavouriteLists;
}
