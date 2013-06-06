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
import com.egt.ejb.business.message.BorrarPersonaAnotadaMessage;
import com.egt.ejb.business.message.BorrarPersonaAnotadaOtroMessage;
import com.egt.ejb.persistence.entity.PersonaAnotada;
import com.egt.ejb.persistence.facade.PersonaAnotadaFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class PersonaAnotadaBusinessProcessLogicBean implements PersonaAnotadaBusinessProcessLogicLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private PersonaAnotadaFacadeLocal facade;
    // </editor-fold>

    @Override
    public void borrarPersonaAnotada(BorrarPersonaAnotadaMessage message, PersonaAnotada personaAnotada) throws Exception {
        if (message == null) {
            throw new EJBException(BorrarPersonaAnotadaMessage.class.getSimpleName());
        }
        if (personaAnotada == null) {
            throw new EJBException(PersonaAnotada.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void borrarPersonaAnotadaOtro(BorrarPersonaAnotadaOtroMessage message, PersonaAnotada personaAnotada) throws Exception {
        if (message == null) {
            throw new EJBException(BorrarPersonaAnotadaOtroMessage.class.getSimpleName());
        }
        if (personaAnotada == null) {
            throw new EJBException(PersonaAnotada.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        personaAnotada.setIdUsuario(message.getIdUsuario() == null ? new Long("0") : message.getIdUsuario());
    }
}
