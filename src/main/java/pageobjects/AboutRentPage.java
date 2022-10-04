package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// страница формы "Про аренду"
public class AboutRentPage {
    private WebDriver driver;
    // когда привезти заказ
    private By dataField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //выпадающий календарь
    private By calenderData = By.xpath("//div[text()='31']");
    // срок аренды
    private By rentalPeriodField = By.xpath("//div[text()='* Срок аренды']");
    //выпадающее поле со сроком аренды
    private By rentalPeriod = By.xpath("//div[text()='двое суток']");
    // кнопка Заказать
    private By finalOrderButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    // кнопка Да
    private By yesButton = By.xpath("//button[text()='Да']");
    //плашка с подтверждением
    private By finalOrderPlate = By.cssSelector("div.Order_Modal__YZ-d3");

    public AboutRentPage(WebDriver driver) {
        this.driver = driver;
    }
    public AboutRentPage fillDataField() {
        driver.findElement(dataField).click();
        driver.findElement(calenderData).click();
        return this;
    }
    public AboutRentPage fillPeriodField()  {
        driver.findElement(rentalPeriodField).click();
        driver.findElement(rentalPeriod).click();
        return this;
    }
    public AboutRentPage clickFinalOrderButton() {
        driver.findElement(finalOrderButton).click();
        return new AboutRentPage(driver);
    }
    public AboutRentPage clickYesButton() {
        driver.findElement(yesButton).click();
        return new AboutRentPage(driver);
    }
    public boolean isFinalOrderPlateVisible() {
        return driver.findElement(finalOrderPlate).isDisplayed();
    }
}
