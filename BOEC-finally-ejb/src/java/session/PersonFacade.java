/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Account;
import entities.Person;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author HieuLe
 */
@Stateless
public class PersonFacade extends AbstractFacade<Person> implements PersonFacadeLocal {

    @PersistenceContext(unitName = "BOEC-finally-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonFacade() {
        super(Person.class);
    }

    @Override
    public Person findByAccountID(Account account) {
        try {
            Query createNamedQuery = getEntityManager().createNamedQuery(Person.class.getSimpleName() + ".findByAccountID");
            createNamedQuery.setParameter("accountID", account);
            Object singleResult = createNamedQuery.getSingleResult();
            return (Person) singleResult;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
