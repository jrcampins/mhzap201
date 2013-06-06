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

import com.egt.ejb.business.message.BorrarPersonaAnotadaMessage;
import com.egt.ejb.business.message.BorrarPersonaAnotadaOtroMessage;
import com.egt.ejb.persistence.entity.PersonaAnotada;
import javax.ejb.Local;

@Local
public interface PersonaAnotadaBusinessProcessLogicLocal {

    public void borrarPersonaAnotada(BorrarPersonaAnotadaMessage message, PersonaAnotada personaAnotada) throws Exception;

    public void borrarPersonaAnotadaOtro(BorrarPersonaAnotadaOtroMessage message, PersonaAnotada personaAnotada) throws Exception;
}
