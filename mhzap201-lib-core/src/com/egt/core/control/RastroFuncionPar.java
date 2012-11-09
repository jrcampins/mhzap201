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

import com.egt.core.util.STP;

public class RastroFuncionPar {

    /**
     * Conserva el valor de la propiedad idParametro.
     */
    private Long idParametro;

    /**
     * Conserva el valor de la propiedad valorParametro.
     */
    private String valorParametro;

    /** Creates a new instance of RastroFuncionPar */
    public RastroFuncionPar() {
        idParametro = null;
        valorParametro = null;
    }

    /** Creates a new instance of RastroFuncionPar */
    public RastroFuncionPar(Long idParametro, Object valorParametro) {
        this.idParametro = idParametro;
        this.valorParametro = STP.getString(valorParametro);
    }

    /**
     * Getter para propiedad idParametro.
     * 
     * @return Valor de la propiedad idParametro.
     */
    public Long getIdParametro() {
        return idParametro;
    }

    /**
     * Setter para propiedad idParametro.
     * 
     * @param idParametro
     *            Nuevo valor de la propiedad idParametro.
     */
    public void setIdParametro(Long idParametro) {
        this.idParametro = idParametro;
    }

    /**
     * Getter para propiedad valorParametro.
     * 
     * @return Valor de la propiedad valorParametro.
     */
    public String getValorParametro() {
        return valorParametro;
    }

    /**
     * Setter para propiedad valorParametro.
     * 
     * @param valorParametro
     *            Nuevo valor de la propiedad valorParametro.
     */
    public void setValorParametro(String valorParametro) {
        this.valorParametro = valorParametro;
    }
}
