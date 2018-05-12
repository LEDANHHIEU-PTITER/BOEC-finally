/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.employee;

import entities.employee.Countingemloyee;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface CountingemloyeeFacadeLocal {

    void create(Countingemloyee countingemloyee);

    void edit(Countingemloyee countingemloyee);

    void remove(Countingemloyee countingemloyee);

    Countingemloyee find(Object id);

    List<Countingemloyee> findAll();

    List<Countingemloyee> findRange(int[] range);

    int count();
    
}
