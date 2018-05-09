package Model;

public class Smartphone extends Electronic {

    private float battery;
    private String cameraAfter;

    public Smartphone() {
    }

    public float getBattery() {
        return battery;
    }

    public void setBattery(float battery) {
        this.battery = battery;
    }

    public String getCameraAfter() {
        return cameraAfter;
    }

    public void setCameraAfter(String cameraAfter) {
        this.cameraAfter = cameraAfter;
    }

}
