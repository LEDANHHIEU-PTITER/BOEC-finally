/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.item.book;

import entities.item.book.Literaturebook;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface LiteraturebookFacadeLocal {

    void create(Literaturebook literaturebook);

    void edit(Literaturebook literaturebook);

    void remove(Literaturebook literaturebook);

    Literaturebook find(Object id);

    List<Literaturebook> findAll();

    List<Literaturebook> findRange(int[] range);

    int count();
    
}
