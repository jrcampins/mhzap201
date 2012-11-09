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

public class ModificarConjuntoRolMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_ROL = 1370L;

    public static final long PARAMETRO_ID_CONJUNTO_SEGMENTO = 1312L;

    public static final long PARAMETRO_ES_SEGMENTADA = 1280L;

    protected Long idRol;

    protected Long idConjuntoSegmento;

    protected Integer esSegmentada;

    public ModificarConjuntoRolMessage(Long idRol, Long idConjuntoSegmento, Integer esSegmentada) {
        this.init();
        this.funcion = 106400106L;
        this.idRol = idRol;
        this.idConjuntoSegmento = idConjuntoSegmento;
        this.esSegmentada = esSegmentada;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public Long getIdConjuntoSegmento() {
        return idConjuntoSegmento;
    }

    public void setIdConjuntoSegmento(Long idConjuntoSegmento) {
        this.idConjuntoSegmento = idConjuntoSegmento;
    }

    public Integer getEsSegmentada() {
        return esSegmentada;
    }

    public void setEsSegmentada(Integer esSegmentada) {
        this.esSegmentada = esSegmentada;
    }
}
