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

import com.egt.base.persistence.entity.AplicacionBase;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aplicacion")
public class Aplicacion implements AplicacionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_aplicacion")
    private Long idAplicacion;

    @Basic(optional = false)
    @Column(name = "version_aplicacion")
    private long versionAplicacion;

    @Basic(optional = false)
    @Column(name = "codigo_aplicacion")
    private String codigoAplicacion;

    @Column(name = "nombre_aplicacion")
    private String nombreAplicacion;

    @Column(name = "descripcion_aplicacion")
    private String descripcionAplicacion;

    @Basic(optional = false)
    @Column(name = "servidor_aplicacion")
    private String servidorAplicacion;

    @Basic(optional = false)
    @Column(name = "puerto_aplicacion")
    private String puertoAplicacion;

    @Column(name = "url_aplicacion")
    private String urlAplicacion;

    @Basic(optional = false)
    @Column(name = "es_publica")
    private int esPublica;

    @JoinColumn(name = "id_grupo_aplicacion", referencedColumnName = "id_grupo_aplicacion")
    @ManyToOne
    private GrupoAplicacion grupoAplicacionIdGrupoAplicacion;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "aplicacionIdAplicacion")
    private Collection<OpcionMenu> opcionMenuIdAplicacionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "aplicacionIdAplicacion")
    private Collection<Pagina> paginaIdAplicacionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "aplicacionIdAplicacion")
    private Collection<RolAplicacion> rolAplicacionIdAplicacionCollection;

    public Aplicacion() {
    }

    @Override
    public Long getIdAplicacion() {
        return this.idAplicacion;
    }

    public void setIdAplicacion(Long idAplicacion) {
        this.idAplicacion = idAplicacion;
    }

    @Override
    public long getVersionAplicacion() {
        return this.versionAplicacion;
    }

    public void setVersionAplicacion(long versionAplicacion) {
        this.versionAplicacion = versionAplicacion;
    }

    @Override
    public String getCodigoAplicacion() {
        return this.codigoAplicacion;
    }

    public void setCodigoAplicacion(String codigoAplicacion) {
        this.codigoAplicacion = codigoAplicacion;
    }

    @Override
    public String getNombreAplicacion() {
        return this.nombreAplicacion;
    }

    public void setNombreAplicacion(String nombreAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
    }

    @Override
    public String getDescripcionAplicacion() {
        return this.descripcionAplicacion;
    }

    public void setDescripcionAplicacion(String descripcionAplicacion) {
        this.descripcionAplicacion = descripcionAplicacion;
    }

    @Override
    public String getServidorAplicacion() {
        return this.servidorAplicacion;
    }

    public void setServidorAplicacion(String servidorAplicacion) {
        this.servidorAplicacion = servidorAplicacion;
    }

    @Override
    public String getPuertoAplicacion() {
        return this.puertoAplicacion;
    }

    public void setPuertoAplicacion(String puertoAplicacion) {
        this.puertoAplicacion = puertoAplicacion;
    }

    @Override
    public String getUrlAplicacion() {
        return this.urlAplicacion;
    }

    public void setUrlAplicacion(String urlAplicacion) {
        this.urlAplicacion = urlAplicacion;
    }

    @Override
    public int getEsPublica() {
        return this.esPublica;
    }

    public void setEsPublica(int esPublica) {
        this.esPublica = esPublica;
    }

    @Override
    public GrupoAplicacion getGrupoAplicacionIdGrupoAplicacion() {
        return this.grupoAplicacionIdGrupoAplicacion;
    }

    public void setGrupoAplicacionIdGrupoAplicacion(GrupoAplicacion grupoAplicacion) {
        this.grupoAplicacionIdGrupoAplicacion = grupoAplicacion;
    }

    @Override
    public Collection<OpcionMenu> getOpcionMenuIdAplicacionCollection() {
        return this.opcionMenuIdAplicacionCollection;
    }

    public void setOpcionMenuIdAplicacionCollection(Collection<OpcionMenu> collection) {
        this.opcionMenuIdAplicacionCollection = collection;
    }

    @Override
    public Collection<Pagina> getPaginaIdAplicacionCollection() {
        return this.paginaIdAplicacionCollection;
    }

    public void setPaginaIdAplicacionCollection(Collection<Pagina> collection) {
        this.paginaIdAplicacionCollection = collection;
    }

    @Override
    public Collection<RolAplicacion> getRolAplicacionIdAplicacionCollection() {
        return this.rolAplicacionIdAplicacionCollection;
    }

    public void setRolAplicacionIdAplicacionCollection(Collection<RolAplicacion> collection) {
        this.rolAplicacionIdAplicacionCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Aplicacion) {
            Aplicacion that = (Aplicacion) object;
            return idAplicacion == null ? that.idAplicacion == null ? 0 : -1
                    : idAplicacion.compareTo(that.idAplicacion);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idAplicacion == null ? 0 : idAplicacion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Aplicacion) {
            Aplicacion that = (Aplicacion) object;
            return ((idAplicacion == null && that.idAplicacion == null) ||
                    (idAplicacion != null && idAplicacion.equals(that.idAplicacion)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idAplicacion;
    }
}
