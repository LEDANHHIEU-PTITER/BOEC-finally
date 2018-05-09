/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Creaditcard;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface CreaditcardFacadeLocal {

    void create(Creaditcard creaditcard);

    void edit(Creaditcard creaditcard);

    void remove(Creaditcard creaditcard);

    Creaditcard find(Object id);

    List<Creaditcard> findAll();

    List<Creaditcard> findRange(int[] range);

    int count();
    
}
