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
import java.util.Date;

public class RegistrarEntregaDocPersonaMessage extends BusinessProcessMessage implements Serializable {

    public static final long PARAMETRO_ID_PERSONA = 20002L;

    public static final long PARAMETRO_ES_PERSONA_CON_CER_VIDA = 20580L;

    public static final long PARAMETRO_CERTIFICADO_VIDA = 20112L;

    public static final long PARAMETRO_FECHA_CERTIFICADO_VIDA = 20122L;

    public static final long PARAMETRO_DIAS_VIGENCIA_CERTIFICADO_VIDA = 21020L;

    public static final long PARAMETRO_ES_PERSONA_CON_COPIA_CEDULA = 20679L;

    public static final long PARAMETRO_ES_PERSONA_CON_DECLARACION_JUR = 20680L;

    public static final long PARAMETRO_COMENTARIOS_ENTREGA_DOCUMENTOS = 21003L;

    protected Long idPersona;

    protected Integer esPersonaConCerVida;

    protected String certificadoVida;

    protected Date fechaCertificadoVida;

    protected Integer diasVigenciaCertificadoVida;

    protected Integer esPersonaConCopiaCedula;

    protected Integer esPersonaConDeclaracionJur;

    protected String comentariosEntregaDocumentos;

    public RegistrarEntregaDocPersonaMessage(Long idPersona, Integer esPersonaConCerVida, String certificadoVida, Date fechaCertificadoVida, Integer diasVigenciaCertificadoVida, Integer esPersonaConCopiaCedula, Integer esPersonaConDeclaracionJur, String comentariosEntregaDocumentos) {
        this.init();
        this.funcion = 201000162L;
        this.idPersona = idPersona;
        this.esPersonaConCerVida = esPersonaConCerVida;
        this.certificadoVida = certificadoVida;
        this.fechaCertificadoVida = fechaCertificadoVida;
        this.diasVigenciaCertificadoVida = diasVigenciaCertificadoVida;
        this.esPersonaConCopiaCedula = esPersonaConCopiaCedula;
        this.esPersonaConDeclaracionJur = esPersonaConDeclaracionJur;
        this.comentariosEntregaDocumentos = comentariosEntregaDocumentos;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getEsPersonaConCerVida() {
        return esPersonaConCerVida;
    }

    public void setEsPersonaConCerVida(Integer esPersonaConCerVida) {
        this.esPersonaConCerVida = esPersonaConCerVida;
    }

    public String getCertificadoVida() {
        return certificadoVida;
    }

    public void setCertificadoVida(String certificadoVida) {
        this.certificadoVida = certificadoVida;
    }

    public Date getFechaCertificadoVida() {
        return fechaCertificadoVida;
    }

    public void setFechaCertificadoVida(Date fechaCertificadoVida) {
        this.fechaCertificadoVida = fechaCertificadoVida;
    }

    public Integer getDiasVigenciaCertificadoVida() {
        return diasVigenciaCertificadoVida;
    }

    public void setDiasVigenciaCertificadoVida(Integer diasVigenciaCertificadoVida) {
        this.diasVigenciaCertificadoVida = diasVigenciaCertificadoVida;
    }

    public Integer getEsPersonaConCopiaCedula() {
        return esPersonaConCopiaCedula;
    }

    public void setEsPersonaConCopiaCedula(Integer esPersonaConCopiaCedula) {
        this.esPersonaConCopiaCedula = esPersonaConCopiaCedula;
    }

    public Integer getEsPersonaConDeclaracionJur() {
        return esPersonaConDeclaracionJur;
    }

    public void setEsPersonaConDeclaracionJur(Integer esPersonaConDeclaracionJur) {
        this.esPersonaConDeclaracionJur = esPersonaConDeclaracionJur;
    }

    public String getComentariosEntregaDocumentos() {
        return comentariosEntregaDocumentos;
    }

    public void setComentariosEntregaDocumentos(String comentariosEntregaDocumentos) {
        this.comentariosEntregaDocumentos = comentariosEntregaDocumentos;
    }
}
