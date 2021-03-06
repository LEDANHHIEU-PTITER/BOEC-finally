/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.employee.Maketingemployee;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import session.employee.MaketingemployeeFacadeLocal;

/**
 *
 * @author HieuLe
 */
@Stateless
public class MaketingemployeeFacade extends AbstractFacade<Maketingemployee> implements MaketingemployeeFacadeLocal {

    @PersistenceContext(unitName = "BOEC-finally-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MaketingemployeeFacade() {
        super(Maketingemployee.class);
    }
    
}
