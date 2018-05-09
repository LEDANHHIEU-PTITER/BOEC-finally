/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.order;

import entities.order.Directpayment;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface DirectpaymentFacadeLocal {

    void create(Directpayment directpayment);

    void edit(Directpayment directpayment);

    void remove(Directpayment directpayment);

    Directpayment find(Object id);

    List<Directpayment> findAll();

    List<Directpayment> findRange(int[] range);

    int count();
    
}
