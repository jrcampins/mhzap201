/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.ejb.persistence;

import com.egt.ejb.persistence.facade.ClaseRecursoFacadeLocal;
import com.egt.ejb.persistence.facade.DominioFacadeLocal;
import com.egt.ejb.persistence.facade.FiltroFuncionFacadeLocal;
import com.egt.ejb.persistence.facade.FuncionFacadeLocal;
import com.egt.ejb.persistence.facade.FuncionParametroFacadeLocal;
import com.egt.ejb.persistence.facade.RolFacadeLocal;
import com.egt.ejb.persistence.facade.UsuarioFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class FacadeBeanLocatorBean implements FacadeBeanLocatorLocal {

    @EJB
    private ClaseRecursoFacadeLocal claseRecursoFacade;

    @EJB
    private DominioFacadeLocal dominioFacade;

    @EJB
    private FiltroFuncionFacadeLocal filtroFuncionFacade;

    @EJB
    private FuncionFacadeLocal funcionFacade;

    @EJB
    private FuncionParametroFacadeLocal funcionParametroFacade;

    @EJB
    private RolFacadeLocal rolFacade;

    @EJB
    private UsuarioFacadeLocal usuarioFacade;

    @Override
    public ClaseRecursoFacadeLocal getClaseRecursoFacade() {
        return claseRecursoFacade;
    }

    @Override
    public DominioFacadeLocal getDominioFacade() {
        return dominioFacade;
    }

    @Override
    public FiltroFuncionFacadeLocal getFiltroFuncionFacade() {
        return filtroFuncionFacade;
    }

    @Override
    public FuncionFacadeLocal getFuncionFacade() {
        return funcionFacade;
    }

    @Override
    public FuncionParametroFacadeLocal getFuncionParametroFacade() {
        return funcionParametroFacade;
    }

    @Override
    public RolFacadeLocal getRolFacade() {
        return rolFacade;
    }

    @Override
    public UsuarioFacadeLocal getUsuarioFacade() {
        return usuarioFacade;
    }

}
