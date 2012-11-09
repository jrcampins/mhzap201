/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.business.process.logic;

import com.egt.ejb.business.message.CancelarGrupoProcesoMessage;
import com.egt.ejb.persistence.entity.GrupoProceso;
import com.egt.ejb.persistence.facade.CondicionEjeFunFacadeLocal;
import com.egt.ejb.persistence.facade.GrupoProcesoFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class GrupoProcesoBusinessProcessLogicBean implements GrupoProcesoBusinessProcessLogicLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private GrupoProcesoFacadeLocal facade;

    @EJB
    private CondicionEjeFunFacadeLocal condicionEjeFunFacade;
    // </editor-fold>

    @Override
    public void cancelarGrupoProceso(CancelarGrupoProcesoMessage message, GrupoProceso grupoProceso) throws Exception {
        if (message == null) {
            throw new EJBException(CancelarGrupoProcesoMessage.class.getSimpleName());
        }
        if (grupoProceso == null) {
            throw new EJBException(GrupoProceso.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }
}
