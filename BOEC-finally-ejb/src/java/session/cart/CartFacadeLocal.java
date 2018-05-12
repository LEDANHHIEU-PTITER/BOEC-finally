/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.cart;

import entities.cart.Cart;
import entities.cart.Item;
import entities.cart.Itemdetail;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface CartFacadeLocal {

    void create(Cart cart);

    void edit(Cart cart);

    void remove(Cart cart);

    Cart find(Object id);

    List<Cart> findAll();

    List<Cart> findRange(int[] range);

    int count();

    void addItemToCart(Item item);

    List<Itemdetail> getCart();

    void setCart(List<Itemdetail> itemdetails);

    void removeItemInCart(int index);
}
