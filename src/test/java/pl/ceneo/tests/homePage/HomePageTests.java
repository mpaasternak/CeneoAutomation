package pl.ceneo.tests.homePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pl.ceneo.pages.homePage.HomePage;
import pl.ceneo.tests.utils.BaseTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static pl.ceneo.pages.homePage.HomePageTitles.HOME_PAGE_TITLE;

public class HomePageTests extends BaseTest {
    HomePage homePage = new HomePage(driver);

    @Test
    public void mockTest() {
        System.out.println("Mock");
    }

    @Test
    public void checkPageTitleTest() {
        //act
        homePage.clickOnMainPageIconButton();

        //get
        String pageTitle = homePage.getMainPageTitle(driver);

        //verify
        assertThat(pageTitle).isEqualTo(HOME_PAGE_TITLE);
    }
}
