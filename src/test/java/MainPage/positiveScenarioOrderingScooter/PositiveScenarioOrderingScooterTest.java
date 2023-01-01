package MainPage.positiveScenarioOrderingScooter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.praktikum.MainPage;
import ru.yandex.praktikum.OrderPage;
import ru.yandex.praktikum.OrderRentPage;
import ru.yandex.praktikum.SuccessfulOrder;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class PositiveScenarioOrderingScooterTest {
    WebDriver driver;
    private final String locationOrderButton;
    private final String name;
    private final String surName;
    private final String address;
    private final String metroStation;
    private final String phoneNumber;
    private final String date;
    private final String daysForRent;
    private final String color;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //   WebDriverManager.firefoxdriver().setup();
        // driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public PositiveScenarioOrderingScooterTest(String locationOrderButton,
                                               String name,
                                               String surName,
                                               String address,
                                               String metroStation,
                                               String phoneNumber,
                                               String date,
                                               String daysForRent,
                                               String color) {
        this.locationOrderButton = locationOrderButton;
        this.name = name;
        this.surName = surName;
        this.address = address;
        this.metroStation = metroStation;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.daysForRent = daysForRent;
        this.color = color;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Верх", "Андрей", "Андреевский", "г.Москва", "Бульвар Рокоссовского", "89999999999", "10.12.2022", "сутки", "черный"},
                {"Низ", "Иван", "Иванов", "г.Москва", "Перово", "83333332222", "11.11.2011", "сутки", "серый"}
        };
    }

    @Test
    public void OrderingScooterTest() {
        MainPage mainPage = new MainPage(driver).open();
        if (locationOrderButton.equals("Верх")) {
            mainPage.clickOrderButtonTop();
        } else {
            mainPage.clickOrderButton();
        }
        new OrderPage(driver)
                .nameSend(name)
                .surnameSend(surName)
                .addressSend(address)
                .telephoneNumberSend(phoneNumber)
                .metroStationSend(metroStation)
                .nextButtonСlick();
        OrderRentPage orderRentPage = new OrderRentPage(driver)
                .dateOrder(date)
                .rentalPeriod(daysForRent);
        if (color.equals("черный")) {
            orderRentPage.blackScooterClick();
        } else if (color.equals("серый")) {
            orderRentPage.greyScooterClick();
        }
        orderRentPage
                .orderButtonClick()
                .saveOrderButton();
        assertTrue("Нет страници с номером заказа", new SuccessfulOrder(driver).hasSuccessfulMsg());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}



