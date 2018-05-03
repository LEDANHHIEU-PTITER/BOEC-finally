/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Caugiaystore;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface CaugiaystoreFacadeLocal {

    void create(Caugiaystore caugiaystore);

    void edit(Caugiaystore caugiaystore);

    void remove(Caugiaystore caugiaystore);

    Caugiaystore find(Object id);

    List<Caugiaystore> findAll();

    List<Caugiaystore> findRange(int[] range);

    int count();
    
}
