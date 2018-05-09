package Model;

import java.util.List;

public class Cart {

    private String id;
    private float amount;
    private List<ItemDetail> listItemDetail;

    public Cart() {
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

    public List<ItemDetail> getListItemDetail() {
        return listItemDetail;
    }

    public void setListItemDetail(List<ItemDetail> listItemDetail) {
        this.listItemDetail = listItemDetail;
    }

}
