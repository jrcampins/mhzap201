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
import java.util.Date;

public class DenegarReclCenPotencialBenMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_POTENCIAL_BEN = 20571L;

    public static final long PARAMETRO_NUMERO_CAUSA_DEN_RECL_CEN = 20642L;

    public static final long PARAMETRO_OTRA_CAUSA_DEN_RECL_CEN = 20646L;

    public static final long PARAMETRO_COMENTARIOS_DEN_RECL_CEN = 20631L;

    protected Long idPotencialBen;

    protected Integer numeroCausaDenReclCen;

    protected String otraCausaDenReclCen;

    protected String comentariosDenReclCen;

    public DenegarReclCenPotencialBenMessage(Long idPotencialBen, Integer numeroCausaDenReclCen, String otraCausaDenReclCen, String comentariosDenReclCen) {
        this.init();
        this.funcion = 320400158L;
        this.idPotencialBen = idPotencialBen;
        this.numeroCausaDenReclCen = numeroCausaDenReclCen;
        this.otraCausaDenReclCen = otraCausaDenReclCen;
        this.comentariosDenReclCen = comentariosDenReclCen;
    }

    public Long getIdPotencialBen() {
        return idPotencialBen;
    }

    public void setIdPotencialBen(Long idPotencialBen) {
        this.idPotencialBen = idPotencialBen;
    }

    public Integer getNumeroCausaDenReclCen() {
        return numeroCausaDenReclCen;
    }

    public void setNumeroCausaDenReclCen(Integer numeroCausaDenReclCen) {
        this.numeroCausaDenReclCen = numeroCausaDenReclCen;
    }

    public String getOtraCausaDenReclCen() {
        return otraCausaDenReclCen;
    }

    public void setOtraCausaDenReclCen(String otraCausaDenReclCen) {
        this.otraCausaDenReclCen = otraCausaDenReclCen;
    }

    public String getComentariosDenReclCen() {
        return comentariosDenReclCen;
    }

    public void setComentariosDenReclCen(String comentariosDenReclCen) {
        this.comentariosDenReclCen = comentariosDenReclCen;
    }
}
