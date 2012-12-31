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
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.LogProDenPenObjBase;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "log_pro_den_pen_obj")
public class LogProDenPenObj implements LogProDenPenObjBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_log_pro_den_pen_obj")
    private Long idLogProDenPenObj;

    @Basic(optional = false)
    @Column(name = "version_log_pro_den_pen_obj")
    private long versionLogProDenPenObj;

    @Column(name = "codigo_persona")
    private String codigoPersona;

    @Column(name = "nombre_persona")
    private String nombrePersona;

    @Basic(optional = false)
    @Column(name = "es_procesado")
    private int esProcesado;

    @Column(name = "observacion")
    private String observacion;

    @Basic(optional = false)
    @Column(name = "fecha_hora_transaccion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraTransaccion;

    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne
    private Persona personaIdPersona;

    @JoinColumn(name = "id_departamento", referencedColumnName = "id_ubicacion")
    @ManyToOne
    private Ubicacion ubicacionIdDepartamento;

    @JoinColumn(name = "id_distrito", referencedColumnName = "id_ubicacion")
    @ManyToOne
    private Ubicacion ubicacionIdDistrito;

    @JoinColumn(name = "id_barrio", referencedColumnName = "id_ubicacion")
    @ManyToOne
    private Ubicacion ubicacionIdBarrio;

    @JoinColumn(name = "numero_causa_den_pension", referencedColumnName = "numero_causa_den_pension")
    @ManyToOne
    private CausaDenPension causaDenPensionNumeroCausaDenPension;

    public LogProDenPenObj() {
    }

    @Override
    public Long getIdLogProDenPenObj() {
        return this.idLogProDenPenObj;
    }

    public void setIdLogProDenPenObj(Long idLogProDenPenObj) {
        this.idLogProDenPenObj = idLogProDenPenObj;
    }

    @Override
    public long getVersionLogProDenPenObj() {
        return this.versionLogProDenPenObj;
    }

    public void setVersionLogProDenPenObj(long versionLogProDenPenObj) {
        this.versionLogProDenPenObj = versionLogProDenPenObj;
    }

    @Override
    public String getCodigoPersona() {
        return this.codigoPersona;
    }

    public void setCodigoPersona(String codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    @Override
    public String getNombrePersona() {
        return this.nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public int getEsProcesado() {
        return this.esProcesado;
    }

    public void setEsProcesado(int esProcesado) {
        this.esProcesado = esProcesado;
    }

    @Override
    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public Date getFechaHoraTransaccion() {
        return this.fechaHoraTransaccion;
    }

    public void setFechaHoraTransaccion(Date fechaHoraTransaccion) {
        this.fechaHoraTransaccion = fechaHoraTransaccion;
    }

    @Override
    public Persona getPersonaIdPersona() {
        return this.personaIdPersona;
    }

    public void setPersonaIdPersona(Persona persona) {
        this.personaIdPersona = persona;
    }

    @Override
    public Ubicacion getUbicacionIdDepartamento() {
        return this.ubicacionIdDepartamento;
    }

    public void setUbicacionIdDepartamento(Ubicacion ubicacion) {
        this.ubicacionIdDepartamento = ubicacion;
    }

    @Override
    public Ubicacion getUbicacionIdDistrito() {
        return this.ubicacionIdDistrito;
    }

    public void setUbicacionIdDistrito(Ubicacion ubicacion) {
        this.ubicacionIdDistrito = ubicacion;
    }

    @Override
    public Ubicacion getUbicacionIdBarrio() {
        return this.ubicacionIdBarrio;
    }

    public void setUbicacionIdBarrio(Ubicacion ubicacion) {
        this.ubicacionIdBarrio = ubicacion;
    }

    @Override
    public CausaDenPension getCausaDenPensionNumeroCausaDenPension() {
        return this.causaDenPensionNumeroCausaDenPension;
    }

    public void setCausaDenPensionNumeroCausaDenPension(CausaDenPension causaDenPension) {
        this.causaDenPensionNumeroCausaDenPension = causaDenPension;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogProDenPenObj) {
            LogProDenPenObj that = (LogProDenPenObj) object;
            return idLogProDenPenObj == null ? that.idLogProDenPenObj == null ? 0 : -1
                    : idLogProDenPenObj.compareTo(that.idLogProDenPenObj);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idLogProDenPenObj == null ? 0 : idLogProDenPenObj.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogProDenPenObj) {
            LogProDenPenObj that = (LogProDenPenObj) object;
            return ((idLogProDenPenObj == null && that.idLogProDenPenObj == null) ||
                    (idLogProDenPenObj != null && idLogProDenPenObj.equals(that.idLogProDenPenObj)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idLogProDenPenObj;
    }
}
