/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.cart;

import entities.cart.Itemdetail;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface ItemdetailFacadeLocal {

    void create(Itemdetail itemdetail);

    void edit(Itemdetail itemdetail);

    void remove(Itemdetail itemdetail);

    Itemdetail find(Object id);

    List<Itemdetail> findAll();

    List<Itemdetail> findRange(int[] range);

    int count();
    
}
