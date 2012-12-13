/*
 * Copyright (C) 2009, EGT Consultores, C.A.
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
import com.egt.ejb.business.message.ProcesoImportarArchivosExtMessage;
import com.egt.ejb.business.message.ProcesoAcreditarPotBenMessage;
import com.egt.ejb.business.message.ProcesoPrepararProxPagoPenMessage;
import com.egt.ejb.business.message.ProcesoOtorgarPensionesAprMessage;
import com.egt.ejb.business.message.ProcesoDenegarPensionesMessage;
import com.egt.ejb.business.message.ProcesoActualizarPenEnJupeMessage;
import com.egt.ejb.business.message.ProcesoVerificarElePenMessage;
import com.egt.ejb.persistence.entity.Proceso;
import com.egt.ejb.persistence.facade.ProcesoFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class ProcesoBusinessProcessLogicBean implements ProcesoBusinessProcessLogicLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private ProcesoFacadeLocal facade;
    // </editor-fold>

    @Override
    public void procesoImportarArchivosExt(ProcesoImportarArchivosExtMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoImportarArchivosExtMessage.class.getSimpleName());
        }
        if (proceso == null) {
            throw new EJBException(Proceso.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void procesoAcreditarPotBen(ProcesoAcreditarPotBenMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoAcreditarPotBenMessage.class.getSimpleName());
        }
        if (proceso == null) {
            throw new EJBException(Proceso.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void procesoPrepararProxPagoPen(ProcesoPrepararProxPagoPenMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoPrepararProxPagoPenMessage.class.getSimpleName());
        }
        if (proceso == null) {
            throw new EJBException(Proceso.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void procesoOtorgarPensionesApr(ProcesoOtorgarPensionesAprMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoOtorgarPensionesAprMessage.class.getSimpleName());
        }
        if (proceso == null) {
            throw new EJBException(Proceso.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void procesoDenegarPensiones(ProcesoDenegarPensionesMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoDenegarPensionesMessage.class.getSimpleName());
        }
        if (proceso == null) {
            throw new EJBException(Proceso.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void procesoActualizarPenEnJupe(ProcesoActualizarPenEnJupeMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoActualizarPenEnJupeMessage.class.getSimpleName());
        }
        if (proceso == null) {
            throw new EJBException(Proceso.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void procesoVerificarElePen(ProcesoVerificarElePenMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoVerificarElePenMessage.class.getSimpleName());
        }
        if (proceso == null) {
            throw new EJBException(Proceso.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }
}
