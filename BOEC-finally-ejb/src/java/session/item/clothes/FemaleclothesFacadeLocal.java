/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Femaleclothes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface FemaleclothesFacadeLocal {

    void create(Femaleclothes femaleclothes);

    void edit(Femaleclothes femaleclothes);

    void remove(Femaleclothes femaleclothes);

    Femaleclothes find(Object id);

    List<Femaleclothes> findAll();

    List<Femaleclothes> findRange(int[] range);

    int count();
    
}
