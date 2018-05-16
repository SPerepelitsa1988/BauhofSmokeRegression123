package com.ysa.bauhof.appmanager.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div[1]/span/nav/div[2]/h3")
    private WebElement visualiserButton;
    @FindBy(id = "desing-visualizer-tab-id")
    private WebElement calculatorButton;
    @FindBy(xpath = "/html/body/div[1]/div[1]/span/nav/div[4]/h3")
    private WebElement summaryButton;
    @FindBy(xpath = "/html/body/div[1]/div[1]/span/nav/div[1]/ul/li[2]")
    private WebElement ENGButton;
    @FindBy (xpath = "/html/body/div[1]/div[1]/span/nav/div[1]/ul/li[1]")
    private WebElement ESTButton;
    @FindBy (xpath = "/html/body/div[1]/div[1]/span/nav/div[1]/ul/li[3]")
    private WebElement RUSButton;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected void type(WebElement inputField, String value) {
        inputField.click();
        inputField.clear();
        inputField.sendKeys(value);
    }

    protected void click(WebElement button) {
        button.click();
    }

    public void clickByVisualizerButton() {
        visualiserButton.click();
    }

    public WebElement getVisualizerButton() {
        return visualiserButton;
    }

    public void clickByESTButton() {
        ESTButton.click();
    }
    public void clickByENGButton() {
        ENGButton.click();
    }
    public void clickByRUSButton() {
        RUSButton.click();
    }
}