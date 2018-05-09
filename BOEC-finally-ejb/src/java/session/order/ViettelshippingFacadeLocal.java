/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Viettelshipping;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface ViettelshippingFacadeLocal {

    void create(Viettelshipping viettelshipping);

    void edit(Viettelshipping viettelshipping);

    void remove(Viettelshipping viettelshipping);

    Viettelshipping find(Object id);

    List<Viettelshipping> findAll();

    List<Viettelshipping> findRange(int[] range);

    int count();
    
}
