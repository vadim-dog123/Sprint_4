package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    public OrderPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public final WebDriver webDriver;
    //сылка на страницу
    private final String orderPage = "https://qa-scooter.praktikum-services.ru/order";
    //Заголовок
    private final By orderHeader = By.className("Order_Header__BZXOb");
    //Поле имя'
    private final By nameField = By.xpath(".//input[@placeholder='* Имя']");
    //Поле фамилия
    private final By lastNameField = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //Поле адрес
    private final By addressField = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //Поле станция метра
    private final By metroStationField = By.xpath("//input[@class='select-search__input']");
    //Поле телефон
    private final By phoneField = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //Кнопка далее
    private final By nextButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");


    public OrderPage open() {
        webDriver.get(orderPage);
        return this;
    }

    public boolean isOrderHeaderDisplayed() {
        return webDriver.findElement(orderHeader).isDisplayed();
    }

    public OrderPage nameSend(String text) {
        webDriver.findElement(nameField).sendKeys(text);
        return this;
    }

    public OrderPage surnameSend(String text) {
        webDriver.findElement(lastNameField).sendKeys(text);
        return this;
    }

    public OrderPage addressSend(String text) {
        webDriver.findElement(addressField).sendKeys(text);
        return this;
    }

    public OrderPage metroStationSend(String text) {
        By station = By.xpath(".//*[text()='" + text + "']");
        webDriver.findElement(metroStationField).click();
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webDriver.findElement(station));
        webDriver.findElement(station).click();
        return this;
    }

    public OrderPage telephoneNumberSend(String text) {
        webDriver.findElement(phoneField).sendKeys(text);
        return this;
    }

    public OrderPage nextButtonСlick() {
        webDriver.findElement(nextButton).click();
        return this;
    }


}
