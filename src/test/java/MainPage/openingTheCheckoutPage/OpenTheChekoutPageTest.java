package MainPage.openingTheCheckoutPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.praktikum.MainPage;
import ru.yandex.praktikum.OrderPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OpenTheChekoutPageTest {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //WebDriverManager.firefoxdriver().setup();
        // driver = new FirefoxDriver();
        //    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
@Test
public void testTransitionTopOrderButton(){
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    mainPage.clickOrderButtonTop();
    assertTrue("Страница для оформления заказа не открылась",new OrderPage(driver).isOrderHeaderDisplayed());
}

    @Test
    public void testTransitionlowerOrderButton(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickOrderButton();
        assertTrue("Страница для оформления заказа не открылась",new OrderPage(driver).isOrderHeaderDisplayed());
    }


    @After
    public void tearDown() {
        driver.quit();
    }


}
