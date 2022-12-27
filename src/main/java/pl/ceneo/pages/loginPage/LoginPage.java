package pl.ceneo.pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pl.ceneo.utils.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "asd")
    WebElement loginPanel;

    @FindBy(className = "asd")
    WebElement emailAddressField;

    @FindBy(className = "asd")
    WebElement passwordField;

    @FindBy(className = "asd")
    WebElement forgotPasswordButton;

    @FindBy(className = "asd")
    WebElement loginButton;

    @FindBy(className = "asd")
    WebElement loginWithGoogleButton;

    @FindBy(className = "asd")
    WebElement loginWithFacebookButton;

    @FindBy(className = "asd")
    WebElement loginWithAllegroButton;

    @FindBy(className = "asd")
    WebElement loginWithAppleButton;

    @FindBy(className = "asd")
    WebElement registerAccountButton;
}
