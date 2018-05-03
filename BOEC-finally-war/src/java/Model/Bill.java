package Model;

import java.util.Date;

public class Bill {

    private String id;
    private float amount;
    private Date date;
    private int payed;
    SellerEmployee SellerEmployee;
    Order order;

    public Bill() {
    }

    public int getPayed() {
        return this.payed;
    }

    /**
     *
     * @param payed
     */
    public void setPayed(int payed) {
        this.payed = payed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public SellerEmployee getSellerEmployee() {
        return SellerEmployee;
    }

    public void setSellerEmployee(SellerEmployee SellerEmployee) {
        this.SellerEmployee = SellerEmployee;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
