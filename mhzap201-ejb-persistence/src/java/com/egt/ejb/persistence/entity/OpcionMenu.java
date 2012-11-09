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

import com.egt.base.persistence.entity.OpcionMenuBase;
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
@Table(name = "opcion_menu")
public class OpcionMenu implements OpcionMenuBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_opcion_menu")
    private Long idOpcionMenu;

    @Basic(optional = false)
    @Column(name = "version_opcion_menu")
    private long versionOpcionMenu;

    @Basic(optional = false)
    @Column(name = "codigo_opcion_menu")
    private String codigoOpcionMenu;

    @Column(name = "nombre_opcion_menu")
    private String nombreOpcionMenu;

    @Column(name = "descripcion_opcion_menu")
    private String descripcionOpcionMenu;

    @Column(name = "url_opcion_menu")
    private String urlOpcionMenu;

    @Column(name = "secuencia_opcion_menu")
    private Integer secuenciaOpcionMenu;

    @Column(name = "clave_opcion_menu")
    private String claveOpcionMenu;

    @Basic(optional = false)
    @Column(name = "es_opcion_menu_inactiva")
    private int esOpcionMenuInactiva;

    @Basic(optional = false)
    @Column(name = "es_opcion_menu_sincronizada")
    private int esOpcionMenuSincronizada;

    @JoinColumn(name = "id_aplicacion", referencedColumnName = "id_aplicacion")
    @ManyToOne
    private Aplicacion aplicacionIdAplicacion;

    @JoinColumn(name = "id_pagina", referencedColumnName = "id_pagina")
    @ManyToOne
    private Pagina paginaIdPagina;

    @JoinColumn(name = "id_opcion_menu_superior", referencedColumnName = "id_opcion_menu")
    @ManyToOne
    private OpcionMenu opcionMenuIdOpcionMenuSuperior;

    @JoinColumn(name = "numero_tipo_nodo", referencedColumnName = "numero_tipo_nodo")
    @ManyToOne
    private TipoNodo tipoNodoNumeroTipoNodo;

    @JoinColumn(name = "numero_nivel_opcion_menu", referencedColumnName = "numero_nivel_opcion_menu")
    @ManyToOne
    private NivelOpcionMenu nivelOpcionMenuNumeroNivelOpcionMenu;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "opcionMenuIdOpcionMenuSuperior")
    private Collection<OpcionMenu> opcionMenuIdOpcionMenuSuperiorCollection;

    public OpcionMenu() {
    }

    @Override
    public Long getIdOpcionMenu() {
        return this.idOpcionMenu;
    }

    public void setIdOpcionMenu(Long idOpcionMenu) {
        this.idOpcionMenu = idOpcionMenu;
    }

    @Override
    public long getVersionOpcionMenu() {
        return this.versionOpcionMenu;
    }

    public void setVersionOpcionMenu(long versionOpcionMenu) {
        this.versionOpcionMenu = versionOpcionMenu;
    }

    @Override
    public String getCodigoOpcionMenu() {
        return this.codigoOpcionMenu;
    }

    public void setCodigoOpcionMenu(String codigoOpcionMenu) {
        this.codigoOpcionMenu = codigoOpcionMenu;
    }

    @Override
    public String getNombreOpcionMenu() {
        return this.nombreOpcionMenu;
    }

    public void setNombreOpcionMenu(String nombreOpcionMenu) {
        this.nombreOpcionMenu = nombreOpcionMenu;
    }

    @Override
    public String getDescripcionOpcionMenu() {
        return this.descripcionOpcionMenu;
    }

    public void setDescripcionOpcionMenu(String descripcionOpcionMenu) {
        this.descripcionOpcionMenu = descripcionOpcionMenu;
    }

    @Override
    public String getUrlOpcionMenu() {
        return this.urlOpcionMenu;
    }

    public void setUrlOpcionMenu(String urlOpcionMenu) {
        this.urlOpcionMenu = urlOpcionMenu;
    }

    @Override
    public Integer getSecuenciaOpcionMenu() {
        return this.secuenciaOpcionMenu;
    }

    public void setSecuenciaOpcionMenu(Integer secuenciaOpcionMenu) {
        this.secuenciaOpcionMenu = secuenciaOpcionMenu;
    }

    @Override
    public String getClaveOpcionMenu() {
        return this.claveOpcionMenu;
    }

    public void setClaveOpcionMenu(String claveOpcionMenu) {
        this.claveOpcionMenu = claveOpcionMenu;
    }

    @Override
    public int getEsOpcionMenuInactiva() {
        return this.esOpcionMenuInactiva;
    }

    public void setEsOpcionMenuInactiva(int esOpcionMenuInactiva) {
        this.esOpcionMenuInactiva = esOpcionMenuInactiva;
    }

    @Override
    public int getEsOpcionMenuSincronizada() {
        return this.esOpcionMenuSincronizada;
    }

    public void setEsOpcionMenuSincronizada(int esOpcionMenuSincronizada) {
        this.esOpcionMenuSincronizada = esOpcionMenuSincronizada;
    }

    @Override
    public Aplicacion getAplicacionIdAplicacion() {
        return this.aplicacionIdAplicacion;
    }

    public void setAplicacionIdAplicacion(Aplicacion aplicacion) {
        this.aplicacionIdAplicacion = aplicacion;
    }

    @Override
    public Pagina getPaginaIdPagina() {
        return this.paginaIdPagina;
    }

    public void setPaginaIdPagina(Pagina pagina) {
        this.paginaIdPagina = pagina;
    }

    @Override
    public OpcionMenu getOpcionMenuIdOpcionMenuSuperior() {
        return this.opcionMenuIdOpcionMenuSuperior;
    }

    public void setOpcionMenuIdOpcionMenuSuperior(OpcionMenu opcionMenu) {
        this.opcionMenuIdOpcionMenuSuperior = opcionMenu;
    }

    @Override
    public TipoNodo getTipoNodoNumeroTipoNodo() {
        return this.tipoNodoNumeroTipoNodo;
    }

    public void setTipoNodoNumeroTipoNodo(TipoNodo tipoNodo) {
        this.tipoNodoNumeroTipoNodo = tipoNodo;
    }

    @Override
    public NivelOpcionMenu getNivelOpcionMenuNumeroNivelOpcionMenu() {
        return this.nivelOpcionMenuNumeroNivelOpcionMenu;
    }

    public void setNivelOpcionMenuNumeroNivelOpcionMenu(NivelOpcionMenu nivelOpcionMenu) {
        this.nivelOpcionMenuNumeroNivelOpcionMenu = nivelOpcionMenu;
    }

    @Override
    public Collection<OpcionMenu> getOpcionMenuIdOpcionMenuSuperiorCollection() {
        return this.opcionMenuIdOpcionMenuSuperiorCollection;
    }

    public void setOpcionMenuIdOpcionMenuSuperiorCollection(Collection<OpcionMenu> collection) {
        this.opcionMenuIdOpcionMenuSuperiorCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof OpcionMenu) {
            OpcionMenu that = (OpcionMenu) object;
            return idOpcionMenu == null ? that.idOpcionMenu == null ? 0 : -1
                    : idOpcionMenu.compareTo(that.idOpcionMenu);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idOpcionMenu == null ? 0 : idOpcionMenu.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof OpcionMenu) {
            OpcionMenu that = (OpcionMenu) object;
            return ((idOpcionMenu == null && that.idOpcionMenu == null) ||
                    (idOpcionMenu != null && idOpcionMenu.equals(that.idOpcionMenu)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idOpcionMenu;
    }
}
