package model;

import java.util.ArrayList;

public class ResultData {

    boolean mixTraffic;
    ArrayList<Device> devices;

    public ResultData(boolean mixTraffic, ArrayList<Device> devices) {
        this.mixTraffic = mixTraffic;
        this.devices = devices;
    }

    public boolean isMixTraffic() {
        return mixTraffic;
    }

    public void setMixTraffic(boolean mixTraffic) {
        this.mixTraffic = mixTraffic;
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<Device> devices) {
        this.devices = devices;
    }
}
