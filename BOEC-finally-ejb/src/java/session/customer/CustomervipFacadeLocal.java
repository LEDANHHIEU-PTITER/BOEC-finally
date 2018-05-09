/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.customer;

import entities.customer.Customervip;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface CustomervipFacadeLocal {

    void create(Customervip customervip);

    void edit(Customervip customervip);

    void remove(Customervip customervip);

    Customervip find(Object id);

    List<Customervip> findAll();

    List<Customervip> findRange(int[] range);

    int count();
    
}
