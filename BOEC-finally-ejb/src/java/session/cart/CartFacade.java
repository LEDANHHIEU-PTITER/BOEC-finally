/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.cart;

import entities.cart.Cart;
import entities.cart.Item;
import entities.cart.Itemdetail;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import session.AbstractFacade;

/**
 *
 * @author HieuLe
 */
@Stateful
public class CartFacade extends AbstractFacade<Cart> implements CartFacadeLocal {

    private List<Itemdetail> listItems;
//    private static CartFacade cartFacade;
//
//    public CartFacade getInstance() {
//        if (cartFacade == null) {
//            cartFacade = new CartFacade();
//        }
//        return cartFacade;
//    }

    @PostConstruct
    void init() {
        listItems = new ArrayList<Itemdetail>();
    }
    @PersistenceContext(unitName = "BOEC-finally-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CartFacade() {
        super(Cart.class);
    }

    @Override
    public void addItemToCart(Item item) {
        for (int i = 0; i < listItems.size(); i++) {
            if (listItems.get(i).getItemID().getId() == item.getId()) {
                listItems.get(i).setQuantity(listItems.get(i).getQuantity() + item.getQuantity());
                return;
            }
        }
        Itemdetail itemdetail = new Itemdetail();
        itemdetail.setId("id_" + item.getId());
        itemdetail.setItemID(item);
        itemdetail.setPrice(item.getPrice());
        itemdetail.setQuantity(item.getQuantity());
        listItems.add(itemdetail);
        return;
    }

    @Override
    public List<Itemdetail> getCart() {
        return listItems;
    }

    @Override
    public void setCart(List<Itemdetail> itemdetails) {
        listItems = itemdetails;
    }

    @Override
    public void removeItemInCart(int index) {
        listItems.remove(index);
    }

}
