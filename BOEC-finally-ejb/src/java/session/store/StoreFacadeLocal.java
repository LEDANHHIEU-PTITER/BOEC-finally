/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.store;

import entities.store.Store;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface StoreFacadeLocal {

    void create(Store store);

    void edit(Store store);

    void remove(Store store);

    Store find(Object id);

    List<Store> findAll();

    List<Store> findRange(int[] range);

    int count();
    
}
