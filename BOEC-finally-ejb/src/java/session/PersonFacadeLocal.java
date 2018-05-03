/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Account;
import entities.Person;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HieuLe
 */
@Local
public interface PersonFacadeLocal {

    void create(Person person);

    void edit(Person person);

    void remove(Person person);

    Person find(Object id);

    List<Person> findAll();

    List<Person> findRange(int[] range);

    int count();

    public Person findByAccountID(Account account);
    
}
