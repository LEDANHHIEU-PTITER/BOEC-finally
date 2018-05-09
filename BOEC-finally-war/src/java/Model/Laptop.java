package Model;

public class Laptop extends Electronic {

    private int isDVD;
    private int isKeyBoardLight;

    public Laptop() {
    }

    public int getIsDVD() {
        return isDVD;
    }

    public void setIsDVD(int isDVD) {
        this.isDVD = isDVD;
    }

    public int getIsKeyBoardLight() {
        return isKeyBoardLight;
    }

    public void setIsKeyBoardLight(int isKeyBoardLight) {
        this.isKeyBoardLight = isKeyBoardLight;
    }

}
