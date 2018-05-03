/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Cart;
import entities.Item;
import entities.Itemdetail;
import java.util.ArrayList;
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

    ArrayList<Itemdetail> getCart();

    void removeItemInCart(int index);
}
