package com.ysa.bauhof.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.ysa.bauhof.appmanager.page.BasePage;

public class MainPageTest extends BaseTest {
    public static ChromeDriver driver;
    public static BasePage basePage;


    @BeforeClass
    public void preparePreconditions() {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Selenium/chromedriver.exe");
        driver = new ChromeDriver();
        basePage = new BasePage(driver);
        driver.manage().window().maximize();
        driver.get("http://toadisainer.bauhof.ee/");
    }
    @Test
    public void findAllElementsOnThePage () {

        String title = driver.getTitle();
        Assert.assertEquals(driver.getTitle(), ("Bauhof"));
    }
    @AfterClass
    public static void close () {
        driver.quit();
    }


}
