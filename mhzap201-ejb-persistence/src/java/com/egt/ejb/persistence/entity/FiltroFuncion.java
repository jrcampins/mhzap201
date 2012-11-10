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

import com.egt.base.persistence.entity.FiltroFuncionBase;
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
@Table(name = "filtro_funcion")
public class FiltroFuncion implements FiltroFuncionBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_filtro_funcion")
    private Long idFiltroFuncion;

    @Basic(optional = false)
    @Column(name = "version_filtro_funcion")
    private long versionFiltroFuncion;

    @Basic(optional = false)
    @Column(name = "codigo_filtro_funcion")
    private String codigoFiltroFuncion;

    @Column(name = "nombre_filtro_funcion")
    private String nombreFiltroFuncion;

    @Column(name = "descripcion_filtro_funcion")
    private String descripcionFiltroFuncion;

    @Basic(optional = false)
    @Column(name = "es_publico")
    private int esPublico;

    @Column(name = "id_filtro_funcion_original")
    private Long idFiltroFuncionOriginal;

    @JoinColumn(name = "id_funcion", referencedColumnName = "id_funcion")
    @ManyToOne
    private Funcion funcionIdFuncion;

    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario usuarioIdUsuario;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "filtroFuncionIdFiltroFuncion")
    private Collection<FiltroFuncionPar> filtroFuncionParIdFiltroFuncionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "filtroFuncionIdFiltroFuncion")
    private Collection<RolFiltroFuncion> rolFiltroFuncionIdFiltroFuncionCollection;

    public FiltroFuncion() {
    }

    @Override
    public Long getIdFiltroFuncion() {
        return this.idFiltroFuncion;
    }

    public void setIdFiltroFuncion(Long idFiltroFuncion) {
        this.idFiltroFuncion = idFiltroFuncion;
    }

    @Override
    public long getVersionFiltroFuncion() {
        return this.versionFiltroFuncion;
    }

    public void setVersionFiltroFuncion(long versionFiltroFuncion) {
        this.versionFiltroFuncion = versionFiltroFuncion;
    }

    @Override
    public String getCodigoFiltroFuncion() {
        return this.codigoFiltroFuncion;
    }

    public void setCodigoFiltroFuncion(String codigoFiltroFuncion) {
        this.codigoFiltroFuncion = codigoFiltroFuncion;
    }

    @Override
    public String getNombreFiltroFuncion() {
        return this.nombreFiltroFuncion;
    }

    public void setNombreFiltroFuncion(String nombreFiltroFuncion) {
        this.nombreFiltroFuncion = nombreFiltroFuncion;
    }

    @Override
    public String getDescripcionFiltroFuncion() {
        return this.descripcionFiltroFuncion;
    }

    public void setDescripcionFiltroFuncion(String descripcionFiltroFuncion) {
        this.descripcionFiltroFuncion = descripcionFiltroFuncion;
    }

    @Override
    public int getEsPublico() {
        return this.esPublico;
    }

    public void setEsPublico(int esPublico) {
        this.esPublico = esPublico;
    }

    @Override
    public Long getIdFiltroFuncionOriginal() {
        return this.idFiltroFuncionOriginal;
    }

    public void setIdFiltroFuncionOriginal(Long idFiltroFuncionOriginal) {
        this.idFiltroFuncionOriginal = idFiltroFuncionOriginal;
    }

    @Override
    public Funcion getFuncionIdFuncion() {
        return this.funcionIdFuncion;
    }

    public void setFuncionIdFuncion(Funcion funcion) {
        this.funcionIdFuncion = funcion;
    }

    @Override
    public Usuario getUsuarioIdUsuario() {
        return this.usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(Usuario usuario) {
        this.usuarioIdUsuario = usuario;
    }

    @Override
    public Collection<FiltroFuncionPar> getFiltroFuncionParIdFiltroFuncionCollection() {
        return this.filtroFuncionParIdFiltroFuncionCollection;
    }

    public void setFiltroFuncionParIdFiltroFuncionCollection(Collection<FiltroFuncionPar> collection) {
        this.filtroFuncionParIdFiltroFuncionCollection = collection;
    }

    @Override
    public Collection<RolFiltroFuncion> getRolFiltroFuncionIdFiltroFuncionCollection() {
        return this.rolFiltroFuncionIdFiltroFuncionCollection;
    }

    public void setRolFiltroFuncionIdFiltroFuncionCollection(Collection<RolFiltroFuncion> collection) {
        this.rolFiltroFuncionIdFiltroFuncionCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof FiltroFuncion) {
            FiltroFuncion that = (FiltroFuncion) object;
            return idFiltroFuncion == null ? that.idFiltroFuncion == null ? 0 : -1
                    : idFiltroFuncion.compareTo(that.idFiltroFuncion);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idFiltroFuncion == null ? 0 : idFiltroFuncion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof FiltroFuncion) {
            FiltroFuncion that = (FiltroFuncion) object;
            return ((idFiltroFuncion == null && that.idFiltroFuncion == null) ||
                    (idFiltroFuncion != null && idFiltroFuncion.equals(that.idFiltroFuncion)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idFiltroFuncion;
    }
}
