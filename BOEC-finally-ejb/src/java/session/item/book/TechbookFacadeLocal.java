/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.item.book;

import entities.item.book.Techbook;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface TechbookFacadeLocal {

    void create(Techbook techbook);

    void edit(Techbook techbook);

    void remove(Techbook techbook);

    Techbook find(Object id);

    List<Techbook> findAll();

    List<Techbook> findRange(int[] range);

    int count();
    
}
