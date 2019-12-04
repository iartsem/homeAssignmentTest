package pages;

import model.Device;
import model.ResultData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
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

    public ArrayList<Device> getListOfDevices() {
        ArrayList<Device> devicesList = new ArrayList<Device>();
        for (int i = 0; i < deviceItem.size(); i++) {
            String[] policiesList = policies.getText().split(",");
            Device device = new Device(
                    deviceName.getText(),
                    true,
                    policiesList,
                    policyNameInInitialPlan.getText(),
                    true,
                    details.getText(),
                    String.valueOf(isCheckedInInitialPlan()));
            devicesList.add(device);
        }
        return devicesList;
    }

    public ResultData getResultData() {
        ArrayList<Device> deviceList = getListOfDevices();
        boolean mixTraffic = isMixTraffic();
        return new ResultData(mixTraffic, deviceList);
    }

    private boolean isCheckedInInitialPlan() {
        return checkboxInInitialPlan.isSelected();
    }

    private boolean isMixTraffic(){
        return false;
    }
}
