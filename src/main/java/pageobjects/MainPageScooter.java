package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

// это Главная страница сервиса Самокат
public class MainPageScooter {
    private WebDriver driver;
    //урл главной страницы
    private static final String MAIN_PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    //ЛОКАТОРЫ ВОПРОСОВ И ОТВЕТОВ
    // локатор 1го вопроса раскрывающегося списка
    private static final By FIRST_QUESTION_BUTTON = By.xpath("//div[text()='Сколько это стоит? И как оплатить?']");
    // ответ на 1 вопрос
    private static final By FIRST_ANSWER_FIELD = By.xpath("//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");
    // локатор 2го вопроса раскрывающегося списка
    private static final By SECOND_QUESTION_BUTTON = By.xpath("//div[text()='Хочу сразу несколько самокатов! Так можно?']");
    // ответ на 2 вопрос
    private static final By SECOND_ANSWER_FIELD = By.xpath("//p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");
    // локатор 3го вопроса раскрывающегося списка
    private static final By THIRD_QUESTION_BUTTON = By.xpath("//div[text()='Как рассчитывается время аренды?']");
    // ответ на 3 вопрос
    private static final By THIRD_ANSWER_FIELD = By.xpath("//p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");
    // локатор 4го вопроса раскрывающегося списка
    private static final By FOURTH_QUESTION_BUTTON = By.xpath("//div[text()='Можно ли заказать самокат прямо на сегодня?']");
    // ответ на 4 вопрос
    private static final By FOURTH_ANSWER_FIELD = By.xpath("//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");
    // локатор 5го вопроса раскрывающегося списка
    private static final By FIFTH_QUESTION_BUTTON = By.xpath("//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']");
    // ответ на 5 вопрос
    private static final By FIFTH_ANSWER_FIELD = By.xpath("//p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");
    // локатор 6го вопроса раскрывающегося списка
    private static final By SIXTH_QUESTION_BUTTON = By.xpath("//div[text()='Вы привозите зарядку вместе с самокатом?']");
    // ответ на 6 вопрос
    private static final By SIXTH_ANSWER_FIELD = By.xpath("//p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']");
    // локатор 7го вопроса раскрывающегося списка
    private static final By SEVENTH_QUESTION_BUTTON = By.xpath("//div[text()='Можно ли отменить заказ?']");
    // ответ на 7 вопрос
    private static final By SEVENTH_ANSWER_FIELD = By.xpath("//p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");
    // локатор 8го вопроса раскрывающегося списка
    private static final By EIGHTH_QUESTION_BUTTON = By.xpath("//div[text()='Я жизу за МКАДом, привезёте?']");
    // ответ на 8 вопрос
    private static final By EIGHTH_ANSWER_FIELD = By.xpath("//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");

    // локатор кнопки заказать верхней
    private static final By UPPER_ORDER_BUTTON = By.className("Button_Button__ra12g");
    // локатор кнопки заказать нижней
    private static final By MIDDLE_ORDER_BUTTON = By.xpath("//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");

    public MainPageScooter(WebDriver driver) {
        this.driver = driver;
    }
//метод, открывающий страницу
    public MainPageScooter open() {
        driver.get(MAIN_PAGE_URL);
        return this;
    }
//метод для скролла до области вопросов
    public MainPageScooter scrollToQuestions() {
       // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", QUESTIONS_PART);
        Object questionsPart = driver.findElement(By.cssSelector("div.Home_FourPart__1uthg"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", questionsPart);
        return this;
    }
    //клик на 1 вопрос
    public MainPageScooter clickFirstQuestionButton() {
        driver.findElement(FIRST_QUESTION_BUTTON).click();
        return new MainPageScooter(driver);
    }
    //метод, проверяющий, что текст первого ответа верный
    public boolean isFirstAnswerTextTrue() {
        return driver.findElement(FIRST_ANSWER_FIELD).isDisplayed();
    }
    //клик на 2 вопрос
    public MainPageScooter clickSecondQuestionButton() {
        driver.findElement(SECOND_QUESTION_BUTTON).click();
        return new MainPageScooter(driver);
    }
    //метод, проверяющий, что текст 2 ответа верный
    public boolean isSecondAnswerTextTrue() {
        return driver.findElement(SECOND_ANSWER_FIELD).isDisplayed();
    }
    //клик на 3 вопрос
    public MainPageScooter clickThirdQuestionButton() {
        driver.findElement(THIRD_QUESTION_BUTTON).click();
        return new MainPageScooter(driver);
    }
    //метод, проверяющий, что текст 3 ответа верный
    public boolean isThirdAnswerTextTrue() {
        return driver.findElement(THIRD_ANSWER_FIELD).isDisplayed();
    }
    //клик на 4 вопрос
    public MainPageScooter clickFourthQuestionButton() {
        driver.findElement(FOURTH_QUESTION_BUTTON).click();
        return new MainPageScooter(driver);
    }
    //метод, проверяющий, что текст 4 ответа верный
    public boolean isFourthAnswerTextTrue() {
        return driver.findElement(FOURTH_ANSWER_FIELD).isDisplayed();
    }
    //клик на 5 вопрос
    public MainPageScooter clickFifthQuestionButton() {
        driver.findElement(FIFTH_QUESTION_BUTTON).click();
        return new MainPageScooter(driver);
    }
    //метод, проверяющий, что текст 5 ответа верный
    public boolean isFifthAnswerTextTrue() {
        return driver.findElement(FIFTH_ANSWER_FIELD).isDisplayed();
    }
    //клик на 6 вопрос
    public MainPageScooter clickSixthQuestionButton() {
        driver.findElement(SIXTH_QUESTION_BUTTON).click();
        return new MainPageScooter(driver);
    }
    //метод, проверяющий, что текст 6 ответа верный
    public boolean isSixthAnswerTextTrue() {
        return driver.findElement(SIXTH_ANSWER_FIELD).isDisplayed();
    }
    //клик на 7 вопрос
    public MainPageScooter clickSeventhQuestionButton() {
        driver.findElement(SEVENTH_QUESTION_BUTTON).click();
        return new MainPageScooter(driver);
    }
    //метод, проверяющий, что текст 7 ответа верный
    public boolean isSeventhAnswerTextTrue() {
        return driver.findElement(SEVENTH_ANSWER_FIELD).isDisplayed();
    }
    //клик на 8 вопрос
    public MainPageScooter clickEighthQuestionButton() {
        driver.findElement(EIGHTH_QUESTION_BUTTON).click();
        return new MainPageScooter(driver);
    }
    //метод, проверяющий, что текст 8 ответа верный
    public boolean isEighthAnswerTextTrue() {
        return driver.findElement(EIGHTH_ANSWER_FIELD).isDisplayed();
    }

//клик на верхнюю кнопку Заказать
    public MainPageScooter clickUpperOrderButton() {
        driver.findElement(UPPER_ORDER_BUTTON).click();
        return new MainPageScooter(driver);
}
//клик на нижнюю кнопку Заказать
    public MainPageScooter clickMiddleOrderButton() {
        driver.findElement(MIDDLE_ORDER_BUTTON).click();
        return new MainPageScooter(driver);
}
//скролл до нижней кнопки Заказать
    public MainPageScooter scrollToMiddleOrderButton() {
    //((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", MIDDLE_ORDER_BUTTON);
        Object middleOrderButton = driver.findElement(MIDDLE_ORDER_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", middleOrderButton);
        return this;
}
}

