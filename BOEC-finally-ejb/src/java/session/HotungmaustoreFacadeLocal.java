/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Hotungmaustore;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface HotungmaustoreFacadeLocal {

    void create(Hotungmaustore hotungmaustore);

    void edit(Hotungmaustore hotungmaustore);

    void remove(Hotungmaustore hotungmaustore);

    Hotungmaustore find(Object id);

    List<Hotungmaustore> findAll();

    List<Hotungmaustore> findRange(int[] range);

    int count();
    
}
