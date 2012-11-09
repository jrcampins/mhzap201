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

import com.egt.core.util.STP;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;

public class ListaParametros {

    LinkedHashSet parametros = new LinkedHashSet();

    private class ParametroPeticion {

        private String clave = null;

        private String valor = null;

        /** Creates a new instance of ParametroPeticion */
        public ParametroPeticion(String clave, String valor) {
            setClave(clave);
            setValor(valor);
        }

        /**
         * Setter para propiedad clave.
         * 
         * @param clave
         *            Nuevo valor de la propiedad clave.
         */
        public void setClave(String clave) {
            this.clave = clave;
        }

        /**
         * Getter para propiedad clave.
         * 
         * @return Valor de la propiedad clave.
         */
        public String getClave() {
            return clave;
        }

        /**
         * Setter para propiedad valor.
         * 
         * @param valor
         *            Nuevo valor de la propiedad valor.
         */
        public void setValor(String valor) {
            this.valor = valor;
        }

        /**
         * Getter para propiedad valor.
         * 
         * @return Valor de la propiedad valor.
         */
        public String getValor() {
            return valor;
        }

        @Override
        public String toString() {
            return getClave() + "=" + StringEscapeUtils.escapeJavaScript(getValor()).replace("%", "*");
        }
    }

    public void clear() {
        parametros.clear();
    }

    public void addParametro(String clave, Object valor) {
        if (clave != null) {
            valor = STP.getString(valor);
            if (valor == null) {
                valor = StringUtils.EMPTY;
            }
            ParametroPeticion parametro = new ParametroPeticion(clave, (String) valor);
            parametros.add(parametro);
        }
    }

    @Override
    public String toString() {
        String lista = StringUtils.EMPTY;
        String parametro = null;
        Iterator iterator = parametros.iterator();
        while (iterator.hasNext()) {
            parametro = ((ParametroPeticion) iterator.next()).toString();
            if (parametro != null) {
                lista += "&" + parametro;
            }
        }
        if (lista.startsWith("&")) {
            lista = "?" + lista.substring(1);
        }
        return lista;
    }
}
