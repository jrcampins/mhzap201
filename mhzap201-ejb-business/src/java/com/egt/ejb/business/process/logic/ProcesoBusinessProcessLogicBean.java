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
import com.egt.ejb.business.message.ProcesoAsignarMesaMessage;
import com.egt.ejb.business.message.ProcesoPrepararProxPagoPenMessage;
import com.egt.ejb.business.message.ProcesoOtorgarPensionesAprMessage;
import com.egt.ejb.business.message.ProcesoDenegarPensionesObjMessage;
import com.egt.ejb.business.message.ProcesoActualizarPenEnJupeMessage;
import com.egt.ejb.business.message.ProcesoAsignarMontoPensionMessage;
import com.egt.ejb.business.message.ProcesoVerificarElePenMessage;
import com.egt.ejb.business.message.ProcesoVerificarElePenJupeMessage;
import com.egt.ejb.business.message.ProcesoRevocarPensionesAprMessage;
import com.egt.ejb.business.message.ProcesoAprobarExclusionPenMessage;
import com.egt.ejb.business.message.ProcesoExpPenAprMessage;
import com.egt.ejb.business.message.ProcesoExpPenDenMessage;
import com.egt.ejb.business.message.ProcesoExpPenRevMessage;
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
    public void procesoAsignarMesa(ProcesoAsignarMesaMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoAsignarMesaMessage.class.getSimpleName());
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
    public void procesoDenegarPensionesObj(ProcesoDenegarPensionesObjMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoDenegarPensionesObjMessage.class.getSimpleName());
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
    public void procesoAsignarMontoPension(ProcesoAsignarMontoPensionMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoAsignarMontoPensionMessage.class.getSimpleName());
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

    @Override
    public void procesoVerificarElePenJupe(ProcesoVerificarElePenJupeMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoVerificarElePenJupeMessage.class.getSimpleName());
        }
        if (proceso == null) {
            throw new EJBException(Proceso.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void procesoRevocarPensionesApr(ProcesoRevocarPensionesAprMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoRevocarPensionesAprMessage.class.getSimpleName());
        }
        if (proceso == null) {
            throw new EJBException(Proceso.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void procesoAprobarExclusionPen(ProcesoAprobarExclusionPenMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoAprobarExclusionPenMessage.class.getSimpleName());
        }
        if (proceso == null) {
            throw new EJBException(Proceso.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void procesoExpPenApr(ProcesoExpPenAprMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoExpPenAprMessage.class.getSimpleName());
        }
        if (proceso == null) {
            throw new EJBException(Proceso.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void procesoExpPenDen(ProcesoExpPenDenMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoExpPenDenMessage.class.getSimpleName());
        }
        if (proceso == null) {
            throw new EJBException(Proceso.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void procesoExpPenRev(ProcesoExpPenRevMessage message, Proceso proceso) throws Exception {
        if (message == null) {
            throw new EJBException(ProcesoExpPenRevMessage.class.getSimpleName());
        }
        if (proceso == null) {
            throw new EJBException(Proceso.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }
}
