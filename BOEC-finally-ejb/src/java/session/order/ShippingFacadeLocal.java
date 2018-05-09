/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.order;

import entities.order.Shipping;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface ShippingFacadeLocal {

    void create(Shipping shipping);

    void edit(Shipping shipping);

    void remove(Shipping shipping);

    Shipping find(Object id);

    List<Shipping> findAll();

    List<Shipping> findRange(int[] range);

    int count();
    
}
