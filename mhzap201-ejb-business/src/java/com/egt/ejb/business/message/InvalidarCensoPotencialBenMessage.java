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

public class InvalidarCensoPotencialBenMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_POTENCIAL_BEN = 20571L;

    public static final long PARAMETRO_ID_FUNCIONARIO_VALIDACION_CEN = 20640L;

    public static final long PARAMETRO_NUMERO_CAUSA_INV_CENSO = 20649L;

    public static final long PARAMETRO_OTRA_CAUSA_INV_CENSO = 20650L;

    public static final long PARAMETRO_COMENTARIOS_VALIDACION_CENSO = 20633L;

    protected Long idPotencialBen;

    protected Long idFuncionarioValidacionCen;

    protected Integer numeroCausaInvCenso;

    protected String otraCausaInvCenso;

    protected String comentariosValidacionCenso;

    public InvalidarCensoPotencialBenMessage(Long idPotencialBen, Long idFuncionarioValidacionCen, Integer numeroCausaInvCenso, String otraCausaInvCenso, String comentariosValidacionCenso) {
        this.init();
        this.funcion = 320400155L;
        this.idPotencialBen = idPotencialBen;
        this.idFuncionarioValidacionCen = idFuncionarioValidacionCen;
        this.numeroCausaInvCenso = numeroCausaInvCenso;
        this.otraCausaInvCenso = otraCausaInvCenso;
        this.comentariosValidacionCenso = comentariosValidacionCenso;
    }

    public Long getIdPotencialBen() {
        return idPotencialBen;
    }

    public void setIdPotencialBen(Long idPotencialBen) {
        this.idPotencialBen = idPotencialBen;
    }

    public Long getIdFuncionarioValidacionCen() {
        return idFuncionarioValidacionCen;
    }

    public void setIdFuncionarioValidacionCen(Long idFuncionarioValidacionCen) {
        this.idFuncionarioValidacionCen = idFuncionarioValidacionCen;
    }

    public Integer getNumeroCausaInvCenso() {
        return numeroCausaInvCenso;
    }

    public void setNumeroCausaInvCenso(Integer numeroCausaInvCenso) {
        this.numeroCausaInvCenso = numeroCausaInvCenso;
    }

    public String getOtraCausaInvCenso() {
        return otraCausaInvCenso;
    }

    public void setOtraCausaInvCenso(String otraCausaInvCenso) {
        this.otraCausaInvCenso = otraCausaInvCenso;
    }

    public String getComentariosValidacionCenso() {
        return comentariosValidacionCenso;
    }

    public void setComentariosValidacionCenso(String comentariosValidacionCenso) {
        this.comentariosValidacionCenso = comentariosValidacionCenso;
    }
}
