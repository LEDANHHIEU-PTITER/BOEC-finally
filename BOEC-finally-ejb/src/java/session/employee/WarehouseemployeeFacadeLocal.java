/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.employee;

import entities.employee.Warehouseemployee;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface WarehouseemployeeFacadeLocal {

    void create(Warehouseemployee warehouseemployee);

    void edit(Warehouseemployee warehouseemployee);

    void remove(Warehouseemployee warehouseemployee);

    Warehouseemployee find(Object id);

    List<Warehouseemployee> findAll();

    List<Warehouseemployee> findRange(int[] range);

    int count();
    
}
