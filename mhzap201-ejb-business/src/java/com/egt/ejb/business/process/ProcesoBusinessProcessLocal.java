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
package com.egt.ejb.business.process;

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
import javax.ejb.Local;

@Local
public interface ProcesoBusinessProcessLocal {

    public ProcesoImportarArchivosExtMessage procesoImportarArchivosExt(ProcesoImportarArchivosExtMessage message);

    public ProcesoAcreditarPotBenMessage procesoAcreditarPotBen(ProcesoAcreditarPotBenMessage message);

    public ProcesoAsignarMesaMessage procesoAsignarMesa(ProcesoAsignarMesaMessage message);

    public ProcesoPrepararProxPagoPenMessage procesoPrepararProxPagoPen(ProcesoPrepararProxPagoPenMessage message);

    public ProcesoOtorgarPensionesAprMessage procesoOtorgarPensionesApr(ProcesoOtorgarPensionesAprMessage message);

    public ProcesoDenegarPensionesObjMessage procesoDenegarPensionesObj(ProcesoDenegarPensionesObjMessage message);

    public ProcesoActualizarPenEnJupeMessage procesoActualizarPenEnJupe(ProcesoActualizarPenEnJupeMessage message);

    public ProcesoAsignarMontoPensionMessage procesoAsignarMontoPension(ProcesoAsignarMontoPensionMessage message);

    public ProcesoVerificarElePenMessage procesoVerificarElePen(ProcesoVerificarElePenMessage message);

    public ProcesoVerificarElePenJupeMessage procesoVerificarElePenJupe(ProcesoVerificarElePenJupeMessage message);

    public ProcesoRevocarPensionesAprMessage procesoRevocarPensionesApr(ProcesoRevocarPensionesAprMessage message);

    public ProcesoAprobarExclusionPenMessage procesoAprobarExclusionPen(ProcesoAprobarExclusionPenMessage message);

    public ProcesoExpPenAprMessage procesoExpPenApr(ProcesoExpPenAprMessage message);

    public ProcesoExpPenDenMessage procesoExpPenDen(ProcesoExpPenDenMessage message);

    public ProcesoExpPenRevMessage procesoExpPenRev(ProcesoExpPenRevMessage message);
}
