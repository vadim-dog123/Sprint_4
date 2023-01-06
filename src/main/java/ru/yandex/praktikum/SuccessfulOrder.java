package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SuccessfulOrder {
    public SuccessfulOrder(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public final WebDriver webDriver;
    //сылка на страницу
    private By successfulMsg = By.xpath(".//*[text()='Заказ оформлен']");

    public boolean hasSuccessfulMsg() {
        return webDriver.findElement(successfulMsg).isDisplayed();
    }
}
