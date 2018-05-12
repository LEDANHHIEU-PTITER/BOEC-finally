/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.order;

import entities.order.Mastercard;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface MastercardFacadeLocal {

    void create(Mastercard mastercard);

    void edit(Mastercard mastercard);

    void remove(Mastercard mastercard);

    Mastercard find(Object id);

    List<Mastercard> findAll();

    List<Mastercard> findRange(int[] range);

    int count();
    
}
