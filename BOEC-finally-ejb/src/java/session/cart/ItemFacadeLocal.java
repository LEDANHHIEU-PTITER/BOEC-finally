/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.cart;

import entities.cart.Category;
import entities.cart.Item;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface ItemFacadeLocal {

    void create(Item item);

    void edit(Item item);

    void remove(Item item);

    Item find(Object id);

    List<Item> findAll();

    List<Item> findRange(int[] range);

    int count();

    public List<Item> findByCategoryID(Category CategoryID);

    List<Item> findByName(String name);

}
