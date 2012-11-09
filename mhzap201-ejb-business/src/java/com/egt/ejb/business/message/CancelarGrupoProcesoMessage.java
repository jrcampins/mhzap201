/*
 * Copyright (C) 2008, EGT Consultores, C.A.
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

public class CancelarGrupoProcesoMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_GRUPO_PROCESO = 1333L;

    protected Long idGrupoProceso;

    public CancelarGrupoProcesoMessage(Long idGrupoProceso) {
        this.init();
        this.funcion = 107500151L;
        this.idGrupoProceso = idGrupoProceso;
    }

    public Long getIdGrupoProceso() {
        return idGrupoProceso;
    }

    public void setIdGrupoProceso(Long idGrupoProceso) {
        this.idGrupoProceso = idGrupoProceso;
    }
}
