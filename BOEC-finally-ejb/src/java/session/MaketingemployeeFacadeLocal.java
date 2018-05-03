/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Maketingemployee;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface MaketingemployeeFacadeLocal {

    void create(Maketingemployee maketingemployee);

    void edit(Maketingemployee maketingemployee);

    void remove(Maketingemployee maketingemployee);

    Maketingemployee find(Object id);

    List<Maketingemployee> findAll();

    List<Maketingemployee> findRange(int[] range);

    int count();
    
}
