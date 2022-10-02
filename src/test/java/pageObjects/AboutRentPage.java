package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// страница формы "Про аренду"
public class AboutRentPage {

    private WebDriver driver;

    // когда привезти заказ
    private By dataField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div/input");
    //выпадающий календарь
    private By calenderData = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[7]");
    // срок аренды
    private By rentalPeriodField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]");
    //выпадающее поле со сроком аренды
    private By rentalPeriod = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]");
    // кнопка Заказать
    private By finalOrderButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]");
    //табличка подтверждения
    private By confirmationPlate = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]");
    // кнопка Да
    private By yesButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]");
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
