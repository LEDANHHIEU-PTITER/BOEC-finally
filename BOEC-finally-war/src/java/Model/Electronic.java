package Model;

public class Electronic extends Item {

    private float screenSize;
    private String cpu;
    private String room;
    private String ram;
    private String gpu;
    private String operaSystem;
    private String cameraFont;
    private String srceenResolation;
    private float warrantyPeriod;
    Company company;

    public Electronic() {
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getOperaSystem() {
        return operaSystem;
    }

    public void setOperaSystem(String operaSystem) {
        this.operaSystem = operaSystem;
    }

    public String getCameraFont() {
        return cameraFont;
    }

    public void setCameraFont(String cameraFont) {
        this.cameraFont = cameraFont;
    }

    public String getSrceenResolation() {
        return srceenResolation;
    }

    public void setSrceenResolation(String srceenResolation) {
        this.srceenResolation = srceenResolation;
    }

    public float getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(float warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
