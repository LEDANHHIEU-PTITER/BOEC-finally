/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Tablet;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface TabletFacadeLocal {

    void create(Tablet tablet);

    void edit(Tablet tablet);

    void remove(Tablet tablet);

    Tablet find(Object id);

    List<Tablet> findAll();

    List<Tablet> findRange(int[] range);

    int count();
    
}
