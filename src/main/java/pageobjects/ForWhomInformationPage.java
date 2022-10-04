package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

// страница формы "Для кого самокат"
public class ForWhomInformationPage {
    private WebDriver driver;
    // поле имя
    private By nameField = By.xpath(".//input[@placeholder='* Имя']");
    // фамилия
    private By familyField = By.xpath(".//input[@placeholder='* Фамилия']");
    // адрес
    private By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // станция метро (выпад.список)
    private By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");
    // телефон
    private By telephoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    // кнопка Далее
    private By nextButton = By.xpath("//button[text()='Далее']");

    public ForWhomInformationPage(WebDriver driver) {
        this.driver = driver;
    }
    public ForWhomInformationPage fillNameField(String username) {
        driver.findElement(nameField).sendKeys(username);
        return this;
    }
    public ForWhomInformationPage fillFamilyField(String userFamily) {
        driver.findElement(familyField).sendKeys(userFamily);
        return this;
    }
    public ForWhomInformationPage fillAddressField(String userAddress) {
        driver.findElement(addressField).sendKeys(userAddress);
        return this;
    }
    public ForWhomInformationPage fillMetroStationField() {
        driver.findElement(metroStationField).click();
        driver.findElement(metroStationField).sendKeys(Keys.DOWN);
        driver.findElement(metroStationField).sendKeys(Keys.ENTER);
        return this;
    }
    public ForWhomInformationPage fillTelephoneField(String userTelephone) {
        driver.findElement(telephoneField).sendKeys(userTelephone);
        return this;
    }
    public ForWhomInformationPage clickNextButton() {
        driver.findElement(nextButton).click();
        return new ForWhomInformationPage(driver);
    }
}
