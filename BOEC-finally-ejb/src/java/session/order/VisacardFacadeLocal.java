/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Visacard;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface VisacardFacadeLocal {

    void create(Visacard visacard);

    void edit(Visacard visacard);

    void remove(Visacard visacard);

    Visacard find(Object id);

    List<Visacard> findAll();

    List<Visacard> findRange(int[] range);

    int count();
    
}
