/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
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

public class ReactivarPotencialBenMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_POTENCIAL_BEN = 20571L;

    protected Long idPotencialBen;

    public ReactivarPotencialBenMessage(Long idPotencialBen) {
        this.init();
        this.funcion = 320400152L;
        this.idPotencialBen = idPotencialBen;
    }

    public Long getIdPotencialBen() {
        return idPotencialBen;
    }

    public void setIdPotencialBen(Long idPotencialBen) {
        this.idPotencialBen = idPotencialBen;
    }
}
