/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsp;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author byron
 */
@Stateless
public class VarEmpFacade extends AbstractFacade<VarEmp> {
    @PersistenceContext(unitName = "ConsVarMunanaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VarEmpFacade() {
        super(VarEmp.class);
    }
    
}
