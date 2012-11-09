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
import com.egt.ejb.business.message.ReconstruirUbicacionMessage;
import com.egt.ejb.persistence.entity.Ubicacion;
import com.egt.ejb.persistence.facade.UbicacionFacadeLocal;
import com.egt.ejb.persistence.facade.TipoNodoFacadeLocal;
import com.egt.ejb.persistence.facade.NivelUbicacionFacadeLocal;
import com.egt.ejb.persistence.facade.TipoAreaFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class UbicacionBusinessProcessLogicBean implements UbicacionBusinessProcessLogicLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private UbicacionFacadeLocal facade;

    @EJB
    private UbicacionFacadeLocal ubicacionFacade;

    @EJB
    private TipoNodoFacadeLocal tipoNodoFacade;

    @EJB
    private NivelUbicacionFacadeLocal nivelUbicacionFacade;

    @EJB
    private TipoAreaFacadeLocal tipoAreaFacade;
    // </editor-fold>

    @Override
    public void reconstruirUbicacion(ReconstruirUbicacionMessage message, Ubicacion ubicacion) throws Exception {
        if (message == null) {
            throw new EJBException(ReconstruirUbicacionMessage.class.getSimpleName());
        }
        if (ubicacion == null) {
            throw new EJBException(Ubicacion.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }
}
