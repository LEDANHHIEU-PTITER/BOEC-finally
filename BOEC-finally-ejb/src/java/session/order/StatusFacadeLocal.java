/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.order;

import entities.order.Status;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface StatusFacadeLocal {

    void create(Status status);

    void edit(Status status);

    void remove(Status status);

    Status find(Object id);

    List<Status> findAll();

    List<Status> findRange(int[] range);

    int count();
    
}
