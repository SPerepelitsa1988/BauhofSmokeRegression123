package com.ysa.bauhof.tests;

import com.ysa.bauhof.appmanager.page.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MainPageTest extends BaseTest {
    private static WebDriver driver;
    private static BasePage basePage;

    public static BasePage getBasePage() {
        return basePage;
    }


    @BeforeClass
    public void preparePreconditions() {
        basePage = new BasePage(driver);
    }
    @Test(priority = 1)
    public void selectLanguage(){
        basePage.clickByENGButton();
        Assert.assertEquals(basePage.getVisualizerButton().getText(),"Visualizer");
    }

    @Test (priority = 2)
    public void findAllElementsOnThePage() {

        String title = driver.getTitle();
        Assert.assertEquals(driver.getTitle(), ("Bauhof"));
    }

    @Test (priority = 3)
    public void FindButtonByName() {
        Assert.assertEquals(basePage.getVisualizerButton().getText(),"Visualizer");
    }

    @Test (priority = 4)
    public void VisualizerPage(){
        basePage.clickByVisualizerButton();
        String VisualizerPageSelectNewRoomSceneText = driver.getPageSource();
        boolean isTheTextPresent = driver.getPageSource().contains("New Room Scene");
        Assert.assertTrue(isTheTextPresent);
    }



}
