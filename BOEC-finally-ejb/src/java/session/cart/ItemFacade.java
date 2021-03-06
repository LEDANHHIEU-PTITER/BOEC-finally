/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.cart;

import entities.cart.Category;
import entities.cart.Item;
import java.util.List;
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
public class ItemFacade extends AbstractFacade<Item> implements ItemFacadeLocal {

    @PersistenceContext(unitName = "BOEC-finally-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ItemFacade() {
        super(Item.class);
    }

    @Override
    public List<Item> findByCategoryID(Category CategoryID) {
        try {
            Query query = getEntityManager().createNamedQuery(Item.class.getSimpleName() + ".findByCategoryID");
            query.setParameter("categoryID", CategoryID);
            List resultList = query.getResultList();
            return (List<Item>) resultList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Item> findByName(String name) {
        try {
            Query query = getEntityManager().createNamedQuery(Item.class.getSimpleName() + ".findByName");
            query.setParameter("name", "%" + name + "%").getResultList();
            List resultList = query.getResultList();
            return (List<Item>) resultList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
