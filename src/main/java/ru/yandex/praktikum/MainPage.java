package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    public final WebDriver webDriver;
    //Сылка на главную страницу
    private final String mainPage = "https://qa-scooter.praktikum-services.ru/";
    // Заголовок страницы
    // Кнопка «Заказать» в шапке
    private final By orderButtonTop = By.xpath("//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    // Кнопка "Статус заказа"
    // Картинка самоката
    //Самакат на пару дней
    //Модель самоката с ттх
    //Кнопка "заказать"
    private final By orderButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Как это работает
    //Куки


    //Вопросы о важном
    private final By accordionHeading_0 = By.id("accordion__heading-0");
    private final By accordionHeading_1 = By.id("accordion__heading-1");
    private final By accordionHeading_2 = By.id("accordion__heading-2");
    private final By accordionHeading_3 = By.id("accordion__heading-3");
    private final By accordionHeading_4 = By.id("accordion__heading-4");
    private final By accordionHeading_5 = By.id("accordion__heading-5");
    private final By accordionHeading_6 = By.id("accordion__heading-6");
    private final By accordionHeading_7 = By.id("accordion__heading-7");
    //Ответы о важном
    private final By accordionPanel_0 = By.id("accordion__panel-0");
    private final By accordionPanel_1 = By.id("accordion__panel-1");
    private final By accordionPanel_2 = By.id("accordion__panel-2");
    private final By accordionPanel_3 = By.id("accordion__panel-3");
    private final By accordionPanel_4 = By.id("accordion__panel-4");
    private final By accordionPanel_5 = By.id("accordion__panel-5");
    private final By accordionPanel_6 = By.id("accordion__panel-6");
    private final By accordionPanel_7 = By.id("accordion__panel-7");

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open() {
        webDriver.get(mainPage);
    }

    public void clickAccordionHeading0() {
        WebElement element = webDriver.findElement(accordionHeading_0);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void clickOrderButtonTop() {
        WebElement element = webDriver.findElement(orderButtonTop);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void clickOrderButton() {
        WebElement element = webDriver.findElement(orderButton);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void clickAccordionHeading1() {
        WebElement element = webDriver.findElement(accordionHeading_1);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void clickAccordionHeading2() {
        WebElement element = webDriver.findElement(accordionHeading_2);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void clickAccordionHeading3() {
        WebElement element = webDriver.findElement(accordionHeading_3);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void clickAccordionHeading4() {
        WebElement element = webDriver.findElement(accordionHeading_4);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void clickAccordionHeading5() {
        WebElement element = webDriver.findElement(accordionHeading_5);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void clickAccordionHeading6() {
        WebElement element = webDriver.findElement(accordionHeading_6);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void clickAccordionHeading7() {
        WebElement element = webDriver.findElement(accordionHeading_7);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public String getTextAccordionPanel0() {
        return webDriver.findElement(accordionPanel_0).getText();
    }

    public String getTextAccordionPanel1() {
        return webDriver.findElement(accordionPanel_1).getText();
    }

    public String getTextAccordionPanel2() {
        return webDriver.findElement(accordionPanel_2).getText();
    }

    public String getTextAccordionPanel3() {
        return webDriver.findElement(accordionPanel_3).getText();
    }

    public String getTextAccordionPanel4() {
        return webDriver.findElement(accordionPanel_4).getText();
    }

    public String getTextAccordionPanel5() {
        return webDriver.findElement(accordionPanel_5).getText();
    }

    public String getTextAccordionPanel6() {
        return webDriver.findElement(accordionPanel_6).getText();
    }

    public String getTextAccordionPanel7() {
        return webDriver.findElement(accordionPanel_7).getText();
    }


}
