/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Managingemployee;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface ManagingemployeeFacadeLocal {

    void create(Managingemployee managingemployee);

    void edit(Managingemployee managingemployee);

    void remove(Managingemployee managingemployee);

    Managingemployee find(Object id);

    List<Managingemployee> findAll();

    List<Managingemployee> findRange(int[] range);

    int count();
    
}
