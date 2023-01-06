package accordion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.praktikum.MainPage;

import static org.junit.Assert.assertEquals;

public class AccordionTest {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    //Сколько это стоит? И как оплатить?
    @Test
    public void testAccordionHeading0() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickAccordionHeading0();
        var expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        var actual = mainPage.getTextAccordionPanel0();
        assertEquals("", expected, actual);
    }

    //Хочу сразу несколько самокатов! Так можно?
    @Test
    public void testAccordionHeading1() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickAccordionHeading1();
        var expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        var actual = mainPage.getTextAccordionPanel1();
        assertEquals("", expected, actual);
    }

    //Как рассчитывается время аренды?
    @Test
    public void testAccordionHeading2() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickAccordionHeading2();
        var expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        var actual = mainPage.getTextAccordionPanel2();
        assertEquals("", expected, actual);
    }

    //Можно ли заказать самокат прямо на сегодня?
    @Test
    public void testAccordionHeading3() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickAccordionHeading3();
        var expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        var actual = mainPage.getTextAccordionPanel3();
        assertEquals("", expected, actual);
    }

    //Можно ли продлить заказ или вернуть самокат раньше?
    @Test
    public void testAccordionHeading4() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickAccordionHeading4();
        var expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        var actual = mainPage.getTextAccordionPanel4();
        assertEquals("", expected, actual);
    }

    //Вы привозите зарядку вместе с самокатом?
    @Test
    public void testAccordionHeading5() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickAccordionHeading5();
        var expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        var actual = mainPage.getTextAccordionPanel5();
        assertEquals("", expected, actual);
    }

    //Можно ли отменить заказ?
    @Test
    public void testAccordionHeading6() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickAccordionHeading6();
        var expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        var actual = mainPage.getTextAccordionPanel6();
        assertEquals("", expected, actual);
    }

    //Я жизу за МКАДом, привезёте?
    @Test
    public void testAccordionHeading7() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickAccordionHeading7();
        var expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        var actual = mainPage.getTextAccordionPanel7();
        assertEquals("", expected, actual);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
