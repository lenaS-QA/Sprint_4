import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AboutRentPage;
import pageObjects.ForWhomInformationPage;
import pageObjects.MainPageScooter;

import static java.util.concurrent.TimeUnit.SECONDS;

public class OrderTests {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/elenasamsonova/Downloads/WebDriver/bin/chromedriver 2");
        driver = new ChromeDriver();
}

@Test
public void checkFinalOrderPlateWithUpperOrderButton() {
    driver.manage().timeouts().implicitlyWait(5, SECONDS);

    MainPageScooter mainPageScooter = new MainPageScooter(driver);
    mainPageScooter.open();
    mainPageScooter.clickUpperOrderButton();

    ForWhomInformationPage forWhomInformationPage = new ForWhomInformationPage(driver);
    forWhomInformationPage.fillNameField("Елена");
    forWhomInformationPage.fillFamilyField("Самсонова");
    forWhomInformationPage.fillAddressField("Парковая улица");
    forWhomInformationPage.fillMetroStationField();
    forWhomInformationPage.fillTelephoneField("89876543456");
    forWhomInformationPage.clickNextButton();
    driver.manage().timeouts().implicitlyWait(5, SECONDS);

    AboutRentPage aboutRentPage = new AboutRentPage(driver);
    aboutRentPage.fillDataField();
    aboutRentPage.fillPeriodField();
    aboutRentPage.clickFinalOrderButton();
    aboutRentPage.clickYesButton();

    Assert.assertTrue(
            "Expected Final Order Plate isn't visible", aboutRentPage.isFinalOrderPlateVisible());

    }

    @Test
    public void checkFinalOrderPlateWithMiddleOrderButton() {
        driver.manage().timeouts().implicitlyWait(5, SECONDS);

        MainPageScooter mainPageScooter = new MainPageScooter(driver);
        mainPageScooter.open();
        mainPageScooter.scrollToMiddleOrderButton();
        mainPageScooter.clickMiddleOrderButton();

        ForWhomInformationPage forWhomInformationPage = new ForWhomInformationPage(driver);
        forWhomInformationPage.fillNameField("Иван");
        forWhomInformationPage.fillFamilyField("Петров");
        forWhomInformationPage.fillAddressField("Нижний Новгород");
        forWhomInformationPage.fillMetroStationField();
        forWhomInformationPage.fillTelephoneField("898762345432");
        forWhomInformationPage.clickNextButton();
        driver.manage().timeouts().implicitlyWait(5, SECONDS);

        AboutRentPage aboutRentPage = new AboutRentPage(driver);
        aboutRentPage.fillDataField();
        aboutRentPage.fillPeriodField();
        aboutRentPage.clickFinalOrderButton();
        aboutRentPage.clickYesButton();

        Assert.assertTrue(
                "Expected Final Order Plate isn't visible", aboutRentPage.isFinalOrderPlateVisible());

    }


    @After
    public void cleanUp() {
        driver.quit();
    }
}
