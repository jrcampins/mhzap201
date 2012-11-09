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
import javax.ejb.Local;

@Local
public interface FacadeBeanLocatorLocal {

    ClaseRecursoFacadeLocal getClaseRecursoFacade();

    DominioFacadeLocal getDominioFacade();

    FiltroFuncionFacadeLocal getFiltroFuncionFacade();

    FuncionFacadeLocal getFuncionFacade();

    FuncionParametroFacadeLocal getFuncionParametroFacade();

    RolFacadeLocal getRolFacade();

    UsuarioFacadeLocal getUsuarioFacade();

}
