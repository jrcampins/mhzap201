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
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.PersonaAnotadaBase;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "persona_anotada")
public class PersonaAnotada implements PersonaAnotadaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_persona_anotada")
    private Long idPersonaAnotada;

    @Basic(optional = false)
    @Column(name = "version_persona_anotada")
    private long versionPersonaAnotada;

    @Basic(optional = false)
    @Column(name = "id_persona")
    private long idPersona;

    @Basic(optional = false)
    @Column(name = "codigo_persona")
    private String codigoPersona;

    @Basic(optional = false)
    @Column(name = "nombre_persona")
    private String nombrePersona;

    @Basic(optional = false)
    @Column(name = "id_usuario")
    private long idUsuario;

    @Basic(optional = false)
    @Column(name = "codigo_usuario")
    private String codigoUsuario;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Basic(optional = false)
    @Column(name = "fecha_hora_seleccion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraSeleccion;

    public PersonaAnotada() {
    }

    @Override
    public Long getIdPersonaAnotada() {
        return this.idPersonaAnotada;
    }

    public void setIdPersonaAnotada(Long idPersonaAnotada) {
        this.idPersonaAnotada = idPersonaAnotada;
    }

    @Override
    public long getVersionPersonaAnotada() {
        return this.versionPersonaAnotada;
    }

    public void setVersionPersonaAnotada(long versionPersonaAnotada) {
        this.versionPersonaAnotada = versionPersonaAnotada;
    }

    @Override
    public long getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(long idPersona) {
        this.idPersona = idPersona;
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
    public long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String getCodigoUsuario() {
        return this.codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    @Override
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public Date getFechaHoraSeleccion() {
        return this.fechaHoraSeleccion;
    }

    public void setFechaHoraSeleccion(Date fechaHoraSeleccion) {
        this.fechaHoraSeleccion = fechaHoraSeleccion;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof PersonaAnotada) {
            PersonaAnotada that = (PersonaAnotada) object;
            return idPersonaAnotada == null ? that.idPersonaAnotada == null ? 0 : -1
                    : idPersonaAnotada.compareTo(that.idPersonaAnotada);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idPersonaAnotada == null ? 0 : idPersonaAnotada.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof PersonaAnotada) {
            PersonaAnotada that = (PersonaAnotada) object;
            return ((idPersonaAnotada == null && that.idPersonaAnotada == null) ||
                    (idPersonaAnotada != null && idPersonaAnotada.equals(that.idPersonaAnotada)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idPersonaAnotada;
    }
}
