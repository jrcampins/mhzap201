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

import com.egt.ejb.business.message.ProcesoImportarArchivosExtMessage;
import com.egt.ejb.business.message.ProcesoAcreditarPotBenMessage;
import com.egt.ejb.business.message.ProcesoPrepararProxPagoPenMessage;
import com.egt.ejb.business.message.ProcesoOtorgarPensionesAprMessage;
import com.egt.ejb.business.message.ProcesoDenegarPensionesObjMessage;
import com.egt.ejb.business.message.ProcesoActualizarPenEnJupeMessage;
import com.egt.ejb.business.message.ProcesoVerificarElePenMessage;
import com.egt.ejb.business.message.ProcesoAsignarMesaMessage;
import com.egt.ejb.persistence.entity.Proceso;
import javax.ejb.Local;

@Local
public interface ProcesoBusinessProcessLogicLocal {

    public void procesoImportarArchivosExt(ProcesoImportarArchivosExtMessage message, Proceso proceso) throws Exception;

    public void procesoAcreditarPotBen(ProcesoAcreditarPotBenMessage message, Proceso proceso) throws Exception;

    public void procesoPrepararProxPagoPen(ProcesoPrepararProxPagoPenMessage message, Proceso proceso) throws Exception;

    public void procesoOtorgarPensionesApr(ProcesoOtorgarPensionesAprMessage message, Proceso proceso) throws Exception;

    public void procesoDenegarPensionesObj(ProcesoDenegarPensionesObjMessage message, Proceso proceso) throws Exception;

    public void procesoActualizarPenEnJupe(ProcesoActualizarPenEnJupeMessage message, Proceso proceso) throws Exception;

    public void procesoVerificarElePen(ProcesoVerificarElePenMessage message, Proceso proceso) throws Exception;

    public void procesoAsignarMesa(ProcesoAsignarMesaMessage message, Proceso proceso) throws Exception;
}
