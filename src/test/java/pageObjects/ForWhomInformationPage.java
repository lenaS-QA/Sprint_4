package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

// страница формы "Для кого самокат"
public class ForWhomInformationPage {

    private WebDriver driver;

    // поле имя
    private By nameField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
    // фамилия
    private By familyField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
    // адрес
    private By addressField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    // станция метро (выпад.список)
    private By metroStationField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input");
    // телефон
    private By telephoneField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");
    // кнопка Далее
    private By nextButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button");

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
