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

public class RegUltVisCenPotencialBenMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_POTENCIAL_BEN = 20571L;

    public static final long PARAMETRO_FECHA_ULTIMA_VISITA_CENSO = 20673L;

    public static final long PARAMETRO_ID_FUNCIONARIO_ULT_VISITA_CEN = 20674L;

    public static final long PARAMETRO_OBSERVACIONES_ULT_VISITA_CEN = 20676L;

    protected Long idPotencialBen;

    protected Date fechaUltimaVisitaCenso;

    protected Long idFuncionarioUltVisitaCen;

    protected String observacionesUltVisitaCen;

    public RegUltVisCenPotencialBenMessage(Long idPotencialBen, Date fechaUltimaVisitaCenso, Long idFuncionarioUltVisitaCen, String observacionesUltVisitaCen) {
        this.init();
        this.funcion = 320400160L;
        this.idPotencialBen = idPotencialBen;
        this.fechaUltimaVisitaCenso = fechaUltimaVisitaCenso;
        this.idFuncionarioUltVisitaCen = idFuncionarioUltVisitaCen;
        this.observacionesUltVisitaCen = observacionesUltVisitaCen;
    }

    public Long getIdPotencialBen() {
        return idPotencialBen;
    }

    public void setIdPotencialBen(Long idPotencialBen) {
        this.idPotencialBen = idPotencialBen;
    }

    public Date getFechaUltimaVisitaCenso() {
        return fechaUltimaVisitaCenso;
    }

    public void setFechaUltimaVisitaCenso(Date fechaUltimaVisitaCenso) {
        this.fechaUltimaVisitaCenso = fechaUltimaVisitaCenso;
    }

    public Long getIdFuncionarioUltVisitaCen() {
        return idFuncionarioUltVisitaCen;
    }

    public void setIdFuncionarioUltVisitaCen(Long idFuncionarioUltVisitaCen) {
        this.idFuncionarioUltVisitaCen = idFuncionarioUltVisitaCen;
    }

    public String getObservacionesUltVisitaCen() {
        return observacionesUltVisitaCen;
    }

    public void setObservacionesUltVisitaCen(String observacionesUltVisitaCen) {
        this.observacionesUltVisitaCen = observacionesUltVisitaCen;
    }
}
