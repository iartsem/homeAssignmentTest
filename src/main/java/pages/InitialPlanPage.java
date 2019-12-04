package pages;

import model.ResultData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parsers.GenericLazyMapParser;

import java.io.*;
import java.util.List;

public class InitialPlanPage extends BasePage {

    public InitialPlanPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "#path")
    List<WebElement> deviceItem;

    @FindBy(xpath = "#path")
    WebElement deviceName;

    @FindBy(xpath = "#path")
    WebElement policies;

    @FindBy(xpath = "#path")
    WebElement policyNameInInitialPlan;

    @FindBy(xpath = "#path")
    WebElement details;

    @FindBy(xpath = "#path")
    WebElement checkboxInInitialPlan;

    private static final String FILE = "";

    public ResultData readJsonToClass() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert inputStream != null;
        return GenericLazyMapParser.parse(inputStream, ResultData.class);
    }
}
