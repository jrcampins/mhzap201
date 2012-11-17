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
package com.egt.core.aplicacion;

import com.egt.core.enums.EnumSeveridadMensaje;

public class Mensaje {

    /**
     * Conserva el valor de la propiedad texto.
     */
    private String texto;

    /**
     * Conserva el valor de la propiedad severidad.
     */
    private EnumSeveridadMensaje severidad;

    /**
     * Creates a new instance of Mensaje
     */
    public Mensaje() {
        texto = null;
        severidad = EnumSeveridadMensaje.TRAZA;
    }

    public Mensaje(String texto) {
        this.texto = texto;
        severidad = EnumSeveridadMensaje.ERROR;
    }

    public Mensaje(String texto, EnumSeveridadMensaje severidad) {
        this.texto = texto;
        this.severidad = severidad;
    }

    /**
     * Getter para propiedad texto.
     *
     * @return Valor de la propiedad texto.
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Getter para propiedad severidad.
     *
     * @return Valor de la propiedad severidad.
     */
    public EnumSeveridadMensaje getSeveridad() {
        return severidad;
    }

    @Override
    public String toString() {
        return texto;
    }

}
