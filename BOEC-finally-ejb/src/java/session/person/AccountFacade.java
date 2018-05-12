/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.person;

import entities.person.Account;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import session.AbstractFacade;

/**
 *
 * @author HieuLe
 */
@Stateless
public class AccountFacade extends AbstractFacade<Account> implements AccountFacadeLocal {

    @PersistenceContext(unitName = "BOEC-finally-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountFacade() {
        super(Account.class);
    }

    @Override
    public Account login(String userName, String passWord) {
        try {
            Query createNamedQuery = getEntityManager().createNamedQuery(Account.class.getSimpleName() + ".login");
            createNamedQuery.setParameter("userName", userName);
            createNamedQuery.setParameter("passWord", passWord);
            Object singleResult = createNamedQuery.getSingleResult();
            return (Account) singleResult;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Account findByUserName(String userName) {
        try {
            Query query = getEntityManager().createNamedQuery(Account.class.getSimpleName() + ".findByUserName");
            query.setParameter("userName", userName);
            Object singleResult = query.getSingleResult();
            return (Account) singleResult;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
