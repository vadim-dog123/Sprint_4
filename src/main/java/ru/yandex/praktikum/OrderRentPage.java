package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class OrderRentPage {
    public OrderRentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public final WebDriver webDriver;
    //Когда превести самокат
    private By dateOrder = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //Срок аренды
    private By rentalPeriod = By.className("Dropdown-control");
    //Цвет самоката
    //черный
    private By blackScooter = By.id("black");
    //серый
    private By greyScooter = By.id("grey");
    //коментарий
    private By commentСourier = By.className("Input_Input__1iN_Z Input_Responsible__1jDKN");
    //кнопка заказать
    private By orderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //кнопка да, на плашке "хотите оформить заказ"
    private By saveButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    /**
     * 08.12.2022
     */
    public OrderRentPage dateOrder(String date) {
        webDriver.findElement(dateOrder).sendKeys(date);
        webDriver.findElement(dateOrder).sendKeys("\n");
        return this;
    }

    /**
     * сутки, двое суток, ...
     */
    public OrderRentPage rentalPeriod(String text) {
        By period = By.xpath(".//div[@class='Dropdown-option' and text()='" + text + "']");
        webDriver.findElement(rentalPeriod).click();
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webDriver.findElement(period));
        webDriver.findElement(period).click();
        return this;
    }

    public OrderRentPage blackScooterClick() {
        webDriver.findElement(blackScooter).click();
        return this;
    }

    public OrderRentPage greyScooterClick() {
        webDriver.findElement(greyScooter).click();
        return this;
    }

    public OrderRentPage orderButtonClick() {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webDriver.findElement(orderButton));
        webDriver.findElement(orderButton).click();
        return this;
    }

    public OrderRentPage saveOrderButton() {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webDriver.findElement(saveButton));
        webDriver.findElement(saveButton).click();
        return this;
    }
}
