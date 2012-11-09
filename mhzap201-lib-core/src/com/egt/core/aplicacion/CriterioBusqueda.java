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

import com.egt.base.enums.EnumOperadorCom;
import org.apache.commons.lang.StringUtils;

public class CriterioBusqueda {

    public CriterioBusqueda(String columna) {
        init(columna, null, null);
    }

    public CriterioBusqueda(String columna, Object valor) {
        if (valor instanceof EnumOperadorCom) {
            init(columna, (EnumOperadorCom) valor, null);
        } else {
            init(columna, null, valor);
        }
    }

    public CriterioBusqueda(String columna, EnumOperadorCom comparacion, Object valor) {
        init(columna, comparacion, valor);
    }

    private void init(String columna, EnumOperadorCom comparacion, Object valor) {
        if (comparacion == null) {
            this.columna = columna;
            this.comparacion = valor == null ? EnumOperadorCom.ES_NULO : EnumOperadorCom.ES_IGUAL;
            this.valor = valor;
        } else if (EnumOperadorCom.ES_NULO.equals(comparacion) || EnumOperadorCom.NO_ES_NULO.equals(comparacion)) {
            this.columna = columna;
            this.comparacion = comparacion;
            this.valor = null;
        } else {
            this.columna = columna;
            this.comparacion = comparacion;
            this.valor = valor;
        }
    }

    public CriterioBusqueda(String columna, boolean nulo) {
        this.columna = columna;
        this.comparacion = nulo ? EnumOperadorCom.ES_NULO : EnumOperadorCom.NO_ES_NULO;
        this.valor = null;
    }

    public CriterioBusqueda(boolean existe, String expresion) {
        this.columna = null;
        this.comparacion = existe ? EnumOperadorCom.EXISTE : EnumOperadorCom.NO_EXISTE;
        this.valor = expresion;
    }

    /**
     * Conserva el valor de la propiedad columna.
     */
    private String columna = null;

    /**
     * Getter para propiedad columna.
     * @return Valor de la propiedad columna.
     */
    public String getColumna() {
        return this.columna;
    }
//
//  private String getColumna(String dominio) {
//      return StringUtils.isNotBlank(dominio) && StringUtils.isNotBlank(this.columna) && this.columna.indexOf(".") < 0
//              ? dominio.trim() + "." + this.columna : this.columna;
//  }

    /**
     * Setter para propiedad columna.
     * @param columna Nuevo valor de la propiedad columna.
     */
    public void setColumna(String columna) {
        this.columna = columna;
    }

    /**
     * Conserva el valor de la propiedad comparacion.
     */
    private EnumOperadorCom comparacion;

    /**
     * Getter para propiedad operador.
     * @return Valor de la propiedad operador.
     */
    public EnumOperadorCom getComparacion() {
        return this.comparacion;
    }

    /**
     * Setter para propiedad comparacion.
     * @param comparacion Nuevo valor de la propiedad comparacion.
     */
    public void setComparacion(EnumOperadorCom comparacion) {
        this.comparacion = comparacion;
    }

    /**
     * Conserva el valor de la propiedad valor.
     */
    private Object valor = null;

    /**
     * Getter para propiedad valor.
     * @return Valor de la propiedad valor.
     */
    public Object getValor() {
        return this.valor;
    }

    /**
     * Setter para propiedad valor.
     * @param valor Nuevo valor de la propiedad valor.
     */
    public void setValor(Object valor) {
        this.valor = valor;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof CriterioBusqueda) {
            CriterioBusqueda that = (CriterioBusqueda) obj;
            return StringUtils.equals(this.toString(), that.toString());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (this.columna != null ? this.columna.hashCode() : 0);
        hash = 41 * hash + (this.valor != null ? this.valor.hashCode() : 0);
        return hash;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return TLC.getInterpreteSql().getStringCriterioBusqueda(this);
    }

    public String toString(String dominio) {
        return TLC.getInterpreteSql().getStringCriterioBusqueda(this);
    }
}
