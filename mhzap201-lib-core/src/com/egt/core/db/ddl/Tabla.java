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

import com.egt.commons.util.IntUtils;
import java.util.LinkedHashMap;
import org.apache.commons.lang.StringUtils;

public class Tabla {

    public Tabla(String identificacion, String nombre) {
        this.setIdentificacion(identificacion);
        this.setNombre(nombre);
        this.setDescripcion("");
        this.setSeccion(0L);
        this.setPropiedad(0L);
        this.setSincronizada(IntUtils.FALSE);
        this.claves = new LinkedHashMap();
        this.columnas = new LinkedHashMap();
        this.propiedades = new LinkedHashMap();
    }

    /**
     * Conserva el valor de la propiedad identificacion.
     */
    private String identificacion;

    /**
     * Getter para propiedad identificacion.
     * @return Valor de la propiedad identificacion.
     */
    public String getIdentificacion() {
        return this.identificacion;
    }

    /**
     * Setter para propiedad identificacion.
     * @param identificacion Nuevo valor de la propiedad identificacion.
     */
    public void setIdentificacion(String identificacion) {
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
     * Conserva el valor de la propiedad seccion.
     */
    private Long seccion;

    /**
     * Getter para propiedad seccion.
     * @return Valor de la propiedad seccion.
     */
    public Long getSeccion() {
        return this.seccion;
    }

    /**
     * Setter para propiedad seccion.
     * @param seccion Nuevo valor de la propiedad seccion.
     */
    public void setSeccion(Long seccion) {
        this.seccion = seccion;
    }

    /**
     * Conserva el valor de la propiedad propiedad.
     */
    private Long propiedad;

    /**
     * Getter para propiedad propiedad.
     * @return Valor de la propiedad propiedad.
     */
    public Long getPropiedad() {
        return this.propiedad;
    }

    /**
     * Setter para propiedad propiedad.
     * @param propiedad Nuevo valor de la propiedad propiedad.
     */
    public void setPropiedad(Long propiedad) {
        this.propiedad = propiedad;
    }

    /**
     * Conserva el valor de la propiedad sincronizada.
     */
    private Integer sincronizada;

    /**
     * Getter para propiedad sincronizada.
     * @return Valor de la propiedad sincronizada.
     */
    public Integer getSincronizada() {
        return this.sincronizada;
    }

    /**
     * Setter para propiedad sincronizada.
     * @param sincronizada Nuevo valor de la propiedad sincronizada.
     */
    public void setSincronizada(Integer sincronizada) {
        this.sincronizada = sincronizada;
    }

    /**
     * Conserva el valor de la propiedad claves.
     */
    private LinkedHashMap claves;

    /**
     * Getter para propiedad claves.
     * @return Valor de la propiedad claves.
     */
    public LinkedHashMap getClaves() {
        return this.claves;
    }

    /**
     * Conserva el valor de la propiedad columnas.
     */
    private LinkedHashMap columnas;

    /**
     * Getter para propiedad columnas.
     * @return Valor de la propiedad columnas.
     */
    public LinkedHashMap getColumnas() {
        return this.columnas;
    }

    /**
     * Conserva el valor de la propiedad propiedades.
     */
    private LinkedHashMap propiedades;

    /**
     * Getter para propiedad propiedades.
     * @return Valor de la propiedad propiedades.
     */
    public LinkedHashMap getPropiedades() {
        return this.propiedades;
    }

    public Clave addClave(String nombre, Integer tipo) {
        if (StringUtils.isBlank(nombre) || tipo == null) {
            return null;
        }
        String key = tipo + "_" + nombre;
        Clave c = (Clave) this.claves.get(key);
        if (c == null) {
            c = new Clave(nombre, tipo);
            this.claves.put(key, c);
        }
        c.getColumnas().clear();
        return c;
    }

    public Columna addColumna(String nombre, Long propiedad) {
        if (StringUtils.isBlank(nombre) || propiedad == null) {
            return null;
        }
        Columna c = null;
        if (propiedad > 0) {
            c = (Columna) this.propiedades.get(propiedad);
            if (c == null) {
                c = addColumna(nombre);
                this.propiedades.put(propiedad, c);
            }
        } else {
            c = addColumna(nombre);
        }
        return c;
    }

    private Columna addColumna(String nombre) {
        Columna nueva = null;
        Columna vieja = (Columna) this.columnas.get(nombre);
        if (vieja == null) {
            nueva = new Columna(nombre);
            this.columnas.put(nombre, nueva);
        } else {
            nueva = addColumna(vieja);
        }
        return nueva;
    }

    private Columna addColumna(Columna vieja) {
        Columna nueva = null;
        int duplicados = vieja.getDuplicados() + 1;
        vieja.setDuplicados(duplicados);
        String _nombre = vieja.getNombre() + "_" + duplicados;
        if (this.columnas.get(_nombre) == null) {
            nueva = new Columna(_nombre);
            this.columnas.put(_nombre, nueva);
        } else {
            nueva = addColumna(vieja);
        }
        return nueva;
    }

    public Columna getColumna(String nombre, Long propiedad) {
        if (StringUtils.isBlank(nombre) || propiedad == null) {
            return null;
        }
        Columna c = (Columna) this.propiedades.get(propiedad);
        if (c == null) {
            c = (Columna) this.columnas.get(nombre);
        }
        return c;
    }
}
