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
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.RastroFuncionBase;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "rastro_funcion")
public class RastroFuncion implements RastroFuncionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_rastro_funcion")
    private Long idRastroFuncion;

    @Basic(optional = false)
    @Column(name = "fecha_hora_ejecucion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraEjecucion;

    @Basic(optional = false)
    @Column(name = "id_usuario")
    private long idUsuario;

    @Column(name = "id_recurso")
    private Long idRecurso;

    @Column(name = "version_recurso")
    private Long versionRecurso;

    @Column(name = "codigo_recurso")
    private String codigoRecurso;

    @Column(name = "nombre_recurso")
    private String nombreRecurso;

    @Column(name = "id_propietario_recurso")
    private Long idPropietarioRecurso;

    @Column(name = "id_segmento_recurso")
    private Long idSegmentoRecurso;

    @Column(name = "numero_error")
    private Integer numeroError;

    @Column(name = "descripcion_error")
    private String descripcionError;

    @JoinColumn(name = "id_funcion", referencedColumnName = "id_funcion")
    @ManyToOne
    private Funcion funcionIdFuncion;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "rastroFuncionIdRastroFuncion")
    private Collection<RastroFuncionPar> rastroFuncionParIdRastroFuncionCollection;

    public RastroFuncion() {
    }

    @Override
    public Long getIdRastroFuncion() {
        return this.idRastroFuncion;
    }

    public void setIdRastroFuncion(Long idRastroFuncion) {
        this.idRastroFuncion = idRastroFuncion;
    }

    @Override
    public Date getFechaHoraEjecucion() {
        return this.fechaHoraEjecucion;
    }

    public void setFechaHoraEjecucion(Date fechaHoraEjecucion) {
        this.fechaHoraEjecucion = fechaHoraEjecucion;
    }

    @Override
    public long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public Long getIdRecurso() {
        return this.idRecurso;
    }

    public void setIdRecurso(Long idRecurso) {
        this.idRecurso = idRecurso;
    }

    @Override
    public Long getVersionRecurso() {
        return this.versionRecurso;
    }

    public void setVersionRecurso(Long versionRecurso) {
        this.versionRecurso = versionRecurso;
    }

    @Override
    public String getCodigoRecurso() {
        return this.codigoRecurso;
    }

    public void setCodigoRecurso(String codigoRecurso) {
        this.codigoRecurso = codigoRecurso;
    }

    @Override
    public String getNombreRecurso() {
        return this.nombreRecurso;
    }

    public void setNombreRecurso(String nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }

    @Override
    public Long getIdPropietarioRecurso() {
        return this.idPropietarioRecurso;
    }

    public void setIdPropietarioRecurso(Long idPropietarioRecurso) {
        this.idPropietarioRecurso = idPropietarioRecurso;
    }

    @Override
    public Long getIdSegmentoRecurso() {
        return this.idSegmentoRecurso;
    }

    public void setIdSegmentoRecurso(Long idSegmentoRecurso) {
        this.idSegmentoRecurso = idSegmentoRecurso;
    }

    @Override
    public Integer getNumeroError() {
        return this.numeroError;
    }

    public void setNumeroError(Integer numeroError) {
        this.numeroError = numeroError;
    }

    @Override
    public String getDescripcionError() {
        return this.descripcionError;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    @Override
    public Funcion getFuncionIdFuncion() {
        return this.funcionIdFuncion;
    }

    public void setFuncionIdFuncion(Funcion funcion) {
        this.funcionIdFuncion = funcion;
    }

    @Override
    public Collection<RastroFuncionPar> getRastroFuncionParIdRastroFuncionCollection() {
        return this.rastroFuncionParIdRastroFuncionCollection;
    }

    public void setRastroFuncionParIdRastroFuncionCollection(Collection<RastroFuncionPar> collection) {
        this.rastroFuncionParIdRastroFuncionCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RastroFuncion) {
            RastroFuncion that = (RastroFuncion) object;
            return idRastroFuncion == null ? that.idRastroFuncion == null ? 0 : -1
                    : idRastroFuncion.compareTo(that.idRastroFuncion);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idRastroFuncion == null ? 0 : idRastroFuncion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof RastroFuncion) {
            RastroFuncion that = (RastroFuncion) object;
            return ((idRastroFuncion == null && that.idRastroFuncion == null) ||
                    (idRastroFuncion != null && idRastroFuncion.equals(that.idRastroFuncion)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idRastroFuncion;
    }
}
