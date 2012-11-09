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
import com.egt.ejb.business.message.ProcesoPrepararProxPagoPenMessage;
import com.egt.ejb.business.message.ProcesoAcreditarPotBenMessage;
import com.egt.ejb.business.message.ProcesoActualizarPenEnJupeMessage;
import com.egt.ejb.business.message.ProcesoVerificarElePenMessage;
import com.egt.ejb.business.message.ProcesoOtorgarPensionesAprMessage;
import javax.ejb.Local;

@Local
public interface ProcesoBusinessProcessLocal {

    public ProcesoImportarArchivosExtMessage procesoImportarArchivosExt(ProcesoImportarArchivosExtMessage message);

    public ProcesoPrepararProxPagoPenMessage procesoPrepararProxPagoPen(ProcesoPrepararProxPagoPenMessage message);

    public ProcesoAcreditarPotBenMessage procesoAcreditarPotBen(ProcesoAcreditarPotBenMessage message);

    public ProcesoActualizarPenEnJupeMessage procesoActualizarPenEnJupe(ProcesoActualizarPenEnJupeMessage message);

    public ProcesoVerificarElePenMessage procesoVerificarElePen(ProcesoVerificarElePenMessage message);

    public ProcesoOtorgarPensionesAprMessage procesoOtorgarPensionesApr(ProcesoOtorgarPensionesAprMessage message);
}
