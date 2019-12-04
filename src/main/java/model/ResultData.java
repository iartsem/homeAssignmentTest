package model;

import java.util.ArrayList;

public class ResultData {

    private boolean mixTraffic;
    private ArrayList<Device> devices;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResultData)) return false;

        ResultData data = (ResultData) o;

        if (isMixTraffic() != data.isMixTraffic()) return false;
        return getDevices() != null ? getDevices().equals(data.getDevices()) : data.getDevices() == null;

    }

    @Override
    public int hashCode() {
        int result = (isMixTraffic() ? 1 : 0);
        result = 31 * result + (getDevices() != null ? getDevices().hashCode() : 0);
        return result;
    }
}
