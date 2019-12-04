package uitest;

import actions.ResultDataFlowAction;
import model.ResultData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.InitialPlanPage;

import java.io.File;

public class InitialPlanPageTest {

    WebDriver webDriver;
    BasePage basePage;
    private static final String FILE = "";

    @BeforeTest
    void setUp(){
        webDriver = new ChromeDriver();
        basePage = new BasePage(webDriver);
        webDriver.manage().window().maximize();
        basePage.navigateToBasePage();
    }

    @Test
    void compareInitialPlanPageData(){
        InitialPlanPage initialPlanPageTest = basePage.openInitialPlanPage();
        ResultData dataFromInitialPlanPage = initialPlanPageTest.getResultData();
        ResultData dataFromFile = ResultDataFlowAction.readJsonToClass(new File(FILE));
        Assert.assertEquals(dataFromInitialPlanPage, dataFromFile);
    }

    @AfterTest
    void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
