import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.MainPageScooter;
import org.junit.Assert;

import static java.util.concurrent.TimeUnit.SECONDS;


public class QuestionsTests {
 private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/elenasamsonova/Downloads/WebDriver/bin/chromedriver 2");
        driver = new ChromeDriver();
    }

    @Test
   public void checkAnswer1() {
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        MainPageScooter mainPageScooter = new MainPageScooter(driver);
        mainPageScooter.open();
        mainPageScooter.scrollToQuestions();
        mainPageScooter.clickFirstQuestionButton();
        Assert.assertTrue("First answer isn't shown", mainPageScooter.isFirstAnswerTextTrue());
    }
    @Test
    public void checkAnswer2() {
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        MainPageScooter mainPageScooter = new MainPageScooter(driver);
        mainPageScooter.open();
        mainPageScooter.scrollToQuestions();
        mainPageScooter.clickSecondQuestionButton();
        Assert.assertTrue("Second answer isn't shown", mainPageScooter.isSecondAnswerTextTrue());
    }
    @Test
    public void checkAnswer3() {
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        MainPageScooter mainPageScooter = new MainPageScooter(driver);
        mainPageScooter.open();
        mainPageScooter.scrollToQuestions();
        mainPageScooter.clickThirdQuestionButton();
        Assert.assertTrue("Third answer isn't shown", mainPageScooter.isThirdAnswerTextTrue());
    }
    @Test
    public void checkAnswer4() {
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        MainPageScooter mainPageScooter = new MainPageScooter(driver);
        mainPageScooter.open();
        mainPageScooter.scrollToQuestions();
        mainPageScooter.clickFourthQuestionButton();
        Assert.assertTrue("Fourth answer isn't shown", mainPageScooter.isFourthAnswerTextTrue());
    }
    @Test
    public void checkAnswer5() {
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        MainPageScooter mainPageScooter = new MainPageScooter(driver);
        mainPageScooter.open();
        mainPageScooter.scrollToQuestions();
        mainPageScooter.clickFifthQuestionButton();
        Assert.assertTrue("Fifth answer isn't shown", mainPageScooter.isFifthAnswerTextTrue());
    }
    @Test
    public void checkAnswer6() {
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        MainPageScooter mainPageScooter = new MainPageScooter(driver);
        mainPageScooter.open();
        mainPageScooter.scrollToQuestions();
        mainPageScooter.clickSixthQuestionButton();
        Assert.assertTrue("Sixth answer isn't shown", mainPageScooter.isSixthAnswerTextTrue());
    }
    @Test
    public void checkAnswer7() {
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        MainPageScooter mainPageScooter = new MainPageScooter(driver);
        mainPageScooter.open();
        mainPageScooter.scrollToQuestions();
        mainPageScooter.clickSeventhQuestionButton();
        Assert.assertTrue("Feventh answer isn't shown", mainPageScooter.isSeventhAnswerTextTrue());
    }
    @Test
    public void checkAnswer8() {
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        MainPageScooter mainPageScooter = new MainPageScooter(driver);
        mainPageScooter.open();
        mainPageScooter.scrollToQuestions();
        mainPageScooter.clickEighthQuestionButton();
        Assert.assertTrue("Eighth answer isn't shown", mainPageScooter.isEighthAnswerTextTrue());
    }
    @After
    public void cleanUp() {
        driver.quit();
    }
}


