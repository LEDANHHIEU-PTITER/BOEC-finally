/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Ghnshipping;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface GhnshippingFacadeLocal {

    void create(Ghnshipping ghnshipping);

    void edit(Ghnshipping ghnshipping);

    void remove(Ghnshipping ghnshipping);

    Ghnshipping find(Object id);

    List<Ghnshipping> findAll();

    List<Ghnshipping> findRange(int[] range);

    int count();
    
}
