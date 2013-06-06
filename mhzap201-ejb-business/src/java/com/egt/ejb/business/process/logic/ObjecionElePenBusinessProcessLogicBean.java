/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.business.process.logic;

import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.IntUtils;
import com.egt.commons.util.TimeUtils;
import com.egt.core.util.STP;
import com.egt.ejb.business.message.AnularObjecionElePenMessage;
import com.egt.ejb.persistence.entity.ObjecionElePen;
import com.egt.ejb.persistence.facade.ObjecionElePenFacadeLocal;
import com.egt.ejb.persistence.facade.PersonaFacadeLocal;
import com.egt.ejb.persistence.facade.ProveedorDatExtFacadeLocal;
import com.egt.ejb.persistence.facade.TipoObjElePenFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class ObjecionElePenBusinessProcessLogicBean implements ObjecionElePenBusinessProcessLogicLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private ObjecionElePenFacadeLocal facade;

    @EJB
    private PersonaFacadeLocal personaFacade;

    @EJB
    private ProveedorDatExtFacadeLocal proveedorDatExtFacade;

    @EJB
    private TipoObjElePenFacadeLocal tipoObjElePenFacade;
    // </editor-fold>

    @Override
    public void anularObjecionElePen(AnularObjecionElePenMessage message, ObjecionElePen objecionElePen) throws Exception {
        if (message == null) {
            throw new EJBException(AnularObjecionElePenMessage.class.getSimpleName());
        }
        if (objecionElePen == null) {
            throw new EJBException(ObjecionElePen.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        objecionElePen.setObservacionesAnulacion(message.getObservacionesAnulacion());
    }
}
