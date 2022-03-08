/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Turma;

/**
 *
 * @author bernardo
 */
@Stateless
public class TurmaFacade extends AbstractFacade<Turma> implements TurmaFacadeLocal {
    @PersistenceContext(unitName = "CSTrabalho-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TurmaFacade() {
        super(Turma.class);
    }
    
}
