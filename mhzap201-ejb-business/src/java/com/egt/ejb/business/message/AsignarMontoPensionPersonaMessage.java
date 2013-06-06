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
package com.egt.ejb.business.message;

import com.egt.ejb.business.jms.BusinessProcessMessage;
import java.io.Serializable;
import java.math.BigDecimal;

public class AsignarMontoPensionPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_MONTO_PENSION = 20197L;

    protected Long idPersona;

    protected BigDecimal montoPension;

    public AsignarMontoPensionPersonaMessage(Long idPersona, BigDecimal montoPension) {
        this.init();
        this.funcion = 201000164L;
        this.idPersona = idPersona;
        this.montoPension = montoPension;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public BigDecimal getMontoPension() {
        return montoPension;
    }

    public void setMontoPension(BigDecimal montoPension) {
        this.montoPension = montoPension;
    }
}
