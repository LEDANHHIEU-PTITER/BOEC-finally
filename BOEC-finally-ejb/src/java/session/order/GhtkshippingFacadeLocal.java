/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.order;

import entities.order.Ghtkshipping;
import java.util.List;
import javax.ejb.Local;

/**S
 *
 * @author HieuLe
 */
@Local
public interface GhtkshippingFacadeLocal {

    void create(Ghtkshipping ghtkshipping);

    void edit(Ghtkshipping ghtkshipping);

    void remove(Ghtkshipping ghtkshipping);

    Ghtkshipping find(Object id);

    List<Ghtkshipping> findAll();

    List<Ghtkshipping> findRange(int[] range);

    int count();
    
}
