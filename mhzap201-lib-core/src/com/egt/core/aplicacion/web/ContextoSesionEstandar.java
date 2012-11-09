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
package com.egt.core.aplicacion.web;

import com.egt.core.control.UsuarioAutenticado;
import com.sun.webui.jsf.component.Breadcrumbs;

public interface ContextoSesionEstandar {

    /**
     * Getter para propiedad usuarioAutenticado.
     * @return Valor de la propiedad usuarioAutenticado.
     */
    public UsuarioAutenticado getUsuarioAutenticado();

    /**
     * Getter para propiedad botonAccionRetorno.
     * @return Valor de la propiedad botonAccionRetorno.
     */
    public String getBotonAccionRetorno();

    /**
     * Getter para propiedad campoAccionRetorno.
     * @return Valor de la propiedad campoAccionRetorno.
     */
    public String getCampoAccionRetorno();

    /**
     * Getter para propiedad opcionCampoRetorno.
     * @return Valor de la propiedad opcionCampoRetorno.
     */
    public String getOpcionCampoRetorno();

    /**
     * Getter para propiedad versionComandoSelectPagina.
     * @param pagina Nombre del bean de la pagina
     * @return Valor de la propiedad versionComandoSelectPagina.
     */
    public long getVersionComandoSelectPagina(String pagina);

    /**
     * Setter para propiedad versionComandoSelectPagina.
     * @param pagina Nombre del bean de la pagina
     * @param version Nuevo valor de la propiedad versionComandoSelectPagina.
     */
    public void setVersionComandoSelectPagina(String pagina, long version);

    /**
     * Getter para propiedad columnaIdentificacionRecursoMaestroPagina.
     * @param pagina Nombre del bean de la pagina
     * @return Valor de la propiedad columnaIdentificacionRecursoMaestroPagina.
     */
    public String getColumnaIdentificacionRecursoMaestroPagina(String pagina);

    /**
     * Setter para propiedad columnaIdentificacionRecursoMaestroPagina.
     * @param pagina Nombre del bean de la pagina
     * @param columna Nuevo valor de la propiedad columnaIdentificacionRecursoMaestroPagina.
     */
    public void setColumnaIdentificacionRecursoMaestroPagina(String pagina, String columna);

    /**
     * Getter para propiedad identificacionRecursoMaestroPagina.
     * @param pagina Nombre del bean de la pagina
     * @return Valor de la propiedad identificacionRecursoMaestroPagina.
     */
    public Long getIdentificacionRecursoMaestroPagina(String pagina);

    /**
     * Setter para propiedad identificacionRecursoMaestroPagina.
     * @param pagina Nombre del bean de la pagina
     * @param identificacion Nuevo valor de la propiedad identificacionRecursoMaestroPagina.
     */
    public void setIdentificacionRecursoMaestroPagina(String pagina, Long identificacion);

    /**
     * Getter para propiedad IdentificacionFuncionAccionPagina.
     * @param pagina Nombre del bean de la pagina
     * @return Valor de la propiedad IdentificacionFuncionAccionPagina.
     */
    public Long getIdentificacionFuncionAccionPagina(String pagina);

    /**
     * Setter para propiedad IdentificacionFuncionAccionPagina.
     * @param pagina Nombre del bean de la pagina
     * @param funcion Nuevo valor de la propiedad IdentificacionFuncionAccionPagina.
     */
    public void setIdentificacionFuncionAccionPagina(String pagina, Long funcion);

    /**
     * Getter para propiedad migasPan.
     * @return Valor de la propiedad migasPan.
     */
    public Breadcrumbs getMigas();
}
