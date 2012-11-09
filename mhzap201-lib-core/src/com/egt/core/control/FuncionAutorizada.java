/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 *
 */
package com.egt.core.control;

import java.io.Serializable;

public class FuncionAutorizada implements Serializable {

    /**
     * Conserva el valor de la propiedad funcion.
     */
    private long funcion;

    /**
     * Conserva el valor de la propiedad publica.
     */
    private boolean publica;

    /**
     * Conserva el valor de la propiedad programatica.
     */
    private boolean programatica;

    /**
     * Conserva el valor de la propiedad personalizada.
     */
    private boolean personalizada;

    /**
     * Conserva el valor de la propiedad segmentada.
     */
    private boolean segmentada;

    /**
     * Conserva el valor de la propiedad lectura.
     */
    private boolean lectura;

    /**
     * Creates a new instance of FuncionAutorizada
     */
    public FuncionAutorizada() {
        funcion = -1;
        publica = false;
        programatica = false;
        personalizada = false;
        segmentada = false;
        lectura = false;
    }

    /**
     * Getter para propiedad funcion.
     *
     * @return Valor de la propiedad funcion.
     */
    public long getFuncion() {
        return funcion;
    }

    /**
     * Setter para propiedad funcion.
     *
     * @param idFuncion Nuevo valor de la propiedad funcion.
     */
    public void setFuncion(long idFuncion) {
        funcion = idFuncion;
    }

    /**
     * Getter para propiedad publica.
     *
     * @return Valor de la propiedad publica.
     */
    public boolean isPublica() {
        return publica;
    }

    /**
     * Setter para propiedad publica.
     *
     * @param publica Nuevo valor de la propiedad publica.
     */
    public void setPublica(boolean publica) {
        this.publica = publica;
    }

    /**
     * Getter para propiedad programatica.
     *
     * @return Valor de la propiedad programatica.
     */
    public boolean isProgramatica() {
        return programatica;
    }

    /**
     * Setter para propiedad programatica.
     *
     * @param programatica Nuevo valor de la propiedad programatica.
     */
    public void setProgramatica(boolean programatica) {
        this.programatica = programatica;
    }

    /**
     * Getter para propiedad personalizada.
     *
     * @return Valor de la propiedad personalizada.
     */
    public boolean isPersonalizada() {
        return personalizada;
    }

    /**
     * Setter para propiedad personalizada.
     *
     * @param personalizada Nuevo valor de la propiedad personalizada.
     */
    public void setPersonalizada(boolean personalizada) {
        this.personalizada = personalizada;
    }

    /**
     * Getter para propiedad segmentada.
     *
     * @return Valor de la propiedad segmentada.
     */
    public boolean isSegmentada() {
        return segmentada;
    }

    /**
     * Setter para propiedad segmentada.
     *
     * @param segmentada Nuevo valor de la propiedad segmentada.
     */
    public void setSegmentada(boolean segmentada) {
        this.segmentada = segmentada;
    }

    /**
     * Getter para propiedad lectura.
     *
     * @return Valor de la propiedad lectura.
     */
    public boolean isLectura() {
        return lectura;
    }

    /**
     * Setter para propiedad lectura.
     *
     * @param lectura Nuevo valor de la propiedad lectura.
     */
    public void setLectura(boolean lectura) {
        this.lectura = lectura;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (obj instanceof FuncionAutorizada) {
            FuncionAutorizada that = (FuncionAutorizada) obj;
            return this.funcion == that.getFuncion();
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (this.funcion ^ (this.funcion >>> 32));
        hash = 89 * hash + (this.publica ? 1 : 0);
        hash = 89 * hash + (this.programatica ? 1 : 0);
        hash = 89 * hash + (this.personalizada ? 1 : 0);
        hash = 89 * hash + (this.segmentada ? 1 : 0);
        hash = 89 * hash + (this.lectura ? 1 : 0);
        return hash;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                + "(" + "funcion=" + funcion
                + "," + "publica=" + publica
                + "," + "programatica=" + programatica
                + "," + "personalizada=" + personalizada
                + "," + "segmentada=" + segmentada
                + "," + "lectura=" + lectura
                + ")";
    }

}
