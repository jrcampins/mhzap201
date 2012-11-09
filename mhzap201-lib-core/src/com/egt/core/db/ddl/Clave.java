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

import com.egt.commons.util.BitUtils;
import com.egt.commons.util.IntUtils;
import com.egt.core.util.STP;
import java.util.LinkedHashMap;

public class Clave {

    public Clave(String nombre, Integer tipo) {
        this.setIdentificacion(STP.getRandomString(20).toLowerCase());
        this.setNombre(nombre);
        this.setTipo(tipo);
        this.setNombreTablaReferenciada(null);
        this.setNombreColumnasReferenciadas(null);
        this.setReglaDelete(null);
        this.setReglaUpdate(null);
        this.setSincronizada(IntUtils.FALSE);
        this.columnas = new LinkedHashMap();
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
     * Conserva el valor de la propiedad tipo.
     */
    private Integer tipo;

    /**
     * Getter para propiedad tipo.
     * @return Valor de la propiedad tipo.
     */
    public Integer getTipo() {
        return this.tipo;
    }

    /**
     * Setter para propiedad tipo.
     * @param tipo Nuevo valor de la propiedad tipo.
     */
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    /**
     * Conserva el valor de la propiedad nombreTablaReferenciada.
     */
    private String nombreTablaReferenciada;

    /**
     * Getter para propiedad nombreTablaReferenciada.
     * @return Valor de la propiedad nombreTablaReferenciada.
     */
    public String getNombreTablaReferenciada() {
        return this.nombreTablaReferenciada;
    }

    /**
     * Setter para propiedad nombreTablaReferenciada.
     * @param nombreTablaReferenciada Nuevo valor de la propiedad nombreTablaReferenciada.
     */
    public void setNombreTablaReferenciada(String nombreTablaReferenciada) {
        this.nombreTablaReferenciada = nombreTablaReferenciada;
    }

    /**
     * Conserva el valor de la propiedad nombreColumnasReferenciadas.
     */
    private String nombreColumnasReferenciadas;

    /**
     * Getter para propiedad nombreColumnasReferenciadas.
     * @return Valor de la propiedad nombreColumnasReferenciadas.
     */
    public String getNombreColumnasReferenciadas() {
        if (this.nombreColumnasReferenciadas == null) {
            String refname;
            String prefix1 = "objeto_";
            String prefix2 = "lista_valor_";
            if (this.nombreTablaReferenciada.startsWith(prefix1)) {
                refname = this.nombreTablaReferenciada.substring(prefix1.length());
            } else if (this.nombreTablaReferenciada.startsWith(prefix2)) {
                refname = this.nombreTablaReferenciada.substring(prefix2.length());
            } else {
                refname = this.nombreTablaReferenciada;
            }
            this.nombreColumnasReferenciadas = "id_" + refname.toLowerCase();
        }
        return this.nombreColumnasReferenciadas;
    }

    /**
     * Setter para propiedad nombreColumnasReferenciadas.
     * @param nombreColumnasReferenciadas Nuevo valor de la propiedad nombreColumnasReferenciadas.
     */
    public void setNombreColumnasReferenciadas(String nombreColumnasReferenciadas) {
        this.nombreColumnasReferenciadas = nombreColumnasReferenciadas;
    }

    /**
     * Conserva el valor de la propiedad reglaDelete.
     */
    private String reglaDelete;

    /**
     * Getter para propiedad reglaDelete.
     * @return Valor de la propiedad reglaDelete.
     */
    public String getReglaDelete() {

        return this.reglaDelete;
    }

    /**
     * Setter para propiedad reglaDelete.
     * @param reglaDelete Nuevo valor de la propiedad reglaDelete.
     */
    public void setReglaDelete(String reglaDelete) {
        this.reglaDelete = reglaDelete;
    }

    /**
     * Conserva el valor de la propiedad reglaUpdate.
     */
    private String reglaUpdate;

    /**
     * Getter para propiedad reglaUpdate.
     * @return Valor de la propiedad reglaUpdate.
     */
    public String getReglaUpdate() {
        return this.reglaUpdate;
    }

    /**
     * Setter para propiedad reglaUpdate.
     * @param reglaUpdate Nuevo valor de la propiedad reglaUpdate.
     */
    public void setReglaUpdate(String reglaUpdate) {
        this.reglaUpdate = reglaUpdate;
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

    public Columna addColumna(Columna c) {
        if (c == null) {
            return null;
        }
        String columna = c.getNombre();
        if (this.columnas.get(columna) == null) {
            this.columnas.put(columna, c);
            if (BitUtils.valueOf(c.getSincronizada())) {
                this.setSincronizada(IntUtils.TRUE);
            }
        }
        return c;
    }
}
