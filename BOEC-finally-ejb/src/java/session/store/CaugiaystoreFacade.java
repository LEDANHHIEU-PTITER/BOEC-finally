/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Caugiaystore;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HieuLe
 */
@Stateless
public class CaugiaystoreFacade extends AbstractFacade<Caugiaystore> implements CaugiaystoreFacadeLocal {

    @PersistenceContext(unitName = "BOEC-finally-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CaugiaystoreFacade() {
        super(Caugiaystore.class);
    }
    
}
