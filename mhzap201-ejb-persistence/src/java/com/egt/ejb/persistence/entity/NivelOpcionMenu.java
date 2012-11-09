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

import com.egt.base.persistence.entity.NivelOpcionMenuBase;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nivel_opcion_menu")
public class NivelOpcionMenu implements NivelOpcionMenuBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "numero_nivel_opcion_menu")
    private Integer numeroNivelOpcionMenu;

    @Basic(optional = false)
    @Column(name = "codigo_nivel_opcion_menu")
    private String codigoNivelOpcionMenu;

    @Basic(optional = false)
    @Column(name = "digitos_nivel_opcion_menu")
    private int digitosNivelOpcionMenu;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "nivelOpcionMenuNumeroNivelOpcionMenu")
    private Collection<OpcionMenu> opcionMenuNumeroNivelOpcionMenuCollection;

    public NivelOpcionMenu() {
    }

    @Override
    public Integer getNumeroNivelOpcionMenu() {
        return this.numeroNivelOpcionMenu;
    }

    public void setNumeroNivelOpcionMenu(Integer numeroNivelOpcionMenu) {
        this.numeroNivelOpcionMenu = numeroNivelOpcionMenu;
    }

    @Override
    public String getCodigoNivelOpcionMenu() {
        return this.codigoNivelOpcionMenu;
    }

    public void setCodigoNivelOpcionMenu(String codigoNivelOpcionMenu) {
        this.codigoNivelOpcionMenu = codigoNivelOpcionMenu;
    }

    @Override
    public int getDigitosNivelOpcionMenu() {
        return this.digitosNivelOpcionMenu;
    }

    public void setDigitosNivelOpcionMenu(int digitosNivelOpcionMenu) {
        this.digitosNivelOpcionMenu = digitosNivelOpcionMenu;
    }

    @Override
    public Collection<OpcionMenu> getOpcionMenuNumeroNivelOpcionMenuCollection() {
        return this.opcionMenuNumeroNivelOpcionMenuCollection;
    }

    public void setOpcionMenuNumeroNivelOpcionMenuCollection(Collection<OpcionMenu> collection) {
        this.opcionMenuNumeroNivelOpcionMenuCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof NivelOpcionMenu) {
            NivelOpcionMenu that = (NivelOpcionMenu) object;
            return numeroNivelOpcionMenu == null ? that.numeroNivelOpcionMenu == null ? 0 : -1
                    : numeroNivelOpcionMenu.compareTo(that.numeroNivelOpcionMenu);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += numeroNivelOpcionMenu == null ? 0 : numeroNivelOpcionMenu.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof NivelOpcionMenu) {
            NivelOpcionMenu that = (NivelOpcionMenu) object;
            return ((numeroNivelOpcionMenu == null && that.numeroNivelOpcionMenu == null) ||
                    (numeroNivelOpcionMenu != null && numeroNivelOpcionMenu.equals(that.numeroNivelOpcionMenu)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + numeroNivelOpcionMenu;
    }
}
