package Model;

public class CustomerVip extends Customer {

    private String numberCard;
    private float point;

    public CustomerVip() {
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

}
