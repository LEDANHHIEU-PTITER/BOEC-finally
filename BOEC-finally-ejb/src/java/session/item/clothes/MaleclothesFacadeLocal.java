/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.item.clothes;

import entities.item.clothes.Maleclothes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface MaleclothesFacadeLocal {

    void create(Maleclothes maleclothes);

    void edit(Maleclothes maleclothes);

    void remove(Maleclothes maleclothes);

    Maleclothes find(Object id);

    List<Maleclothes> findAll();

    List<Maleclothes> findRange(int[] range);

    int count();
    
}
