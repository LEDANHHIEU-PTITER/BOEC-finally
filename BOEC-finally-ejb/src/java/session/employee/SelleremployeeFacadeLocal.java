/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.employee;

import entities.employee.Selleremployee;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface SelleremployeeFacadeLocal {

    void create(Selleremployee selleremployee);

    void edit(Selleremployee selleremployee);

    void remove(Selleremployee selleremployee);

    Selleremployee find(Object id);

    List<Selleremployee> findAll();

    List<Selleremployee> findRange(int[] range);

    int count();
    
}
