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
package com.egt.core.db.ddl;

import java.util.LinkedHashMap;
import org.apache.commons.lang.StringUtils;

public class Clase {

    public Clase(Long identificacion, String nombre) {
        this.setIdentificacion(identificacion);
        this.setNombre(nombre);
        this.setDescripcion("");
        this.tablas = new LinkedHashMap();
    }

    /**
     * Conserva el valor de la propiedad identificacion.
     */
    private Long identificacion;

    /**
     * Getter para propiedad identificacion.
     * @return Valor de la propiedad identificacion.
     */
    public Long getIdentificacion() {
        return this.identificacion;
    }

    /**
     * Setter para propiedad identificacion.
     * @param identificacion Nuevo valor de la propiedad identificacion.
     */
    public void setIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Conserva el valor de la propiedad nombre.
     */
    private String nombre;

    /**
     * Getter para propiedad nombre.
     * @return Valor de la propiedad nombre.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Setter para propiedad nombre.
     * @param nombre Nuevo valor de la propiedad nombre.
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Conserva el valor de la propiedad descripcion.
     */
    private String descripcion;

    /**
     * Getter para propiedad descripcion.
     * @return Valor de la propiedad descripcion.
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Setter para propiedad descripcion.
     * @param descripcion Nuevo valor de la propiedad descripcion.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Conserva el valor de la propiedad tablas.
     */
    private LinkedHashMap tablas;

    /**
     * Getter para propiedad tablas.
     * @return Valor de la propiedad tablas.
     */
    public LinkedHashMap getTablas() {
        return this.tablas;
    }

    public Tabla addTabla(String identificacion, String nombre) {
        if (StringUtils.isBlank(identificacion) || StringUtils.isBlank(nombre)) {
            return null;
        }
        Tabla t = (Tabla) this.tablas.get(identificacion);
        if (t == null) {
            t = new Tabla(identificacion, nombre);
            this.tablas.put(identificacion, t);
        }
        t.getColumnas().clear();
        return t;
    }
}
